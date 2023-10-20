package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.*;

public class PacketWidgetUseAttachAbilityGroupChangeNotify extends BasePacket {

    public PacketWidgetUseAttachAbilityGroupChangeNotify(int materialId, boolean isAttach) {
        super(PacketOpcodes.WidgetUseAttachAbilityGroupChangeNotify);

        WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify proto =
                WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.newBuilder()
                        .setIsAttach(isAttach)
                        .setMaterialId(materialId)
                        .build();

        this.setData(proto);
    }
}
