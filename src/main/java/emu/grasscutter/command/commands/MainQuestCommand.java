package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.GameMainQuest;
import emu.grasscutter.server.packet.send.PacketFinishedParentQuestUpdateNotify;

import java.util.List;

import static emu.grasscutter.utils.lang.Language.translate;

@Command(label = "mainquest", usage = {"(add|finish) [<mainQuestId>]"}, aliases = {"mq"}, permission = "player.quest", permissionTargeted = "player.quest.others")
public final class MainQuestCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() != 2) {
            sendUsageMessage(sender);
            return;
        }

        String cmd = args.get(0).toLowerCase();
        int questId;

        try {
            questId = Integer.parseInt(args.get(1));
        } catch (Exception e) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.quest.invalid_id"));
            return;
        }

        switch (cmd) {
            case "add" -> {
				try {
					GameMainQuest quest = new GameMainQuest(targetPlayer,questId);
					targetPlayer.getQuestManager().getMainQuests().put(quest.getParentQuestId(), quest);
					targetPlayer.sendPacket(new PacketFinishedParentQuestUpdateNotify(quest));
					targetPlayer.getQuestManager().startMainQuest(quest.getParentQuestId());
					CommandHandler.sendMessage(sender, "added mainquest of id " + String.valueOf(questId));
					return;
				} catch (Exception e) {
       				CommandHandler.sendMessage(sender, "mainQuestId of id " + String.valueOf(questId) + " is invalid\n" + e.toString());
					return;
				}	
                //break;
            }
            case "finish" -> {
                GameMainQuest quest = targetPlayer.getQuestManager().getMainQuestById(questId);

                if (quest == null) {
                    CommandHandler.sendMessage(sender, "this mainquest isnt in list of current quests, cannot complete unstarted quest");
                    return;
                }

                quest.finish();

                CommandHandler.sendMessage(sender, "finished mainquest with id" + String.valueOf(questId));
				break;
            }
            default -> {
                sendUsageMessage(sender);
            }
        }
    }
}
