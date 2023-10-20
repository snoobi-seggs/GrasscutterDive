package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.*;
import emu.grasscutter.net.proto.AllWidgetDataNotifyOuterClass.AllWidgetDataNotify;
import java.util.List;

public class PacketAllWidgetDataNotify extends BasePacket {

    public PacketAllWidgetDataNotify(Player player) {
        super(PacketOpcodes.AllWidgetDataNotify);

        // TODO: Implement this

        AllWidgetDataNotify.Builder proto =
                AllWidgetDataNotify.newBuilder()
                        // If you want to implement this, feel free to do so. :)
                        .setLunchBoxData(LunchBoxDataOuterClass.LunchBoxData.newBuilder().build())
                        // Maybe it's a little difficult, or it makes you upset :(
                        .addAllOneoffGatherPointDetectorDataList(List.of())
                        // So, goodbye, and hopefully sometime in the future o(*￣▽￣*)ブ
                        .addAllCoolDownGroupDataList(List.of())
                        // I'll see your PR with a title that says (・∀・(・∀・(・∀・*)
                        .addAllAnchorPointList(List.of())
                        // "Complete implementation of widget functionality" b（￣▽￣）d
                        .addAllClientCollectorDataList(List.of())
                        // Good luck, my boy.
                        .addAllNormalCoolDownDataList(List.of());

        if (player.getWidgetId()
                == 0) { // TODO: check this logic later, it was null-checking an int before which made it
            // dead code
            proto.addAllSlotList(List.of());
        } else {
            proto.addSlotList(
                    WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
                            .setIsActive(true)
                            .setMaterialId(player.getWidgetId())
                            .build());
            // attach pet (220014, 220015, 220016, 220023, 220038, 220045, 220062, 220074, 220079)
            proto.addSlotList(
                    WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
                            .setTag(WidgetSlotTagOuterClass.WidgetSlotTag.WIDGET_SLOT_TAG_ATTACH_AVATAR)
                            .setIsActive(true)
                            .setMaterialId(player.getWidgetId())
                            .build());
        }
        
        // 4.0 only
        //proto.setHALAOGOBMKJ(1); // either activeWidgetId OR activeQuickSwapSlotId
        //proto.addAllEMPBLGKLCOA(List.of(player.getWidgetId(),220044,220051,220025)); // test 4 quick swap list
        //proto.setNNPMMJCEJAO(EPIAFADAJANOuterClass.EPIAFADAJAN.newBuilder()
        //                        .setPos(VectorOuterClass.Vector.newBuilder().setX(0).setY(0).setZ(0))
        //                        .setRot(VectorOuterClass.Vector.newBuilder().setX(0).setY(0).setZ(0))
        //                        .setState(DIIHAAGDDJKOuterClass.DIIHAAGDDJK.DIIHAAGDDJK_WispCageStateNotTakeReward)
        //                        .setSceneId(3)
        //                        .setGadgetEntityId(67108910)
        //                        .setGIMDMFFKJKK(70500059)
        //                        .build()); // crystalfly trap 220088
        proto.addCoolDownGroupDataList(WidgetCoolDownDataOuterClass.WidgetCoolDownData.newBuilder()
                                        .setId(36)
                                        .setCoolDownTime((int) 1697495525547L)
                                        .setIsSuccess(true)
                                        .build()); //sorush
        proto.addCoolDownGroupDataList(WidgetCoolDownDataOuterClass.WidgetCoolDownData.newBuilder()
                                        .setId(16)
                                        .setCoolDownTime((int) 1697495525547L)
                                        .setIsSuccess(true)
                                        .build()); //wind-blessed harpestum

        AllWidgetDataNotify protoData = proto.build();

        this.setData(protoData);
    }
}
