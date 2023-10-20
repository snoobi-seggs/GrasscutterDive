package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.*;

public class PacketWidgetActiveChangeNotify extends BasePacket {
    public PacketWidgetActiveChangeNotify(int materialId) {
        super(PacketOpcodes.WidgetActiveChangeNotify);

        WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify proto =
                WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify.newBuilder()
                        .addWidgetDataList(
                                WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
                                        .setIsActive(true)
                                        .setMaterialId(materialId)
                                        .build())
                        .build();

        this.setData(proto);
    }
}
