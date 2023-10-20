package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.QuickUseWidgetRspOuterClass.QuickUseWidgetRsp;

public class PacketQuickUseWidgetRsp extends BasePacket {

    public PacketQuickUseWidgetRsp(int materialId) {
        super(PacketOpcodes.QuickUseWidgetRsp);
        this.setData(QuickUseWidgetRsp.newBuilder().setMaterialId(materialId).build());
    }
}
