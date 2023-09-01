package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;

import emu.grasscutter.server.packet.send.PacketAddNoGachaAvatarCardNotify;

import java.util.List;

import static emu.grasscutter.utils.lang.Language.translate;

@Command(label = "gachacard", usage = "/gachac [avatarId]\n\ndescription: display gacha card", aliases = {"gachacard","gachac"}, permission = "player.spawn", permissionTargeted = "player.spawn.others")
public final class GachaCardCommand implements CommandHandler {
	
	
	@Override
	public void execute(Player sender, Player targetPlayer, List<String> args) {
		int avatarId = 0;
		
		if (targetPlayer == null) {
			targetPlayer = sender;
		}
		
		switch (args.size()) {
            case 1:
                avatarId = Integer.parseInt(args.get(0));
				break;
            default:
                CommandHandler.sendMessage(sender,"retard, specify a avatarId for fk sake");
				avatarId = 10000084;
        }
		
		int avatarItemId = (avatarId % 10000000) + 1000;
		
		if (avatarId >= 10000002 && avatarId <= 10000090) {
			targetPlayer.sendPacket(new PacketAddNoGachaAvatarCardNotify(avatarId, ActionReason.None, avatarItemId));
		} else {
			CommandHandler.sendMessage(sender,"invalid avatarId");
		}
	}
}

