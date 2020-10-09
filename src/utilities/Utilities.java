package utilities;

public interface Utilities {

    // Order of ability scores
    public static final int STR = 0;
    public static final int DEX = 1;
    public static final int CON = 2;
    public static final int INT = 3;
    public static final int WIS = 4;
    public static final int CHA = 5;

    public static final int ACROBATICS = 0;
    public static final int ANIMAL_HANDLING = 1;
    public static final int ARCANA = 2;
    public static final int ATHLETICS = 3;
    public static final int DECEPTION = 4;
    public static final int HISTORY = 5;
    public static final int INSIGHT = 6;
    public static final int INTIMIDATION = 7;
    public static final int INVESTIGATION = 8;
    public static final int MEDICINE = 9;
    public static final int NATURE = 10;
    public static final int PERCEPTION = 11;
    public static final int PERFORMANCE = 12;
    public static final int PERSUASSION = 13;
    public static final int RELIGION = 14;
    public static final int SLEIGHT_OF_HAND = 15;
    public static final int STEALTH = 16;
    public static final int SURVIVAL = 17;
    

    //universal traits
    public static final Trait darkvision = new Trait("Darkvision", "Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");

    //Dwarf traits
    public static final Trait dwarvenResilience = new Trait("Dwarven Resilience","You have advantage on saving throws against poison, and you have resistance against poison damage.");
    public static final Trait dwarvenCombatTraining = new Trait("Dwarven Combat Training", "You have proficiency with the battleaxe, handaxe, throwing hammer and warhammer.");
    public static final Trait toolProficiency = new Trait("Tool Proficiency","You gain proficiency with the artisan’s tools of your choice: smith’s tools, brewer’s supplies, or mason’s tools.");
    public static final Trait stonecunning = new Trait("Stonecunning","Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
    public static final Trait dwarvenToughness = new Trait("Dwarven Toughness","Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.");
    public static final Trait dwarvenArmourTraining = new Trait("Dwarven Armour Training","You have proficiency with light and medium armour.");

    //Elf traits
    public static final Trait keenSenses = new Trait("Keen Senses","You have proficiency in the Perception skill.");
    public static final Trait feyAncestry = new Trait("Fey Ancestry","You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
    public static final Trait trance = new Trait("Trance","Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep");
    public static final Trait elfWeaponTraining = new Trait("Elf Weapon Training","You have proficiency with the longsword, shortsword, longbow, and shortbow.");
    public static final Trait cantrip = new Trait("Cantrip","You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
    public static final Trait extraLanguage = new Trait("Extra Language", "You can speak, read and write an extra language of your choice.");
    public static final Trait fleetOfFoot = new Trait("Fleet of Foot","Your base walking speed increases to 35 feet.");
    public static final Trait maskOfTheWild = new Trait("Mask of the Wild","You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.");
    public static final Trait superiorDarkvision = new Trait("Superior Darkvision","Your darkvision has a radius of 120ft.");
    public static final Trait sunlightSensitivity = new Trait("Sunlight Sensitivity","You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight.");
    public static final Trait drowMagic = new Trait("Drow Magic","You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
    public static final Trait drowWeaponTraining = new Trait("Drow Weapon Training","You have proficiency with rapier, shortsword, and hand crossbows.");

    //Halfling traits
    public static final Trait lucky = new Trait("Lucky","When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
    public static final Trait brave = new Trait("Brave","You have advantage on saving throws against being frightened.");
    public static final Trait halflingNimbleness = new Trait("Halfling Nimbleness","You can move through the space of any creature that is of a size larger than you.");
    public static final Trait naturallyStealthy = new Trait("Naturally Stealthy","You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
    public static final Trait stoutResilience = new Trait("Stout Resilience", dwarvenResilience.getDescription());

    //Dragonborn traits
    public static final Trait draconicAncestry = new Trait("Draconic Ancestry","You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table.");
    public static final Trait breathWeapon = new Trait("Breath Weapon","You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
    public static final Trait damageResistance = new Trait("Damage Resistance","You have resistance to the damage type associated with your draconic ancestry.");
    public static final Trait draconicAncestryTable = new Trait("Draconic Ancestry"," Dragon\tDamage Type\tBreath Weapon\n" +
                                                                                            "Black\tAcid\t5 by 30 ft. line (Dex. save)\n" +
                                                                                            "Blue\tLightning\t5 by 30 ft. line (Dex. save)\n" +
                                                                                            "Brass\tFire\t5 by 30 ft. line (Dex. save)\n" +
                                                                                            "Bronze\tLightning\t5 by 30 ft. line (Dex. save)\n" +
                                                                                            "Copper\tAcid\t5 by 30 ft. line (Dex. save)\n" +
                                                                                            "Gold\tFire\t15 ft. cone (Dex. save)\n" +
                                                                                            "Green\tPoison\t15 ft. cone (Con. save)\n" +
                                                                                            "Red\tFire\t15 ft. cone (Dex. save)\n" +
                                                                                            "Silver\tCold\t15 ft. cone (Con. save)\n" +
                                                                                            "White\tCold\t15 ft. cone (Con. save)");

    //Gnome traits
    public static final Trait gnomeCunning = new Trait("Gnome Cunning","You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
    public static final Trait naturalIllusionist = new Trait("Natural Illusionist","You know the minor illusion cantrip. Intelligence is your spellcasting ability for it.");
    public static final Trait speakWithSmallBeasts = new Trait("Speak with Small Beasts","Through sounds and gestures, you can communicate simple ideas with small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, woodpeckers, and other creatures as beloved pets.");
    public static final Trait artificersLore = new Trait("Artificer's Lore","Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply");
    public static final Trait tinker = new Trait("Tinker","You have proficiency with artisan’s tools (tinker’s tools). Using those tools, you can spend 1 hour and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp). The device ceases to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time. When you create a device, choose one of the following options:\n" +
                                                                "Clockwork Toy.\n This toy is a clockwork animal, monster, or person, such as a frog, mouse, bird, dragon, or soldier. When placed on the ground, the toy moves 5 feet across the ground on each of your turns in a random direction. It makes noises as appropriate to the creature it represents.\n" +
                                                                "Fire Starter.\n This device produces a miniature flame, which you can use to light a candle, torch or campfire. Using the device requires your action.\n" +
                                                                "Music Box.\n When opened, this music box plays a single song at a moderate volume. The box stops playing when it reaches a songs end or when it is closed.");

    //Half-elf traits
    public static final Trait skillVersatility = new Trait("Skill Versatility","You gain proficiency in two skills of your choice.");

    //Half-orc traits
    public static final Trait menacing = new Trait("Menacing","You gain proficiency in Intimidation skill.");
    public static final Trait relentlessEndurance = new Trait("Relentless Endurance","When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
    public static final Trait savageAttacks = new Trait("Savage Attacks","When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");

    //Tiefling traits
    public static final Trait hellishResistance = new Trait("Hellish Resistance","You have resistance to fire damage.");
    public static final Trait infernalLegacy = new Trait("InfernalLegacy","You know the thaumaturgy cantrip. Once you reach 3rd level, you can cast the hellish rebuke spell once per day as a 2nd-level spell. Once you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");



    //Universal feature
    public static final Feature abilityScoreImprovement = new Feature(4, "Ability Score Improvement", "When you reach the 4th level, and again at 8th, 12th, 16th,\n" +
            "and 19th level, you can increase on ability score of your\n" +
            "choice by 2, or you can increase two ability scores of\n" +
            "your choice by 1. As normal, you can't increase an ability\n" +
            "score above 20 using this feature.");

    //Barbarian features
    public static final Feature rage = new Feature(1, "Rage", "In battle, you fight with primal ferocity. On your turn,\n" +
            "you can enter a rage as a bonus action.\n" +
            "While raging, you gain the following benefits if you\n" +
            "aren't wearing heavy armor:\n" +
            "- You have advantage on Strength checks and Strength saving throws.\n" +
            "- When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, \n" +
            "as shown in the Rage Damage column of the Barbarian table.\n" +
            "- You have resistance to bludgeoning, piercing, and slashing damage.\n\n" +
            "If you are able to cast spells, you can't cast them or\n" +
            "concentrate on them while raging.\n" +
            "Your rage lasts for 1 minute. It ends early if you are\n" +
            "knocked unconscious or if your turn ends and you\n" +
            "haven't attacked a hostile creature since your last turn\n" +
            "or taken damage since then. You can also end your rage\n" +
            "on your turn as a bonus action.\n" +
            "Once you have raged a number of times shown\n" +
            "for your barbarian level in the Rages column of the\n" +
            "Barbarian table, you must finish a long rest before you\n" +
            "can rage again.");
    public static final Feature unarmoredDefense = new Feature(1, "Unarmored Defense", "While you are not wearing any armor, your Armor Class\n" +
            "equals 10+ your Dexterity modifier + your Constitution\n" +
            "modifier. You can use a shield and still gain this benefit.");
    public static final Feature recklessAttack = new Feature(2, "Reckless Attack", "Starting at 2nd level, you can throw aside all concern\n" +
            "for defense to attack with fierce desperation. When\n" +
            "you make your first attack on your turn, you can decide\n" +
            "to attack recklessly. Doing so gives you advantage on\n" +
            "melee weapon attack rolls using Strength during this\n" +
            "turn, but attack rolls against you have advantage until\n" +
            "your next turn.");
    public static final Feature dangerSense = new Feature(2, "Danger Sense", "At 2nd level, you gain an uncanny sense of when things\n" +
            "nearby aren't as they should be, giving you an edge\n" +
            "when you dodge away from danger.\n" +
            "You have advantage on Dexterity saving throws\n" +
            "against effects that you can see, such as traps and spells.\n" +
            "To gain this benefit, you can't be blinded, deafened, or\n" +
            "incapacitated.");
    public static final Feature primalPath = new Feature(3, "Primal Path", "At 3rd level, you choose a path that shapes the nature of\n" +
            "your rage. Choose the Path of the Berserker or the Path\n" +
            "of the Totem Warrior, both detailed at the end of the\n" +
            "class description. Your choice grants you features at 3rd\n" +
            "level and again at 6th, 10th, and 14th levels.");
    public static final Feature extraAttack = new Feature(5, "Extra Attack", "Beginning at 5th level, you can attack twice, instead of\n" +
            "once, whenever you take the Attack action on your turn.");
    public static final Feature fastMovement = new Feature(5, "Fast Movement", "Starting at 5th level, your speed increases by 10 feet\n" +
            "while you aren't wearing heavy armor.");
    public static final Feature feralInstinct = new Feature(7, "Feral Instinct", "By 7th level, your instincts are so honed that you have\n" +
            "advantage on initiative rolls.\n" +
            "Additionally, if you are surprised at the beginning of\n" +
            "combat and aren't incapacitated, you can act normally\n" +
            "on your on your first turn, but only if you enter your rage before\n" +
            "doing anything else on that turn.");
    public static final Feature brutalCritical = new Feature(9, "Brutal Critical", "Beginning at 9th level, you can roll one additional\n" +
            "weapon damage die when determining the extra\n" +
            "damage for a critical hit with a melee attack.\n" +
            "This increases to two additional dice at 13th level\n" +
            "and three additional dive at 17th level");
    public static final Feature relentlessRage = new Feature(11, "Relentless Rage", "Starting at the 11th level, your rage can keep you fighting\n" +
            "despite grievous wounds. IF you drop to 0 hit points\n" +
            "while you're raging and don't die outright, you can make\n" +
            "a DC 10 Constitution saving throw. If you succeed, you\n" +
            "drop to 1 hit point instead.\n" +
            "Each time you use this feature after the first, the DC\n" +
            "increases by 5. When you finish a short or long rest, the\n" +
            "DC resets to 10.");
    public static final Feature persistentRage = new Feature(15, "Persistent Rage", "Beginning at 15th level, your rage is so fierce that\n" +
            "it ends early only if you fall unconscious or if you\n" +
            "choose to end it.");
    public static final Feature indomitableMight = new Feature(18, "Indomitable Might", "Beginning at 18th level, if your total for a Strength\n" +
            "check is less than your Strength score, you can use that\n" +
            "score in place of the total.");
    public static final Feature primalChampion = new Feature(20, "Primal Champion", "At 20th level, you embody the power of the wilds. Your\n" +
            "Strength and Constitution scores increase by 4. Your\n" +
            "maximum for those scores is now 24.");
}
