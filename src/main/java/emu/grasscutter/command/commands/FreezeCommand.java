package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;

import emu.grasscutter.game.world.Position;
import emu.grasscutter.server.packet.send.PacketSceneEntityAppearNotify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

import static emu.grasscutter.utils.lang.Language.translate;

@Command(label = "freeze", usage = "/freeze {number of reset packets sent] [interval of packets sent]\n\n description : use it and then skill or burst to mimic melons ability to freeze", aliases = {"f"}, permission = "player.spawn", permissionTargeted = "player.spawn.others")
public final class FreezeCommand implements CommandHandler {
	/*//to set the ~ to curr pos coord
	private float parseRelative(String input, Float current) {  // TODO: Maybe this will be useful elsewhere later
        if (input.contains("~")) {  // Relative
            if (!input.equals("~")) {  // Relative with offset
                current += Float.parseFloat(input.replace("~", ""));
            }  // Else no offset, no modification
        } else {  // Absolute
            current = Float.parseFloat(input);
        }
        return current;
    }*/
	
	@Override
	public void execute(Player sender, Player targetPlayer, List<String> args) {
		int interval = 250;
		int times = 50;
		
		if (targetPlayer == null) {
			targetPlayer = sender;
		}
		
		switch (args.size()) {
            case 2:
                try {
                    interval = Integer.parseInt(args.get(1));
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, translate(sender, "invalid interval in ms"));
                }  // Fallthrough
            case 1:
                try {
                    times = Integer.parseInt(args.get(0));
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, translate(sender, "invalid times"));
                }
			case 0:
				break;
            default:
                this.sendUsageMessage(sender);
                return;
        }
		
		CommandHandler.sendMessage(sender,"freeze for" + times + "times with interval of " + interval + ",during which no other commands or packets can be sent due to my shitty ability to code");
		
		//Position targetPos = new Position(x,y,z);
		for (int i = 0;i < times;i++) {
			try {
				targetPlayer.getScene().broadcastPacket(new PacketSceneEntityAppearNotify(targetPlayer));
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				;
			}
		}
	}
}

