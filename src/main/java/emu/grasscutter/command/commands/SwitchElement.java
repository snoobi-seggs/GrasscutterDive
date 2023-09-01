//package test.gc.switchele.commands;
package emu.grasscutter.command.commands;

import emu.grasscutter.GameConstants;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.avatar.AvatarSkillDepotData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.packet.send.PacketSceneEntityAppearNotify;
import emu.grasscutter.game.world.Position;
import emu.grasscutter.command.se.ConstellationsHandler;
import emu.grasscutter.command.se.LanguageHelper;
import emu.grasscutter.command.se.VersionSupportHelper;
import emu.grasscutter.command.se.Element;
//import test.gc.switchele.ConstellationsHandler;
//import test.gc.switchele.LanguageHelper;
//import test.gc.switchele.VersionSupportHelper;

import javax.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Command(label = "switchelement",usage="anemo|geo|electro|dendro",aliases = {"se"}, threading = true)
public class SwitchElement implements CommandHandler {

    @Nullable
    private static final Method getPositionMethod = VersionSupportHelper.getPositionMethod();

    private Element getElementFromString(String elementString) {
        return switch (elementString.toLowerCase()) {
            case "white", "common" -> Element.elementless;
            case "fire", "pyro" -> Element.pyro;
            case "water", "hydro" -> Element.hydro;
            case "wind", "anemo", "air" -> Element.anemo;
            case "ice", "cryo" -> Element.cryo;
            case "rock", "geo" -> Element.geo;
            case "electro" -> Element.electro;
            case "grass", "dendro", "plant" -> Element.dendro;
            default -> null;
        };
    }

    private boolean changeAvatarElement(Player sender, int avatarId, Element element) {
        Avatar avatar = sender.getAvatars().getAvatarById(avatarId);
        AvatarSkillDepotData skillDepot = GameData.getAvatarSkillDepotDataMap().get(element.getSkillRepoId(avatarId));
        if (avatar == null || skillDepot == null) {
            return false;
        }
        avatar.setSkillDepotData(skillDepot,true);
        avatar.setCurrentEnergy(1000);
        avatar.save();
        return true;
    }
    @Override
    public void execute(Player sender,Player targetPlayer, List<String> args) {
        String UserName=targetPlayer.getAccount().getUsername();
        if (args.size() < 1) {
            if (sender != null) {
                CommandHandler.sendMessage(targetPlayer, LanguageHelper.reader("usage", UserName));
            }
            else {
                Grasscutter.getLogger().info(LanguageHelper.reader("usage", UserName));
            }
            return;
        }
        Element element = getElementFromString(args.get(0));
        if (element == null) {
            if (sender != null) {
                CommandHandler.sendMessage(targetPlayer, LanguageHelper.reader("invalidElement", UserName));
            }
            else {
                Grasscutter.getLogger().info(LanguageHelper.reader("invalidElement", UserName));
            }
            return;
        }
        int constellation = 0;
        if (args.size() > 1) {
            try {
                constellation = Integer.parseInt(args.get(1));
                if (constellation>6){
                    constellation=6;
                } else if (constellation<0) {
                   constellation = 0;
                }
            }
            catch (Exception e){
                if (sender != null) {
                    CommandHandler.sendMessage(targetPlayer, LanguageHelper.reader("invalidCons", UserName));
                }
                else {
                    Grasscutter.getLogger().info(LanguageHelper.reader("invalidCons", UserName));
                }
            }
        }
        boolean maleSuccess = false;
        boolean femaleSuccess = false;
        if(targetPlayer.getTeamManager().getCurrentAvatarEntity().getAvatar().getAvatarId() == GameConstants.MAIN_CHARACTER_MALE) {
            maleSuccess = changeAvatarElement(targetPlayer, GameConstants.MAIN_CHARACTER_MALE, element);
            ConstellationsHandler.change(targetPlayer, element, constellation);
        } else if (targetPlayer.getTeamManager().getCurrentAvatarEntity().getAvatar().getAvatarId() == GameConstants.MAIN_CHARACTER_FEMALE) {
            femaleSuccess = changeAvatarElement(targetPlayer, GameConstants.MAIN_CHARACTER_FEMALE, element);
            ConstellationsHandler.change(targetPlayer, element, constellation);
        }
        if (maleSuccess || femaleSuccess) {
            if (getPositionMethod == null) {
                String message = String.format(LanguageHelper.reader("failedSuccess", UserName), element.name());
                if (sender != null) {
                    CommandHandler.sendMessage(targetPlayer, message);
                }
                else {
                    Grasscutter.getLogger().info(message);
                }
                return;
            }
            int scene = targetPlayer.getSceneId();
            String message;
            try {
                Position targetPlayerPos = (Position) getPositionMethod.invoke(targetPlayer);
                targetPlayer.getWorld().transferPlayerToScene(targetPlayer, 2, targetPlayerPos);
                targetPlayer.getWorld().transferPlayerToScene(targetPlayer, scene, targetPlayerPos);
                targetPlayer.getScene().broadcastPacket(new PacketSceneEntityAppearNotify(targetPlayer));
                message = String.format(LanguageHelper.reader("changeSuccess", UserName), element.name());
            } catch (IllegalAccessException | InvocationTargetException e) {
                message = String.format(LanguageHelper.reader("failedSuccess", UserName), element.name());
            }
            if (sender != null) {
                CommandHandler.sendMessage(targetPlayer, message);
            }
            else {
                Grasscutter.getLogger().info(message);
            }
        } else {
            if (sender != null) {
                CommandHandler.sendMessage(targetPlayer, LanguageHelper.reader("changeFailed", UserName));
            }
            else {
                Grasscutter.getLogger().info(LanguageHelper.reader("changeFailed", UserName));
            }
        }
    }
}