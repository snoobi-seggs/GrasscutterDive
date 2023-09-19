package emu.grasscutter.server.packet.recv;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.EvtAiSyncCombatThreatInfoNotifyOuterClass.EvtAiSyncCombatThreatInfoNotify;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.EvtAiSyncCombatThreatInfoNotify)
public class HandlerEvtAiSyncCombatThreatInfoNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        //EvtAiSyncCombatThreatInfoNotify notify = EvtAiSyncCombatThreatInfoNotify.parseFrom(payload);
        //Grasscutter.getLogger().warn(notify.toString());
    }
}
