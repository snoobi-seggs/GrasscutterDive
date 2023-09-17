package emu.grasscutter.server.packet.send;

import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.DungeonDataNotifyOuterClass.DungeonDataNotify;
import java.util.Set;

public class PacketDungeonDataNotify extends BasePacket {

    public PacketDungeonDataNotify(Player player) {
        super(PacketOpcodes.DungeonDataNotify);

        DungeonDataNotify.Builder proto = DungeonDataNotify.newBuilder();

        if (player.getScene().getDungeonManager() != null) {
            Set<String> levelConfigIds = player.getScene().getDungeonManager().getDungeonData().getLevelConfigMap().keySet();
            if (levelConfigIds.size() > 0) {
                for (String levelConfigId : levelConfigIds) {
                    proto.putDungeonDataMap(3, Integer.parseInt(levelConfigId));
                }
            }
        }

        this.setData(proto);
    }
}
