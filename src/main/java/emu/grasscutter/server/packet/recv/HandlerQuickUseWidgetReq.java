package emu.grasscutter.server.packet.recv;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.inventory.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.Position;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.QuickUseWidgetReqOuterClass.QuickUseWidgetReq;
import emu.grasscutter.net.proto.QuickUseWidgetRspOuterClass.QuickUseWidgetRsp;
import emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType;
import emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.*;

@Opcodes(PacketOpcodes.QuickUseWidgetReq)
public class HandlerQuickUseWidgetReq extends PacketHandler {
    /*
     * WARNING: with the consuming of material widget ( Example: bomb ),
     * this is just a implement designed to the decreasing of count
     *
     * ### Known Bug: No effects after using item but decrease. ###
     *
     * If you know which Packet could make the effects, feel free to contribute!
     * */
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        // DEBUG
        QuickUseWidgetReq req = QuickUseWidgetReq.parseFrom(payload);
        Grasscutter.getLogger().warn(req.toString());
        if (req.hasSorushInfo()) {
            Player player = session.getPlayer();
            int vehicleId = 45002002;
            int pointId = 0;
            Position pos = new Position(req.getSorushInfo().getPos());
            Position rot = new Position(req.getSorushInfo().getRot());

            //KILL PREVIOUS Sorush and remove buff if any
            var toKill = player.getScene().getEntities().values().stream()
                                        .filter(entity -> entity instanceof EntityVehicle
                                                            && ((EntityVehicle) entity).getGadgetId() == vehicleId
                                                            && ((EntityVehicle) entity).getOwner().equals(player))
                                        .toList();
            player.getBuffManager().removeBuff(600301); //sorush buff remove if have                            
            if (toKill.size() > 0) {
                toKill.forEach(entity -> {
                    player.getStaminaManager().handleVehicleInteractReq(session, entity.getId(), VehicleInteractType.VEHICLE_INTERACT_TYPE_OUT); // register in stamina handler
                    session.send(new PacketVehicleInteractRsp(player, entity.getId(), VehicleInteractType.VEHICLE_INTERACT_TYPE_OUT)); // force player out
                    player.getScene().killEntity(entity, 0);
                });
            }
            
            //CREATE SORUSH VEHICLE
            EntityVehicle vehicle = new EntityVehicle(player.getScene(), player, vehicleId, pointId, pos, rot);
            player.getScene().addEntity(vehicle);
            //session.send(new PacketWidgetGadgetDataNotify(vehicleId, vehicle.getId())); // same as firework
            //session.send(new PacketGadgetStateNotify(vehicle, 401)); // OR 401, 903
            session.send(new PacketServerGlobalValueChangeNotify(vehicle, "_ABILITY_Sorush_isHost_Mark", 1f));
            session.send(new PacketServerGlobalValueChangeNotify(vehicle, "_ABILITY_Sorush_ChargeSkillValue", 1f));
            session.send(new PacketServerGlobalValueChangeNotify(vehicle, "_ABILITY_Sorush_Hovering_Mark", 1f));

            //FORCE SEND Sorush Vehicle Create
            //session.send(new PacketCreateVehicleRsp(vehicleId, vehicle.getId()));

            //SEND active change & CD Packet
            session.send(new PacketWidgetUseAttachAbilityGroupChangeNotify(220079, true)); // TEST
            session.send(new PacketWidgetCoolDownNotify(36, System.currentTimeMillis() + 3000L, true)); //notify client when can use again

            //SEND RSP PACKET (SENT EARLY)
            session.send(new PacketQuickUseWidgetRsp(220079));

            //FORCE CLIENT note that vehicle is CURR_AVATAR's
            //session.send(new PacketSceneEntityUpdateNotify(player.getTeamManager().getCurrentAvatarEntity(), VisionType.VISION_TYPE_REFRESH, 0)); // test (remove EntityAvatar sorush section onDelete)

            //FORCE Enter Sorush
            player.getBuffManager().addBuff(600301); //sorush buff
            session.getPlayer().getStaminaManager().handleVehicleInteractReq(session, vehicle.getId(), VehicleInteractType.VEHICLE_INTERACT_TYPE_IN); // register in stamina handler
            session.send(new PacketVehicleInteractRsp(player, vehicle.getId(), VehicleInteractType.VEHICLE_INTERACT_TYPE_IN)); // force player in
            
            //SGVC (TEST)
            session.send(new PacketServerGlobalValueChangeNotify(vehicle, "_ABILITY_Sorush_AvatarIn_Mark", 1f));
            //session.send(new PacketServerGlobalValueChangeNotify(vehicle, "_ABILITY_Avatar_InSorush_Mark", 1f));
            //session.send(new PacketServerGlobalValueChangeNotify(vehicle, "_ABILITY_Sorush_Hovering_Mark", 1f));
            
            //UPDATE active (TEST)
            //session.send(new PacketWidgetActiveChangeNotify(220079));
            
            Grasscutter.getLogger().warn("USED SORUSH 220079");
            return;
        } else if (session.getPlayer().getWidgetId() == 220027) {
            session.send(new PacketWidgetUseAttachAbilityGroupChangeNotify(220027, true)); // TEST
            session.send(new PacketWidgetCoolDownNotify(16, System.currentTimeMillis() + 2000L, true)); //notify client when can use again
            //ability change notify with add 3 hashes here
            session.send(new PacketQuickUseWidgetRsp(220027));
            Grasscutter.getLogger().warn("Used Wind-Blessed harpestum");
            return;
        }
        
        QuickUseWidgetRsp.Builder proto = QuickUseWidgetRsp.newBuilder();
        Player pl = session.getPlayer();
        synchronized (pl) {
            int materialId = pl.getWidgetId();
            Inventory inventory = session.getPlayer().getInventory();
            InventoryTab inventoryTab = inventory.getInventoryTab(ItemType.ITEM_MATERIAL);
            GameItem item = inventoryTab.getItemById(materialId);
            int remain = item.getCount();
            if (remain > 0) {
                //remain--;
                if (remain <= 0) {
                    proto.setRetcode(1);
                } else {
                    proto.setRetcode(0);
                }
                proto.setMaterialId(materialId);
                //inventory.removeItem(item, 1); // decrease count
                BasePacket rsp = new BasePacket(PacketOpcodes.QuickUseWidgetRsp);
                rsp.setData(proto);
                session.send(rsp);
                Grasscutter.getLogger().warn("class has no effects in the game, feel free to implement it");
                // but no effects in the game, feel free to implement it!
            }
        }
    }
}
