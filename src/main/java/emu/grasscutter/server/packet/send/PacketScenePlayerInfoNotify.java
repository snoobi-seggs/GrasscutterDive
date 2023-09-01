package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.World;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo;
import emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture;
import emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify;
import emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo;

public class PacketScenePlayerInfoNotify extends BasePacket {

    public PacketScenePlayerInfoNotify(World world) {
        super(PacketOpcodes.ScenePlayerInfoNotify);

        ScenePlayerInfoNotify.Builder proto = ScenePlayerInfoNotify.newBuilder();

        for (int i = 0; i < world.getPlayers().size(); i++) {
            Player p = world.getPlayers().get(i);

            ScenePlayerInfo pInfo =
                    ScenePlayerInfo.newBuilder()
                            .setUid(p.getUid())
                            .setPeerId(p.getPeerId())
                            .setName(p.getNickname())
                            .setSceneId(p.getSceneId())
                            .setOnlinePlayerInfo(p.getOnlinePlayerInfo())
                            .build();

            proto.addPlayerInfoList(pInfo);
        }

        this.setData(proto.build());
    }
	
	// TEST COMMAND
	public PacketScenePlayerInfoNotify(World world, boolean isTestCommand) {
        super(PacketOpcodes.ScenePlayerInfoNotify);

        ScenePlayerInfoNotify.Builder proto = ScenePlayerInfoNotify.newBuilder();
		
		Player p = null;

        for (int i = 0; i < world.getPlayers().size(); i++) {
            p = world.getPlayers().get(i);

            ScenePlayerInfo pInfo =
                    ScenePlayerInfo.newBuilder()
                            .setUid(p.getUid())
                            .setPeerId(p.getPeerId())
                            .setName(p.getNickname())
                            .setSceneId(p.getSceneId())
                            .setOnlinePlayerInfo(p.getOnlinePlayerInfo())
                            .build();

            proto.addPlayerInfoList(pInfo);
        }
		
		// add musik bot
		ScenePlayerInfo pInfo = ScenePlayerInfo.newBuilder()
                            .setUid(69420)
                            .setPeerId(p.getPeerId()+1)
                            .setName("music")
                            .setSceneId(p.getSceneId())
                            .setOnlinePlayerInfo(OnlinePlayerInfo.newBuilder()
													.setUid(69420)
													.setNickname("music")
													.setPlayerLevel(60)
													.setMpSettingType(p.getMpSetting())
													.setNameCardId(p.getNameCardId())
													.setSignature("lemme play musik 4 u __( T w T   )/")
													.setProfilePicture(ProfilePicture.newBuilder().setAvatarId(p.getHeadImage()))
													.setCurPlayerNumInWorld(p.getWorld().getPlayerCount()+1))
                            .build();
		proto.addPlayerInfoList(pInfo);

        this.setData(proto.build());
    }
}
