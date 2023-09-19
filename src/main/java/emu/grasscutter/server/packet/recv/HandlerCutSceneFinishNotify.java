package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketCutSceneEndNotify;

@Opcodes(PacketOpcodes.CutSceneFinishNotify)
public class HandlerCutSceneFinishNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {

        CutSceneFinishNotify req = CutSceneFinishNotify.parseFrom(payload);

        session.send(new PacketCutSceneEndNotify(req.getCutsceneId()));
    }
}
