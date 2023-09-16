package emu.grasscutter.data.binout.config;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.binout.config.fields.ConfigAbilityData;
import java.util.List;
import lombok.Getter;

public class ConfigLevelEntity {

    @Getter private List<ConfigAbilityData> abilities;
    @Getter private List<ConfigAbilityData> monsterAbilities;
    @Getter private List<ConfigAbilityData> avatarAbilities;
    @Getter private List<ConfigAbilityData> teamAbilities;
	
    @SerializedName(value = "preloadMonsterEntityIDs", alternate = {"IIONECKNJED"})
    @Getter private List<Integer> preloadMonsterEntityIDs;

    @Getter private String dropElemControlType;
}
