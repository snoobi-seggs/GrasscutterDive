package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.CutSceneEndNotifyOuterClass.CutSceneEndNotify;

public class PacketCutSceneEndNotify extends BasePacket {

    public PacketCutSceneEndNotify(int cutsceneId) {
        super(PacketOpcodes.CutSceneEndNotify);

        this.setData(CutSceneEndNotify.newBuilder().setCutsceneId(cutsceneId));
    }
}
