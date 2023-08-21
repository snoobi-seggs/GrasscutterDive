package emu.grasscutter.command.commands;

import static emu.grasscutter.utils.lang.Language.translate;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.packet.send.PacketPlayerPropChangeNotify;
import emu.grasscutter.server.packet.send.PacketPlayerPropNotify;
import java.util.List;

@Command(
        label = "test",
        aliases = {"test"},
        permission = "server.stop",
        targetRequirement = Command.TargetRequirement.NONE)
public final class TestCommand implements CommandHandler {
    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
		
		if (args.size() < 1) {
			CommandHandler.sendMessage(sender, "INVALID ARGS");
		}
		
		String COMMAND = args.get(0);
		
		switch (COMMAND) {
			case "prop" -> {
				int propId = 0;
				int propVal = 0;
				if (args.size() >= 3) {
					try {
						propId = Integer.parseInt(args.get(1));
						propVal = Integer.parseInt(args.get(2));
					} catch (Exception e) {
						CommandHandler.sendMessage(sender, "ONE ARG FOR " + COMMAND + " IS INVALID");
						return;
					}
				} else {
					try {
						propId = Integer.parseInt(args.get(1));
					} catch (Exception e) {
						CommandHandler.sendMessage(sender, "ONE ARG FOR " + COMMAND + " IS INVALID");
						return;
					}
				}
				//targetPlayer.setProperty(propId, propVal);
				targetPlayer.sendPacket(new PacketPlayerPropNotify(propId, propVal));
				targetPlayer.sendPacket(new PacketPlayerPropChangeNotify(propId, propVal));
				CommandHandler.sendMessage(sender, "SET PLAYER PROP SUCC");
			}
			default -> {
				CommandHandler.sendMessage(sender, "NOT DEFINED TEST COMM NAME");
			}
		}
    }
}
