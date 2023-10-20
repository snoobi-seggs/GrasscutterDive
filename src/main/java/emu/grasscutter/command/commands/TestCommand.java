package emu.grasscutter.command.commands;

import static emu.grasscutter.utils.lang.Language.translate;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.GameConstants;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.*;
import emu.grasscutter.game.world.*;
import emu.grasscutter.server.packet.send.*;
import emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.*;
import emu.grasscutter.net.proto.*;
import emu.grasscutter.utils.Utils;
import java.util.List;

@Command(
        label = "test",
        aliases = {"test", "tc"},
        permission = "server.stop",
        targetRequirement = Command.TargetRequirement.NONE)
public final class TestCommand implements CommandHandler {
    private static Position pos = null;
    
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
			case "coop" -> {
				// World player info packets
                targetPlayer.getSession().send(new PacketWorldPlayerInfoNotify(targetPlayer));	// DONE
                targetPlayer.getSession().send(new PacketScenePlayerInfoNotify(targetPlayer.getWorld(),true));	// DONE
                targetPlayer.getSession().send(new PacketWorldPlayerRTTNotify(targetPlayer.getWorld(), true));	// DONE
                // Team packets
                targetPlayer.getSession().send(new PacketSyncTeamEntityNotify(targetPlayer));
                targetPlayer.getSession().send(new PacketSyncScenePlayTeamEntityNotify(targetPlayer));
			}
			case "stats" -> {
				try {
					var prop = FightProperty.getPropById(Integer.parseInt(args.get(1)));
					int propVal = args.size() >= 3 ? Integer.parseInt(args.get(2)) : 0;
					if (prop.getId() != 0) {
						var entity = targetPlayer.getTeamManager().getCurrentAvatarEntity();
						entity.setFightProperty(prop, propVal);
						entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, prop));
					} else {
						CommandHandler.sendMessage(sender, "NO SUCH STAT ID");
					}
				} catch (Exception e) {
					CommandHandler.sendMessage(sender, "INVALID STAT ARG");
				}
			}
            case "hash" -> {
                String abilityName = args.get(1);
                CommandHandler.sendMessage(sender, abilityName + " -> " + String.valueOf(Utils.abilityHash(abilityName)));
            }
            case "rcrit" -> {
                pos = targetPlayer.getPosition();
                List<FightProperty> changedFields = List.of(
                    FightProperty.FIGHT_PROP_ELEM_REACT_CRITICAL,
                    FightProperty.FIGHT_PROP_ELEM_REACT_CRITICAL_HURT,
                    FightProperty.FIGHT_PROP_ELEM_REACT_SWIRL_CRITICAL,
                    FightProperty.FIGHT_PROP_ELEM_REACT_SWIRL_CRITICAL_HURT,
                    FightProperty.FIGHT_PROP_BASE_ELEM_REACT_CRITICAL,
                    FightProperty.FIGHT_PROP_BASE_ELEM_REACT_CRITICAL_HURT
                );

                List<GameEntity> monsters = targetPlayer.getScene().getEntities().values().stream()
						.filter(entity -> entity instanceof EntityMonster)
                        .filter(entity -> isWithinRange(entity, 15d))
						.toList();

                monsters.forEach(m -> {
                    m.setFightProperty(FightProperty.FIGHT_PROP_ELEM_REACT_CRITICAL, 1f); // 3025
                    m.setFightProperty(FightProperty.FIGHT_PROP_ELEM_REACT_CRITICAL_HURT, 1f); // 3025
                    m.setFightProperty(FightProperty.FIGHT_PROP_ELEM_REACT_SWIRL_CRITICAL, 1f); // 3029
                    m.setFightProperty(FightProperty.FIGHT_PROP_ELEM_REACT_SWIRL_CRITICAL_HURT, 1f); // 3030
                    m.setFightProperty(FightProperty.FIGHT_PROP_BASE_ELEM_REACT_CRITICAL, 1f); // 3045
                    m.setFightProperty(FightProperty.FIGHT_PROP_BASE_ELEM_REACT_CRITICAL_HURT, 1f); // 3046
                    m.getScene().broadcastPacket(new PacketEntityFightPropUpdateNotify(m, changedFields));
                    CommandHandler.sendMessage(sender, "Entity " + m.getId() + "REAXN CRIT SET TO 1");
                });
            }
            case "addbuff" -> {
                int buffId = 600301; //sorush buff default
                try {
                    buffId = Integer.parseInt(args.get(1));
                } catch (Exception e) {
                    CommandHandler.sendMessage(sender, "ARGS ERROR " + e.toString());
                }
                targetPlayer.getBuffManager().addBuff(buffId);
                CommandHandler.sendMessage(sender, "SUCC ADD BUFFID " + String.valueOf(buffId));
            }
            case "removebuff" -> {
                int buffId = 600301; //sorush buff default
                try {
                    buffId = Integer.parseInt(args.get(1));
                } catch (Exception e) {
                    CommandHandler.sendMessage(sender, "ARGS ERROR " + e.toString());
                }
                targetPlayer.getBuffManager().removeBuff(buffId);
                CommandHandler.sendMessage(sender, "SUCC REMV BUFFID " + String.valueOf(buffId));
            }
            default -> {
                CommandHandler.sendMessage(sender, "NOT DEFINED TEST COMM NAME");
            }
        }
    }
    
    private boolean isWithinRange(GameEntity entity, double range) {
        if (pos.computeDistance(entity.getPosition()) < range) {
            return true;
        } else {
            return false;
        }
    }
}
