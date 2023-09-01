package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.entity.EntityNPC;
import emu.grasscutter.game.entity.EntityGadget;
import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.game.entity.EntityClientGadget;
import emu.grasscutter.game.entity.EntityItem;
import emu.grasscutter.game.entity.EntityMonster;
import emu.grasscutter.game.entity.EntityVehicle;
import emu.grasscutter.game.entity.EntityRegion;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.Scene;

import java.util.List;

import static emu.grasscutter.utils.lang.Language.translate;

@Command(label = "killobject", usage = {"['gadget/g','avatar/a','clientgadget/cg','item/i','monster/m','npc','region/r','vehicle/v','all']"},aliases = {"ko","kobj"}, permission = "server.killall", permissionTargeted = "server.killall.others")
public final class KillObjectCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        Scene scene = targetPlayer.getScene();
		String type = "";
		
        try {
            switch (args.size()) {
                case 0: // *No args*
                    break;
                case 1: // [type]
					type = args.get(0).toLowerCase();
                    // = targetPlayer.getWorld().getSceneById(Integer.parseInt(args.get(0)));
                    break;
                default:
                    sendUsageMessage(sender);
                    return;
            }
        } catch (NumberFormatException ignored) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.execution.argument_error"));
        }
		
        if (scene == null) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.killall.scene_not_found_in_player_world"));
            return;
        }

        // Separate into list to avoid concurrency issue
        final Scene sceneF = scene;
		List<GameEntity> toKill;
		
		if (type.equals("gadget") || type.equals("g") || type.equals("gt")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> entity instanceof EntityGadget)
					.toList();
		} else if (type.equals("avatar") || type.equals("a") || type.equals("ava")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> entity instanceof EntityAvatar)
					.toList();
			CommandHandler.sendMessage(targetPlayer,"your character was killed, relogin to respawn coz /h wont work");
		} else if (type.equals("clientgadget") || type.equals("cg") || type.equals("cgadget")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> entity instanceof EntityClientGadget)
					.toList();
		} else if (type.equals("item") || type.equals("i") || type.equals("itm")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> entity instanceof EntityItem)
					.toList();
		} else if (type.equals("monster") || type.equals("mons") || type.equals("m")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> entity instanceof EntityMonster)
					.toList();
		} else if (type.equals("npc")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> entity instanceof EntityNPC)
					.toList();
		} else if (type.equals("region") || type.equals("r") || type.equals("reg")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> entity instanceof EntityRegion)
					.toList();
		} else if (type.equals("vehicle") || type.equals("v") || type.equals("vhc")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> entity instanceof EntityVehicle)
					.toList();
		} else if (type.equals("all")) {
			toKill = sceneF.getEntities().values().stream()
					.filter(entity -> (entity instanceof GameEntity && !(entity instanceof EntityAvatar)))
					.toList();
			CommandHandler.sendMessage(targetPlayer,"your character was killed, relogin to respawn coz /h wont work");
		} else {
			CommandHandler.sendMessage(sender,"this parem does not exist");
			return;
		}
			
        toKill.forEach(entity -> sceneF.killEntity(entity, 0));
        CommandHandler.sendMessage(sender, "killed" + toKill.size() + "of type" + type + "in sceneId " + scene.getId());
    }
}
