package emu.grasscutter.server.packet.send;

import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify;
import java.util.Set;

public class PacketSceneDataNotify extends BasePacket {

    public PacketSceneDataNotify(Player player) {
        super(PacketOpcodes.SceneDataNotify);

        SceneDataNotify.Builder proto = SceneDataNotify.newBuilder();

        if (player.getScene().getDungeonManager() != null) {
            var map = GameData.getDungeonLevelEntityConfigDataMap();
			Set<String> levelConfigIds = player.getScene().getDungeonManager().getDungeonData().getLevelConfigMap().keySet();
            for (String levelConfigId : levelConfigIds) {
                proto.addLevelConfigNameList(map.get(Integer.parseInt(levelConfigId))
												   .getLevelConfigName());
            }
        }

        this.setData(proto);
    }
}
