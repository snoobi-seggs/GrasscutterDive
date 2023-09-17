package emu.grasscutter.data.excels.dungeon;

import emu.grasscutter.data.*;
import emu.grasscutter.data.excels.RewardPreviewData;
import emu.grasscutter.game.dungeons.enums.*;
import emu.grasscutter.game.world.Position;
import emu.grasscutter.scripts.data.SceneMeta;
import java.util.List;
import lombok.Getter;

@ResourceType(name = "DungeonLevelEntityConfigData.json")
public class DungeonLevelEntityConfigData extends GameResource {

    @Getter(onMethod_ = @Override)
    private int id;
    @Getter private int clientId;
    @Getter private String levelConfigName;

    @Override
    public void onLoad() {}
}
