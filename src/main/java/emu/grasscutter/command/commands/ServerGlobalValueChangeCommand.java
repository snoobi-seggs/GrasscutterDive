package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.command.Command.TargetRequirement;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.packet.send.PacketServerGlobalValueChangeNotify;
import emu.grasscutter.utils.Utils;
import emu.grasscutter.game.world.Scene;

import java.util.*;

@Command(label = "sgvc",
		 usage = "/sgvc [entityId/type] [stringKey] [valueFloat]\n\ndescription: sgvc certain entityids",
		 aliases = {"sgvc","serverglobalvaluechange"},
		 permission = "player.spawn",
		 permissionTargeted = "player.spawn.others",
		 targetRequirement = TargetRequirement.ONLINE)
public final class ServerGlobalValueChangeCommand implements CommandHandler {
	
	
	@Override
	public void execute(Player sender, Player targetPlayer, List<String> args) {
		int entityId = 0;
		String key = "";
		float value = 0f;
		String type = "";
		
		if (targetPlayer == null) {
			targetPlayer = sender;
		}
		
		switch (args.size()) {
			case 3:
				try {
					value = Float.parseFloat(args.get(2));
				} catch (NumberFormatException e) {
					//none
				}
            case 2:
                key = args.get(1);
				try {
					entityId = Integer.parseInt(args.get(0));
				} catch (NumberFormatException e) {
					type = args.get(0);
				}
				break;
            default:
                CommandHandler.sendMessage(sender,"wrong parems u fuck");
				return;
        }
		
		if (!type.equals("")) {
			Scene sceneF = targetPlayer.getScene();
			List<GameEntity> toChange = new ArrayList<>();
			if (type.equals("gadget") || type.equals("g") || type.equals("gt")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> entity instanceof EntityGadget)
						.toList();
			} else if (type.equals("avatar") || type.equals("a") || type.equals("ava")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> entity instanceof EntityAvatar)
						.toList();
				CommandHandler.sendMessage(targetPlayer,"your character was killed, relogin to respawn coz /h wont work");
			} else if (type.equals("clientgadget") || type.equals("cg") || type.equals("cgadget")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> entity instanceof EntityClientGadget)
						.toList();
			} else if (type.equals("item") || type.equals("i") || type.equals("itm")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> entity instanceof EntityItem)
						.toList();
			} else if (type.equals("monster") || type.equals("mons") || type.equals("m")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> entity instanceof EntityMonster)
						.toList();
			} else if (type.equals("npc")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> entity instanceof EntityNPC)
						.toList();
			} else if (type.equals("region") || type.equals("r") || type.equals("reg")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> entity instanceof EntityRegion)
						.toList();
			} else if (type.equals("vehicle") || type.equals("v") || type.equals("vhc")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> entity instanceof EntityVehicle)
						.toList();
			} else if (type.equals("all")) {
				toChange = sceneF.getEntities().values().stream()
						.filter(entity -> (entity instanceof GameEntity && !(entity instanceof EntityAvatar)))
						.toList();
				CommandHandler.sendMessage(targetPlayer,"your character was killed, relogin to respawn coz /h wont work");
			} else {
				CommandHandler.sendMessage(sender,"this parem does not exist");
				return;
			}
			
			for (GameEntity entity : toChange) {
				sceneF.broadcastPacket(new PacketServerGlobalValueChangeNotify(entity.getId(), value, Utils.abilityHash(key)));
			}
			
		}
		
		PacketServerGlobalValueChangeNotify packet = new PacketServerGlobalValueChangeNotify(entityId, value, Utils.abilityHash(key));
		targetPlayer.getScene().broadcastPacket(packet);
	}
}
