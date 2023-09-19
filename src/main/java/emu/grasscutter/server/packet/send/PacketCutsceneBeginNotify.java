package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify;

public class PacketCutsceneBeginNotify extends BasePacket {

    public PacketCutsceneBeginNotify(int cutsceneId) {
        super(PacketOpcodes.CutSceneBeginNotify);

        this.setData(CutSceneBeginNotify.newBuilder().setCutsceneId(cutsceneId));
    }
    
    public PacketCutsceneBeginNotify(int cutsceneId, boolean isWaitOthers) {
        super(PacketOpcodes.CutSceneBeginNotify);

        this.setData(CutSceneBeginNotify.newBuilder().setCutsceneId(cutsceneId).setIsWaitOthers(isWaitOthers));
    }
}
