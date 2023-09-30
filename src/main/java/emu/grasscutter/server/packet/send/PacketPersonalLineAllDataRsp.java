package emu.grasscutter.server.packet.send;

import emu.grasscutter.data.GameData;
import emu.grasscutter.game.quest.*;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.PersonalLineAllDataRspOuterClass;
import emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData;
import java.util.*;
import java.util.stream.Collectors;

public class PacketPersonalLineAllDataRsp extends BasePacket {

    public PacketPersonalLineAllDataRsp(Collection<GameMainQuest> gameMainQuestList) {
        super(PacketOpcodes.PersonalLineAllDataRsp);

        var proto = PersonalLineAllDataRspOuterClass.PersonalLineAllDataRsp.newBuilder();

        var questList =
                gameMainQuestList.stream()
                        .map(GameMainQuest::getChildQuests)
                        .map(Map::values)
                        .flatMap(Collection::stream)
                        .map(GameQuest::getSubQuestId)
                        .collect(Collectors.toSet());

        //add locked if config says so (removed due to shit quests in gc)
        //Map<Integer, LockedPersonallineData> lockedPersonalLine = new HashMap<>();
        //
        //if (!Grasscutter.getConfig().server.game.gameOptions.bypassStoryQuestRequirements) {
		//	GameData.getPersonalLineDataMap().values().stream()
		//		.forEach(i -> {
		//			List<Integer> preQuestIds = i.getPreQuestId();
		//			for (int questId : preQuestIds) {
		//				if (!questList.contains(questId)) { //does not contain questId completion
		//					//will overwrite other prereq
		//					lockedPersonalLine.put(i.getId(), LockedPersonallineData.newBuilder()
		//														.setLockReason(LockedPersonallineData.LockReason.LOCK_REASON_QUEST)
		//														.setPersonalLineId(i.getId())
		//														.setChapterId(GameData.getMainQuestDataMap().get(questId / 100).getSeries()) //since series = chapterId
		//														.build()
		//										   );
		//				}
		//			}
		//		});
		//}

        GameData.getPersonalLineDataMap().values().stream()
                //.filter(i -> !questList.contains(i.getStartQuestId()))
                .forEach(i -> {
                    if (!questList.contains(i.getStartQuestId())) {
                        proto.addCanBeUnlockedPersonalLineList(i.getId());
                    } else {
                        proto.addOngoingPersonalLineList(i.getId());
                    }
                });
                
        proto.setCurFinishedDailyTaskCount(8); //hardcoded keys, todo when daily coms are implemented
		proto.setLegendaryKeyCount(8); //hardcoded keys, todo when daily coms are implemented

        this.setData(proto);
    }
}
