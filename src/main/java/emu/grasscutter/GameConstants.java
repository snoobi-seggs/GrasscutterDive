package emu.grasscutter;

import emu.grasscutter.game.world.Position;
import emu.grasscutter.utils.objects.SparseSet;
import emu.grasscutter.utils.Utils;
import java.util.Arrays;

public final class GameConstants {
    public static String VERSION = "4.0.0";
    public static boolean DEBUG = false;

    public static final int DEFAULT_TEAMS = 4;
    public static final int MAX_TEAMS = 10;
    public static final int MAIN_CHARACTER_MALE = 10000005;
    public static final int MAIN_CHARACTER_FEMALE = 10000007;
    public static final Position START_POSITION = new Position(2747, 194, -1719);
    public static final int MAX_FRIENDS = 60;
    public static final int MAX_FRIEND_REQUESTS = 50;
    public static final int SERVER_CONSOLE_UID = 99; // The UID of the server console's "player".
    public static final int BATTLE_PASS_MAX_LEVEL = 50;
    public static final int BATTLE_PASS_POINT_PER_LEVEL = 1000;
    public static final int BATTLE_PASS_POINT_PER_WEEK = 10000;
    public static final int BATTLE_PASS_LEVEL_PRICE = 150;
    public static final int BATTLE_PASS_CURRENT_INDEX = 2;
    // Default entity ability hashes. (avatar)
    public static final String[] DEFAULT_ABILITY_STRINGS = {
        "Avatar_DefaultAbility_VisionReplaceDieInvincible",
        "Avatar_DefaultAbility_AvartarInShaderChange",
        "Avatar_SprintBS_Invincible",
        "Avatar_Freeze_Duration_Reducer",
        "Avatar_Attack_ReviveEnergy",
        "Avatar_Component_Initializer",
        "Avatar_FallAnthem_Achievement_Listener",
        "GrapplingHookSkill_Ability",
		
		//4.0 diving
        //"Avatar_PlayerBoy_DiveStamina_Reduction",
        //"Ability_Avatar_Dive_Team",
        //"Ability_Avatar_Dive_SealEcho",
        //"Absorb_SealEcho_Bullet_01",
        //"Absorb_SealEcho_Bullet_02",
        //"Ability_Avatar_Dive_CrabShield",
        //"ActivityAbility_Absorb_Shoot",
        "SceneAbility_DiveVolume",
		
		// Team
		"Ability_Avatar_Dive_Team", //(THIS SHLD HAVE BEEN IN TEAM)
		
		// Crab Shield
		"Ability_Avatar_Dive_CrabShield",
		"Avatar_Absorb_TrackingMissile",
		//"Avatar_Dive_CrabShield_HitBox",
		//"Avatar_Dive_CrabShield_HitBox_Long",
		//"Absorb_CrabShield_Back_Bullet_01",
		//"Absorb_CrabShield_Back_Bullet_02",
		//"Avatar_Dive_Lock_Collider_Driver_CrabShield",

		// Seal Echo
		"Ability_Avatar_Dive_SealEcho",
		//"Absorb_SealEcho_Bullet_01",
		//"Absorb_SealEcho_Bullet_02",
		
		// Sword Fish 2 charge thingy
		"Avatar_Absorb_SwordFishSlash",
		
		// Flat fish thingy
		"Ability_Avatar_Dive_Seahorse_Spray_Baihe",

		// Activity
		"ActivityAbility_Absorb_Shoot",
		"Activity_MagicWave_SkillButton"
		//"ActivityAbility_Absorb_Avatar_Gadget",
		//"ActivityAbility_Absorb_Bullet",
		//"ActivityAbility_Absorb_Avatar_Gadget_2",
		//"ActivityAbility_Absorb_Avatar_Gadget_3",
		//"ActivityAbility_Absorb_Avatar_Gadget_4",
		//"ActivityAbility_Absorb_Abandon"
    };
	
	public static final String[] DEFAULT_TEAM_ABILITY_STRINGS = {
		"Ability_Avatar_Dive_Team"	//(FONTAINE)
	};
	
    public static final SparseSet ILLEGAL_WEAPONS = new SparseSet("""
        10000-10008, 11411, 11506-11508, 12505, 12506, 12508, 12509,
        13503, 13506, 14411, 14503, 14505, 14508, 15504-15506
        """);
    public static final SparseSet ILLEGAL_RELICS = new SparseSet("""
        20001, 23300-23340, 23383-23385, 78310-78554, 99310-99554
        """);
    public static final SparseSet ILLEGAL_ITEMS = new SparseSet("""
        100086, 100087, 100100-101000, 101106-101110, 101306, 101500-104000,
        105001, 105004, 106000-107000, 107011, 108000, 109000-110000,
        115000-130000, 200200-200899, 220050, 220054
        """);
		
    public static final int[] DEFAULT_ABILITY_HASHES =
            Arrays.stream(DEFAULT_ABILITY_STRINGS).mapToInt(Utils::abilityHash).toArray();
    public static final int DEFAULT_ABILITY_NAME = Utils.abilityHash("Default");
}
