package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify;

public class PacketSceneAreaWeatherNotify extends BasePacket {

    public PacketSceneAreaWeatherNotify(Player player) {
		this(player, 0f);
	}
		
	public PacketSceneAreaWeatherNotify(Player player, float transDuration) {
        super(PacketOpcodes.SceneAreaWeatherNotify);

        SceneAreaWeatherNotify proto =
                SceneAreaWeatherNotify.newBuilder()
                        .setWeatherAreaId(player.getWeatherId())
                        .setClimateType(player.getClimate().getValue())
						.setTransDuration(transDuration)
                        .build();

        this.setData(proto);
    }
}
