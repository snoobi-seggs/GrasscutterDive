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

@Command(label = "shittp", usage = "/shittp <x> <y> <z> [sceneId]\n\ndescription : use this to teleport without tpscene", aliases = {"stp","st"}, permission = "player.teleport", permissionTargeted = "player.teleport.others")
public final class ShitTeleportCommand implements CommandHandler {
	//to set the ~ to curr pos coord
	private float parseRelative(String input, Float current) {  // TODO: Maybe this will be useful elsewhere later
        if (input.contains("~")) {  // Relative
            if (!input.equals("~")) {  // Relative with offset
                current += Float.parseFloat(input.replace("~", ""));
            }  // Else no offset, no modification
	    } else if (input.contains("_")) {  // Relative
            if (!input.equals("_")) {  // Relative with offset
                current += Float.parseFloat(input.replace("_", ""));
            }  // Else no offset, no modification
        } else {  // Absolute
            current = Float.parseFloat(input);
        }
        return current;
    }
	
	private float GetRandomRotationCoordinate() {
		return (float) (Math.random() * 360);
	}
	
	@Override
	public void execute(Player sender, Player targetPlayer, List<String> args) {
		Position pos = targetPlayer.getPosition();
		float x = pos.getX();
		float y = pos.getY();
		float z = pos.getZ();
		int sceneId = targetPlayer.getSceneId();
		
		if (targetPlayer == null) {
			targetPlayer = sender;
		}
		
		switch (args.size()) {
            case 4:
                try {
                    sceneId = Integer.parseInt(args.get(3));
                }catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.execution.argument_error"));
                }  // Fallthrough
            case 3:
                try {
                    x = this.parseRelative(args.get(0), x);
                    y = this.parseRelative(args.get(1), y);
                    z = this.parseRelative(args.get(2), z);
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.teleport.invalid_position"));
                }
                break;
			case 2:
                try {
                    x = this.parseRelative(args.get(0), x);
                    y = this.parseRelative(args.get(1), y);
                    z = pos.getZ();
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.teleport.invalid_position"));
                }
                break;
			case 1:
                try {
                    x = this.parseRelative(args.get(0), x);
                    y = pos.getY();
                    z = pos.getZ();
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.teleport.invalid_position"));
                }
                break;
			case 0:
				//refresh
            default:
                this.sendUsageMessage(sender);
                return;
        }
		
		if (targetPlayer.getSceneId() == sceneId) {
			targetPlayer.getPosition().set(x,y,z);
			//targetPlayer.getRotation().set(GetRandomRotationCoordinate(),GetRandomRotationCoordinate(),GetRandomRotationCoordinate());
			targetPlayer.getScene().broadcastPacket(new PacketSceneEntityAppearNotify(targetPlayer));
		} else {
			targetPlayer.getPosition().set(x,y,z);
			targetPlayer.getWorld().transferPlayerToScene(targetPlayer,sceneId,targetPlayer.getPosition());
			targetPlayer.getScene().broadcastPacket(new PacketSceneEntityAppearNotify(targetPlayer));
		}
		
	
		CommandHandler.sendMessage(sender,"shit tp for" + targetPlayer.getPosition());
	}
}

