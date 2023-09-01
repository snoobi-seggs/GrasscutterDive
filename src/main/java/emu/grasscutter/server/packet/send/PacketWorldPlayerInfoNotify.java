package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.World;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture;
import emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo;
import emu.grasscutter.net.proto.WorldPlayerInfoNotifyOuterClass.WorldPlayerInfoNotify;

public class PacketWorldPlayerInfoNotify extends BasePacket {

    public PacketWorldPlayerInfoNotify(World world) {
        super(PacketOpcodes.WorldPlayerInfoNotify);

        WorldPlayerInfoNotify.Builder proto = WorldPlayerInfoNotify.newBuilder();

        for (int i = 0; i < world.getPlayers().size(); i++) {
            Player p = world.getPlayers().get(i);

            proto.addPlayerInfoList(p.getOnlinePlayerInfo());
            proto.addPlayerUidList(p.getUid());
        }

        this.setData(proto.build());
    }
	
	// test command
	public PacketWorldPlayerInfoNotify(Player player) {
		super(PacketOpcodes.WorldPlayerInfoNotify);
		
		World world = player.getWorld();

        WorldPlayerInfoNotify.Builder proto = WorldPlayerInfoNotify.newBuilder();

        for (int i = 0; i < world.getPlayers().size(); i++) {
            Player p = world.getPlayers().get(i);

            proto.addPlayerInfoList(p.getOnlinePlayerInfo());
            proto.addPlayerUidList(p.getUid());
        }
		
		// add musik bot
		proto.addPlayerInfoList(OnlinePlayerInfo.newBuilder()
									.setUid(69420)
									.setNickname("music")
									.setPlayerLevel(60)
									.setMpSettingType(player.getMpSetting())
									.setNameCardId(player.getNameCardId())
									.setSignature("lemme play musik 4 u __( T w T   )/")
									.setProfilePicture(ProfilePicture.newBuilder().setAvatarId(player.getHeadImage()))
									.setCurPlayerNumInWorld(player.getWorld().getPlayerCount() + 1));
        proto.addPlayerUidList(69420);

        this.setData(proto.build());
	}
}
