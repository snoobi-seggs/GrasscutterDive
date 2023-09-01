package emu.grasscutter.data.excels;

import emu.grasscutter.data.excels.InvestigationData;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@ResourceType(name = "InvestigationTargetConfigData.json", loadPriority = ResourceType.LoadPriority.LOW)
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InvestigationTargetData extends GameResource {
    @Getter(onMethod = @__(@Override))
	int id; //main id
    int questId;
    int investigationId;
	int rewardId;
	String icon;
	String image;
	long infoDesTextMapHash;
	Guide guide;
	TriggerConfig triggerConfig;
	int progress; //max progress
	
	//not in actual res
	InvestigationData investigationData;
	
	//just like in quest excels
	public class Guide {
		String type; //QUEST_GUIDE_LOCATION
		List<String> param;
		int guideScene; //3
		String guideStyle;
		String guideLayer;
	}
	
	public class TriggerConfig {
		String triggerType; //TRIGGER_MONSTER_DIE
		List<String> paramList; //.size is 3 
	}

    @Override
    public void onLoad() {
        this.investigationData = GameData.getInvestigationDataMap().get(investigationId);
    }
}