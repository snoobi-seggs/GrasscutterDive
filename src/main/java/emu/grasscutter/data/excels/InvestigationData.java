package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@ResourceType(name = "InvestigationConfigData.json", loadPriority = ResourceType.LoadPriority.HIGH)
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InvestigationData extends GameResource {
    @Getter(onMethod = @__(@Override))
	int id; //main id
    int cityId;
	List<Integer> nextInvestigationIdList;
	String unlockOpenStateType;
	int rewardId;
	long titleTextMapHash;
	String investigationType; //HOMEWORLD EDCATION GCG

    @Override
    public void onLoad() {
        //none
    }
}