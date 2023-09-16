package emu.grasscutter.game.gcg;

import emu.grasscutter.data.GameData;
import emu.grasscutter.game.entity.EntityTeam;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.game.world.World;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.proto.ChatInfoOuterClass;
import emu.grasscutter.server.game.GameServer;
import emu.grasscutter.server.packet.send.PacketDelTeamEntityNotify;
import emu.grasscutter.server.packet.send.PacketPlayerChatNotify;
import emu.grasscutter.server.packet.send.PacketPlayerGameTimeNotify;
import java.util.*;
import lombok.Getter;

public class GcgWorld extends World {
    //@Getter private final GameHome home;
    //@Getter private Map<Integer ,GcgManager> gcgManagerMap;

    public GcgWorld(GameServer server, Player owner) {
        super(server, owner);

        // Add Player's GCG Manager to map for later ref by uid key
        //this.gcgManagerMap.put(this.getOwnerUid() , owner.isOnline() ? owner.getGcgManager() : GcgManager.getByUid(owner.getUid()));
        server.registerGcgWorld(this);
        //this.refreshGcgManager();
    }
	
	public int getOwnerUid() {
        return this.getHost().getUid();
    }
}