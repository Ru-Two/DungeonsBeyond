package utilities;

public final class Utilities {

    public static final Dice d100 = new Dice(100);
    public static final Dice d20 = new Dice(20);
    public static final Dice d12 = new Dice(12);
    public static final Dice d10 = new Dice(10);
    public static final Dice d8 = new Dice(8);
    public static final Dice d6 = new Dice(6);
    public static final Dice d4 = new Dice(4);

    // Order of ability scores
    public static final int STR = 0;
    public static final int DEX = 1;
    public static final int CON = 2;
    public static final int INT = 3;
    public static final int WIS = 4;
    public static final int CHA = 5;

    //order of skills
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
    public static final int PERSUASION = 13;
    public static final int RELIGION = 14;
    public static final int SLEIGHT_OF_HAND = 15;
    public static final int STEALTH = 16;
    public static final int SURVIVAL = 17;

    //death saves
    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;

    //proficiencies
    public static final int NOT_PROFICIENT = 0;
    public static final int PROFICIENT = 1;
    public static final int DOUBLE_PROFICIENT = 2;

    //weapon types
    public static final int SIMPLE_MELEE = 0;
    public static final int SIMPLE_RANGED = 1;
    public static final int MARTIAL_MELEE = 2;
    public static final int MARTIAL_RANGED = 3;

    //armour types
    public static final int LIGHT_ARMOUR = 0;
    public static final int MEDIUM_ARMOUR = 1;
    public static final int HEAVY_ARMOUR = 2;
    public static final int SHIELD = 3;
    public static final int NO_ARMOUR = 4;

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


    // TODO: 10/11/2020 maybe switch feature names to all caps: in case of bard feature spell casting where multiple paragraphs are written it makes it look like each paragraph is a different feature when printed

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

    //Bard features
    // TODO: 10/12/2020 add tabs to the paragraphs as shown in book
    // TODO: 10/12/2020 IMPLEMENT THE BARD COLLEGES
    public static final Feature spellcastingBard = new Feature(1, "Spellcasting", "You have learned to untangle and reshape the fabric of\n" +
            "reality in harmony with your wishes and music. Your\n" +
            "spells are part of your vast repertoire, magic that you\n" +
            "can tune to different situations. S ee chapter 10 for the\n" +
            "general rules of spellcasting and chapter 11 for the\n" +
            "bard spell list.\n\n" +
            "Cantrips\n" +
            "You know two cantrips of your choice from the bard\n" +
            "spell list. You learn additional bard cantrips of your\n" +
            "choice at higher levels, as show n in the Cantrips Known\n" +
            "column of the Bard table.\n\n" +
            "Spell Slots\n" +
            "The Bard table shows how many spell slots you have to\n" +
            "cast your spells of 1st level and higher. To cast one of\n" +
            "these spells, you must expend a slot of the spell’s level\n" +
            "or higher. You regain all expended spell slots when you\n" +
            "finish a long rest.\n\n" +
            "For example, if you know the 1st-level spell cure\n" +
            "wounds and have a 1st-level and a 2nd-level spell slot\n" +
            "available, you can cast cure wounds using either slot.\n" +
            "Spells Known of 1st Level and Higher\n" +
            "You know four 1st-level spells of your choice from the\n" +
            "bard spell list.\n\n" +
            "The Spells Known column of the Bard table shows\n" +
            "when you learn m ore bard spells of your choice. Each of\n" +
            "these spells must be of a level for which you have spell\n" +
            "slots, as show n on the table. For instance, when you\n" +
            "reach 3rd level in this class, you can learn one new spell\n" +
            "of 1st or 2nd level.\n\n" +
            "Additionally, when you gain a level in this class, you\n" +
            "can choose one of the bard spells you know and replace\n" +
            "it with another spell from the bard spell list, which also\n" +
            "must be of a level for which you have spell slots.\n\n" +
            "Spellcasting Ability\n" +
            "Charisma is your spellcasting ability for your bard\n" +
            "spells. Your magic comes from the heart and soul you\n" +
            "pour into the performance of your music or oration.\n" +
            "You use your Charisma whenever a spell refers to your\n" +
            "spellcasting ability. In addition, you use your Charisma\n" +
            "modifier when setting the saving throw DC for a bard\n" +
            "spell you cast and when making an attack roll with one.\n\n" +
            "Spell save DC = 8 + proficiency bonus + CHA modifier\n" +
            "Spell attack modifier = proficiency bonus + CHA modifier\n\n" +
            "Ritual Casting\n" +
            "You can cast any bard spell you know as a ritual if that\n" +
            "spell has the ritual tag.\n\n" +
            "Spellcasting Focus\n" +
            "You can use a musical instrument\n" +
            "as a spellcasting focus for your bard spells.");
    public static final Feature bardicInspiration = new Feature(1, "Bardic Inspiration", "You can inspire others through stirring words or music.\n" +
            "To do so, you use a bonus action on your turn to choose\n" +
            "one creature other than yourself within 60 feet of you\n" +
            "w ho can hear you. That creature gains one Bardic\n" +
            "Inspiration die, a d6.\n\n" +
            "Once within the next 10 minutes, the creature can roll\n" +
            "the die and add the number rolled to one ability check,\n" +
            "attack roll, or saving throw it makes. The creature can\n" +
            "wait until after it rolls the d20 before deciding to use the\n" +
            "Bardic Inspiration die, but must decide before the DM\n" +
            "says whether the roll succeeds or fails. Once the Bardic\n" +
            "Inspiration die is rolled, it is lost. A creature can have\n" +
            "only one Bardic Inspiration die at a time. \n\n" +
            "You can use this feature a number of tim es equal\n" +
            "to your Charisma modifier (a minimum of once). You\n" +
            "regain any expended uses w hen you finish a long rest.\n\n" +
            "Your Bardic Inspiration die changes when you reach\n" +
            "certain levels in this class. The die becomes a d8 at 5th\n" +
            "level, a d10 at 10th level, and a d12 at 15th level.");
    public static final Feature jackOfAllTrades = new Feature(2, "Jack of All Trades", "Starting at 2nd level, you can add half your proficiency\n" +
            "bonus, rounded down, to any ability check you make that\n" +
            "doesn't already include your proficiency bonus.");
    public static final Feature songOfRest = new Feature(2, "Song of Rest", "Beginning at 2nd level, you can use soothing music or\n" +
            "oration to help revitalize your wounded allies during\n" +
            "a short rest. If you or any friendly creatures who can\n" +
            "hear your performance regain hit points at the end of\n" +
            "the short rest, each of those creatures regains an extra\n" +
            "1d6 hit points.\n" +
            "The extra hit points increase when you reach certain\n" +
            "levels in this class: to 1d8 at 9th level, to 1d10 at 13th\n" +
            "level, and to 1d 12 at 17th level.");
    public static final Feature bardCollege = new Feature(3, "Bard College", "At 3rd level, you delve into the advanced techniques of\n" +
            "a bard college of your choice: the College of Lore or the\n" +
            "College of Valor, both detailed at the end of the class\n" +
            "description. Your choice grants you features at 3rd level\n" +
            "and again at 6th and 14th level.");
    public static final Feature expertise = new Feature (3, "Expertise", "At 3rd level, choose two of your skill proficiencies. Your\n" +
            "proficiency bonus is doubled for any ability check you\n" +
            "make that uses either of the chosen proficiencies.\n" +
            "At 10th level, you can choose another two skill\n" +
            "proficiencies to gain this benefit.");
    public static final Feature fontOfInspiration = new Feature(5, "Font of Inspiration", "Beginning when you reach 5th level, you regain all of\n" +
            "your expended uses of Bardic Inspiration when you\n" +
            "finish a short or long rest.");
    public static final Feature coutercharm = new Feature(6, "Countercharm", "At 6th level, you gain the ability to use musical notes or\n" +
            "words of power to disrupt mind-influencing effects. As\n" +
            "an action, you can start a performance that lasts until\n" +
            "the end of your next turn. During that time, you and any\n" +
            "friendly creatures within 30 feet of you have advantage\n" +
            "on saving throws against being frightened or charmed.\n" +
            "A creature must be able to hear you to gain this benefit.\n" +
            "The performance ends early if you are incapacitated or\n" +
            "silenced or if you voluntarily end it (no action required).");
    public static final Feature magicalSecrets = new Feature(10, "Magical Secrets", "By 10th level, you have plundered magical knowledge\n" +
            "from a wide spectrum of disciplines. Choose two spells\n" +
            "from any class, including this one. A spell you choose\n" +
            "must be of a level you can cast, as shown on the Bard\n" +
            "table, or a cantrip.\n" +
            "The chosen spells count as bard spells for you and are\n" +
            "included in the number in the Spells Known column of\n" +
            "the Bard table.\n" +
            "You learn two additional spells from any class at 14th\n" +
            "level and again at 18th level.");
    public static Feature superiorInspiration = new Feature(20, "Superior Inspiration", "At 20th level, when you roll initiative and have no uses\n" +
            "of Bardic Inspiration left, you regain one use.");

    //Cleric features
    // TODO: 10/12/2020 fix this since it has book references
    // TODO: 10/12/2020 IMPLEMENT THE DIVINEDOMAIN CHOICES
    public static Feature spellcastingCleric = new Feature(1, "Spellcasting", "As a conduit for divine power, you can cast cleric spells.\n" +
            "See chapter 10 for the general rules of spellcasting and\n" +
            "chapter 11 for the cleric spell list.\n\n" +
            "Cantrips\n" +
            "At 1st level, you know three cantrips of your choice from\n" +
            "the cleric spell list. You learn additional cleric cantrips\n" +
            "of your choice at higher levels, as shown in the Cantrips\n" +
            "Known column of the Cleric table.\n\n" +
            "Preparing and Casting Spells\n" +
            "The Cleric table shows how many spell slots you have\n" +
            "to cast your spells of 1st level and higher. To cast one of\n" +
            "these spells, you must expend a slot of the spell’s level\n" +
            "or higher. You regain all expended spell slots when you\n" +
            "finish a long rest.\n" +
            "\tYou prepare the list of cleric spells that are available\n" +
            "for you to cast, choosing from the cleric spell list. When\n" +
            "you do so, choose a number of cleric spells equal to\n" +
            "your Wisdom modifier + your cleric level (minimum of\n" +
            "one spell). The spells must be of a level for which you\n" +
            "have spell slots.\n" +
            "\tFor example, if you are a 3rd-level cleric, you have four\n" +
            "1st-level and two 2nd-level spell slots. With a Wisdom\n" +
            "of 16, your list of prepared spells can include six spells\n" +
            "of 1st or 2nd level, in any combination. If you prepare\n" +
            "the 1st-level spell cure wounds, you can cast it using\n" +
            "a 1st-level or 2nd-level slot. Casting the spell doesn't\n" +
            "remove it from your list of prepared spells.\n" +
            "\tYou can change your list of prepared spells when you\n" +
            "finish a long rest. Preparing a new list of cleric spells\n" +
            "requires time spent in prayer and meditation: at least 1\n" +
            "minute per spell level for each spell on your list.\n\n" +
            "Spellcasting Ability\n" +
            "Wisdom is your spellcasting ability for your cleric spells.\n" +
            "The power of your spells comes from your devotion to\n" +
            "your deity. You use your Wisdom whenever a cleric spell\n" +
            "refers to your spellcasting ability. In addition, you use\n" +
            "your Wisdom modifier when setting the saving throw\n" +
            "DC for a cleric spell you cast and when making an\n" +
            "attack roll with one.\n\n" +
            "Spell save DC = 8 + proficiency bonus + WIS modifier\n" +
            "Spell attack modifier = proficiency bonus + WIS modifier\n\n" +
            "Ritual Casting\n" +
            "You can cast a cleric spell as a ritual if that spell has the\n" +
            "ritual tag and you have the spell prepared.\n\n" +
            "Spellcasting Focus\n" +
            "You can use a holy symbol as a\n" +
            "spellcasting focus for your cleric spells.");
    public static final Feature divineDomain = new Feature(1, "Divine Domain", "Choose one domain related to your deity: Knowledge,\n" +
            "Life, Light, Nature, Tempest, Trickery, or War. Each\n" +
            "domain is detailed at the end of the class description,\n" +
            "and each one provides examples of gods associated\n" +
            "with it. Your choice grants you domain spells and other\n" +
            "features when you choose it at 1st level. It also grants\n" +
            "you additional ways to use Channel Divinity when you\n" +
            "gain that feature at 2nd level, and additional benefits at\n" +
            "6th, 8th, and 17th levels.\n\n" +
            "Domain Spells\n" +
            "Each domain has a list of spells—its domain spells—\n" +
            "that you gain at the cleric levels noted in the domain\n" +
            "description. Once you gain a dom ain spell, you always\n" +
            "have it prepared, and it doesn't count against the\n" +
            "number of spells you can prepare each day.\n" +
            "\tIf you have a dom ain spell that doesn't appear on the\n" +
            "cleric spell list, the spell is nonetheless a cleric spell for you.");
    public static final Feature channelDivinity = new Feature(2, "Channel Divinity", "At 2nd level, you gain the ability to channel divine\n" +
            "energy directly from your deity, using that energy to fuel\n" +
            "magical effects. You start with two such effects: Turn\n" +
            "Undead and an effect determined by your domain. Some\n" +
            "domains grant you additional effects as you advance in\n" +
            "levels, as noted in the dom ain description.\n" +
            "\tWhen you use your Channel Divinity, you choose\n" +
            "which effect to create. You must then finish a short or\n" +
            "long rest to use your Channel Divinity again.\n" +
            "\tSome Channel Divinity effects require saving throws.\n" +
            "When you use such an effect from this class, the DC\n" +
            "equals your cleric spell save DC.\n" +
            "\tBeginning at 6th level, you can use your Channel\n" +
            "Divinity twice between rests, and beginning at 18th level,\n" +
            "you can use it three times between rests. When you finish\n" +
            "a short or long rest, you regain your expended uses.\n\n" +
            "Channel Divinity: Turn Undead\n" +
            "As an action, you present your holy symbol and speak a\n" +
            "prayer censuring the undead. Each undead that can see\n" +
            "or hear you within 30 feet of you must make a Wisdom\n" +
            "saving throw. If the creature fails its saving throw, it is\n" +
            "turned for 1 minute or until it takes any damage.\n" +
            "\tA turned creature must spend its turns trying to move\n" +
            "as far away from you as it can, and it can’t willingly\n" +
            "move to a space within 30 feet of you. It also can’t take\n" +
            "reactions. For its action, it can use only the Dash action\n" +
            "or try to escape from an effect that prevents it from\n" +
            "moving. If there’s nowhere to move, the creature can use\n" +
            "the Dodge action.");
    public static final Feature destroyUndead = new Feature(5, "Destroy Undead", "Starting at 5th level, when an undead fails its saving\n" +
            "throw against your Turn Undead feature, the creature is\n" +
            "instantly destroyed if its challenge rating is at or below a\n" +
            "certain threshold, as shown in the Destroy Undead table.\n\n" +
            "Destroy Undead:\n" +
            "Cleric Level \tDestroys Undead of CR...\n" +
            "5th\t\t\t\t1/2 or lower\n" +
            "8th\t\t\t\t1 or lower\n" +
            "11th\t\t\t2 or lower\n" +
            "14th\t\t\t3 or lower\n" +
            "17th\t\t\t4 or lower");
    public static final Feature divineIntervention = new Feature(10, "Divine Intervention", "Beginning at 10th level, you can call on your deity to\n" +
            "intervene on your behalf when your need is great.\n" +
            "\tImploring your deity's aid requires you to use your\n" +
            "action. Describe the assistance you seek, and roll\n" +
            "percentile dice. If you roll a number equal to or lower\n" +
            "than your cleric level, your deity intervenes. The DM\n" +
            "chooses the nature of the intervention; the effect of any\n" +
            "cleric spell or cleric dom ain spell would be appropriate.\n" +
            "\tIf your deity intervenes, you can’t use this feature\n" +
            "again for 7 days. Otherwise, you can use it again after\n" +
            "you finish a long rest.\n" +
            "\tAt 20th level, your call for intervention succeeds\n" +
            "automatically, no roll required.");
    
     //Druid features
    // TODO: 10/13/2020 druid circle needs a lot of stuff 
    // TODO: 10/13/2020 maybe create animal files for wild shape 
    public static final Feature druidic = new Feature(1, "Druidic", "You know Druidic, the secret language of druids. You\n" +
            "can speak the language and use it to leave hidden\n" +
            "messages. You and others who know this language\n" +
            "automatically spot such a message. Others spot the\n" +
            "message's presence with a successful DC 15 Wisdom\n" +
            "(Perception) check but can’t decipher it without magic.");
    public static final Feature getSpellcastingDruid = new Feature(1, "Spellcasting", "Drawing on the divine essence of nature itself, you\n" +
            "can cast spells to shape that essence to your will. See\n" +
            "chapter 10 for the general rules of spellcasting and\n" +
            "chapter 11 for the druid spell list.\n\n" +
            "Cantrips\n" +
            "At 1st level, you know two cantrips of your choice from\n" +
            "the druid spell list. You learn additional druid cantrips\n" +
            "of your choice at higher levels, as shown in the Cantrips\n" +
            "Known column of the Druid table.\n\n" +
            "Preparing and Casting Spells\n" +
            "The Druid table show s how many spell slots you have\n" +
            "to cast your spells of 1st level and higher. To cast one of\n" +
            "these druid spells, you must expend a slot of the spell's\n" +
            "level or higher. You regain all expended spell slots when\n" +
            "you finish a long rest.\n" +
            "\tYou prepare the list of druid spells that are available\n" +
            "for you to cast, choosing from the druid spell list. When\n" +
            "you do so, choose a number o f druid spells equal to\n" +
            "your Wisdom modifier + your druid level (minimum of\n" +
            "one spell). The spells must be of a level for which you\n" +
            "have spell slots.\n" +
            "\tFor example, if you are a 3rd-level druid, you have four\n" +
            "1st-level and two 2nd-level spell slots. With a Wisdom\n" +
            "of 16, your list of prepared spells can include six spells\n" +
            "of 1st or 2nd level, in any combination. If you prepare\n" +
            "the 1st-level spell cure wounds, you can cast it using\n" +
            "a 1st-level or 2nd-level slot. Casting the spell doesn't\n" +
            "remove it from your list of prepared spells.\n" +
            "\tYou can also change your list of prepared spells when\n" +
            "you finish a long rest. Preparing a new list of druid\n" +
            "spells requires time spent in prayer and meditation: at\n" +
            "least 1 minute per spell level for each spell on your list.\n\n" +
            "Spellcasting Ability\n" +
            "Wisdom is your spellcasting ability for your druid\n" +
            "spells, since your magic draws upon your devotion and\n" +
            "attunement to nature. You use your Wisdom whenever\n" +
            "a spell refers to your spellcasting ability. In addition,\n" +
            "you use your Wisdom modifier when setting the saving\n" +
            "throw DC for a druid spell you cast and when making an\n" +
            "attack roll with one.\n\n" +
            "Spell save DC = 8 + proficiency bonus + WIS modifier\n" +
            "Spell attack modifier = proficiency bonus + WIS modifier\n\n" +
            "Ritual Casting\n" +
            "You can cast a druid spell as a ritual if that spell has the\n" +
            "ritual tag and you have the spell prepared.\n\n" +
            "Spellcasting Focus\n" +
            "You can use a druidic focus as a\n" +
            "spellcasting focus for your druid spells.");
    public static final Feature wildShape = new Feature(2, "Wild Shape", "Starting at 2nd level, you can use your action to\n" +
            "magically assume the shape of a beast that you have\n" +
            "seen before. You can use this feature twice. You regain\n" +
            "expended uses when you finish a short or long rest.\n" +
            "\tYour druid level determines the beasts you can\n" +
            "transform into, as shown in the Beast Shapes table. At\n" +
            "2nd level, for example, you can transform into any beast\n" +
            "that has a challenge rating of 1/4 or lower that doesn't\n" +
            "have a flying or swimming speed.\n\n" +
            "Beast Shapes\n" +
            "Level\tmax CR\tLimitations\t\t\t\t\t\tExample\n" +
            " 2nd\t 1/4\tNo flying or swimming speed\t\tWolf\n" +
            " 4th\t 1/2\tNo flying speed\t\t\t\t\tCrocodile\n" +
            " 8th\t 1\t\t--\t\t\t\t\t\t\t\tGiant eagle\n\n" +
            "You can stay in a beast shape for a number of hours\n" +
            "equal to half your druid level (rounded down). You then\n" +
            "revert to your normal form unless you expend another\n" +
            "use of this feature. You can revert to your normal\n" +
            "form earlier by using a bonus action on your turn. You\n" +
            "automatically revert if you fall unconscious, drop to\n" +
            "0 hit points, or die.\n" +
            "\tWhile you are transformed, the following rules apply:\n" +
            "- Your game statistics are replaced by the statistics of\n" +
            "the beast, but you retain your alignment, personality,\n" +
            "and Intelligence, Wisdom , and Charisma scores. You\n" +
            "\n" +
            "also retain all of your skill and saving throw proficien-\n" +
            "cies, in addition to gaining those of the creature. If\n" +
            "\n" +
            "the creature has the same proficiency as you and the\n" +
            "bonus in its stat block is higher than yours, use the\n" +
            "creature’s bonus instead of yours. If the creature has\n" +
            "any legendary or lair actions, you can't use them.\n" +
            "- When you transform, you assume the beast’s hit\n" +
            "points and Hit Dice. W hen you revert to your norm al\n" +
            "form, you return to the number of hit points you had\n" +
            "before you transformed. However, if you revert as a\n" +
            "result of dropping to 0 hit points, any excess damage\n" +
            "carries over to your norm al form. For example, if you\n" +
            "take 10 damage in animal form and have only 1 hit\n" +
            "point left, you revert and take 9 damage. As long as\n" +
            "the excess damage doesn't reduce your norm al form\n" +
            "to 0 hit points, you aren't knocked unconscious.\n" +
            "- You can’t cast spells, and your ability to speak or\n" +
            "take any action that requires hands is limited to the\n" +
            "capabilities of your beast form. Transforming doesn't\n" +
            "break your concentration on a spell you’ve already\n" +
            "cast, however, or prevent you from taking actions that\n" +
            "are part of a spell, such as call lightning, that you’ve\n" +
            "already cast.\n" +
            "- You retain the benefit of any features from your class,\n" +
            "race, or other source and can use them if the new\n" +
            "form is physically capable of doing so. However, you\n" +
            "\n" +
            "can’t use any o f your special senses, such as darkvi-\n" +
            "sion, unless your new form also has that sense.\n" +
            "\n" +
            "- You choose whether your equipment falls to the\n" +
            "ground in your space, merges into your new form, or\n" +
            "is worn by it. W orn equipment functions as normal,\n" +
            "but the DM decides whether it is practical for the new\n" +
            "\n" +
            "form to w ear a piece of equipment, based on the crea-\n" +
            "ture’s shape and size. Your equipment doesn't change\n" +
            "\n" +
            "size or shape to match the new form, and any equipment\n" +
            "that the new form can’t wear must either fall to the\n" +
            "ground or merge with it. Equipment that merges with\n" +
            "the form has no effect until you leave the form.");
    public static final Feature druidCircle = new Feature(2, "Druid Circle", "At 2nd level, you choose to identify with a circle of druids:\n" +
            "the Circle of the Land or the Circle of the Moon, both\n" +
            "detailed at the end of the class description. Your choice\n" +
            "grants you features at 2nd level and again at 6th, 10th,\n" +
            "and 14th level.");
    public static final Feature timelessBody = new Feature(18, "Timeless Body", "Starting at 18th level, the primal magic that you wield\n" +
            "causes you to age more slowly. For every 10 years that\n" +
            "pass, your body ages only 1 year.");
    public static final Feature beastSpells = new Feature(18, "Beast Spells", "Beginning at 18th level, you can cast many of your druid\n" +
            "spells in any shape you assume using Wild Shape. You\n" +
            "can perform the somatic and verbal components of a\n" +
            "druid spell while in a beast shape, but you aren't able to\n" +
            "provide material components.");
    public static final Feature archdruid = new Feature(20, "Archdruid", "At 20th level, you can use your Wild Shape an unlimited\n" +
            "number of times.\n" +
            "\tAdditionally, you can ignore the verbal and somatic\n" +
            "components of your druid spells, as well as any material\n" +
            "components that lack a cost and aren't consumed by a\n" +
            "spell. You gain this benefit in both your normal shape\n" +
            "and your beast shape from Wild Shape.");

    //Fighter Features
    // TODO 10/18/2020 Different Martial Archetypes: Champion, Battle Master, Eldritch Knight
    public static final Feature fightingStyle = new Feature(1, "Fighting Style", "You adopt a particular style of fighting as your specialty\n" +
            "Choose one of the following options. You can't take a\n"+
            "Fighting Style option more than once, even if you later\n"+
            "get to choose again.\n\n"+

            "Archer\n"+
            "You gain a +2 bonus to attack rolls to make with\n"+
            "ranged weapons\n\n"+

            "Defense\n"+
            "While you are wearing armor, you gain a +1 bonus to AC\n\n"+

            "Dueling\n"+
            "When you are wielding a melee weapon in on hand and\n"+
            "no other weapons, you gain a +2 bonus to damage rolls\n"+
            "with that weapon.\n\n"+

            "Great Weapon Fighting\n"+
            "When you roll a 1 or 2 on a damage die for an attack you\n"+
            "make with a melee weapon that you are wielding with\n"+
            "two hands, you can reroll the die and must use the new\n"+
            "roll, even if the new roll is a 1 or a 2. The weapon must\n"+
            "have the two-handed or versatile property for you to gain\n"+
            "this benefit.\n\n"+

            "Protection\n"+
            "When a creature you can see attacks a target other\n"+
            "than you that is within 5 feet of you, you can use your\n"+
            "reaction to impose disadvantage on the attack roll. You\n"+
            "must be wielding a shield\n\n"+

            "Two-Weapon Fighting\n"+
            "When you engage in two-weapon fighting, you can add\n"+
            "your ability modifier to the damage of the attack\n"
            );

    public static final Feature secondWind = new Feature(1, "SecondWind", "You have a limited well of stamina that you can draw on\n"+
            "to protect yourself from harm. On you rturn you can use\n" +
            "a bonus action to regain hit points equal to 1d10 + your\n" +
            "fighter level.\n" +
            "   Once you use this feature, you must finish a short or\n" +
            "long rest before you can use it again.\n"
            );

    public static final Feature actionSurge = new Feature(2, "Action Surge", "Starting at 2nd level, you can push yourself beyond your\n" +
            "normal limited for a moment. On your turn, you can take\n" +
            "one additional action on top of your regular action and a\n" +
            "possible bonus action.\n" +
            "Once you use this feature, you must finish a short or\n" +
            "long rest before you can use it again. Starting at 17th\n" +
            "level, you can use it twice before a rest, but only once on\n" +
            "the same turn.\n"
            );

    public static final Feature martialArchetype = new Feature(3,"martialArchetype", "At 3rd level, you ch oose an archetype that you strive to\n" +
            "emulate in your com bat styles and techniques. Choose\n" +
            "Champion, Battle Master, or Eldritch Knight, all detailed\n" +
            "at the end of the class description. The archetype you\n" +
            "choose grants you features at 3rd level and again at 7th,\n" +
            "10th, 15th, and 18th level. \n");

    //ability Score Improvement level 4
    //extra attack level 5

    public static final Feature Indomitable = new Feature(9, "Indomitable","Beginning at 9th level, you can reroll a saving throw that\n" +
            "you fail. If you do so, you must use the new roll, and you\n" +
            "can’t use this feature again until you finish a long rest.\n" +
            "You can use this feature tw ice between long rests\n" +
            "starting at 13th level and three times between long rests\n" +
            "starting at 17th level. \n"
            );

    //Monk Features
    // TODO 10/18/2020 Monastic Traditions: Way of the open hand, Way of the shadow, Way of the four elements
    //Unarmored Defence level 1

    public static final Feature martialArts = new Feature(1, "Martial Arts", "At 1st level, your practice of martial arts gives you\n" +
            "mastery of com bat styles that use unarmed strikes and\n" +
            "monk weapons, which are shortswords and any simple\n" +
            "melee weapons that don’t have the two-handed or\n" +
            "heavy property.\n" +
            "You gain the following benefits while you are unarmed\n" +
            "or wielding only monk weapons and you aren’t wearing\n" +
            "arm or or wielding a shield:\n" +
            "• You can use Dexterity instead of Strength for the\n" +
            "attack and damage rolls of your unarmed strikes and\n" +
            "monk weapons.\n" +
            "• You can roll a d4 in place of the normal damage\n" +
            "of your unarmed strike or monk weapon. This die\n" +
            "changes as you gain monk levels, as shown in the\n" +
            "Martial Arts column of the Monk table.\n" +
            "• When you use the Attack action with an unarmed\n" +
            "strike or a monk weapon on your turn, you can make\n" +
            "one unarmed strike as a bonus action. For example, if\n" +
            "you take the Attack action and attack with a quarter-\n" +
            "staff, you can also make an unarmed strike as a bonus\n" +
            "action, assuming you haven't already taken a bonus\n" +
            "action this turn.\n" +
            "Certain monasteries use specialized forms of the\n" +
            "monk weapons. For example, you might use a club\n" +
            "that is two lengths of wood connected by a short chain\n" +
            "(called a nunchaku) or a sickle with a shorter, straighter\n" +
            "blade (called a kama). Whatever name you use for a\n" +
            "monk weapon, you can use the game statistics provided\n" +
            "for the weapon in chapter 5."
            );

    public static final Feature Ki = new Feature(2,"Ki", "Starting at 2nd level, your training allows you to\n" +
            "harness the mystic energy of ki. Your access to this\n" +
            "energy is represented by a number of ki points. Your\n" +
            "monk level determines the number of points you have,\n" +
            "as shown in the Ki Points column of the Monk table.\n" +
            "You can spend these points to fuel various ki features.\n" +
            "You start knowing three such features: Flurry of Blows,\n" +
            "Patient Defense, and Step of the Wind. You learn more\n" +
            "ki features as you gain levels in this class.\n" +
            "When you spend a ki point, it is unavailable until\n" +
            "you finish a short or long rest, at the end of which you\n" +
            "draw all of your expended ki back into yourself. You\n" +
            "must spend at least 30 minutes of the rest meditating to\n" +
            "regain your ki points.\n" +
            "Some of your ki features require your target to make\n" +
            "a saving throw to resist the feature’s effects. The saving\n" +
            "throw DC is calculated as follows:\n\n" +

            "Ki save DC = 8 + your proficiency bonus +\n" +
            "your Wisdom modifier\n\n" +

            "Flurry of Blows\n" +
            "Immediately after you take the Attack action on your\n" +
            "turn, you can spend 1 ki point to make two unarmed\n" +
            "strikes as a bonus action.\n\n" +

            "Patient Defense\n" +
            "You can spend 1 ki point to take the Dodge action as a\n" +
            "bonus action on your turn.\n\n" +

            "Step of the Wind\n" +
            "You can spend 1 ki point to take the Disengage or Dash\n" +
            "action as a bonus action on your turn, and your jump\n" +
            "distance is doubled for the turn.\n"
            );

    public static final Feature unarmoredMovement = new Feature(2,"Unarmored Movement", "Starting at 2nd level, your speed increases by 10 feet\n" +
            "while you are not wearing arm or or wielding a shield.\n" +
            "This bonus increases when you reach certain monk\n" +
            "levels, as shown in the Monk table.\n" +
            "At 9th level, you gain the ability to move along vertical\n" +
            "surfaces and across liquids on your turn without falling\n" +
            "during the move.\n"
            );

    public static final Feature monasticTradition = new Feature(3, "Monastic Tradtion", "When you reach 3rd level, you commit yourself to a\n" +
            "monastic tradition: the Way of the Open Hand, the Way\n" +
            "of Shadow, or the Way of the Four Elements, all detailed\n" +
            "at the end of the class description. Your tradition\n" +
            "grants you features at 3rd level and again at 6th, 11th,\n" +
            "and 17th level.\n"
            );
    public static final Feature deflectMissiles = new Feature(3, "Deflect Missiles","Starting at 3rd level, you can use your reaction to\n" +
            "deflect or catch the missile when you are hit by a ranged\n" +
            "weapon attack. When you do so, the damage you take\n" +
            "from the attack is reduced by 1d 10 + your Dexterity\n" +
            "modifier + your monk level.\n" +
            "If you reduce the damage to 0, you can catch the\n" +
            "missile if it is small enough for you to hold in one hand\n" +
            "and you have at least one hand free. If you catch a\n" +
            "missile in this way, you can spend 1 ki point to make a\n" +
            "ranged attack with the weapon or piece of ammunition\n" +
            "you just caught, as part of the same reaction. You make\n" +
            "this attack with proficiency, regardless of your weapon\n" +
            "proficiencies, and the missile counts as a monk weapon\n" +
            "for the attack.\n"
            );

    //Ability Score Improvement level 4

    public static final Feature slowFall = new Feature (4, "Slow Fall", "Beginning at 4th level, you can use your reaction when\n" +
            "you fall to reduce any falling damage you take by an\n" +
            "amount equal to five times your monk level.\n"
    );

    //Extra attack level 5

    public static final Feature stunningStrike = new Feature (5, "Stunning Strike", "Starting at 5th level, you can interfere with the flow of\n" +
            "ki in an opponent’s body. W hen you hit another creature\n" +
            "with a melee weapon attack, you can spend 1 ki point to\n" +
            "attempt a stunning strike. The target must succeed on a\n" +
            "Constitution saving throw or be stunned until the end of\n" +
            "your next turn.\n"
            );

    public static final Feature kiempoweredStrikes = new Feature(6, "Ki-Empowered Strikes", "Starting at 6th level, your unarmed strikes count as\n" +
            "magical for the purpose of overcoming resistance and\n" +
            "immunity to nonmagical attacks and damage.\n"
            );

    public static final Feature Evasion = new Feature (7, "Evasion", "At 7th level, your instinctive agility lets you dodge\n" +
            "out of the way of certain area effects, such as a blue\n" +
            "dragon’s lightning breath or a fireball spell. When you\n" +
            "are subjected to an effect that allows you to make a\n" +
            "Dexterity saving throw to take only half damage, you\n" +
            "instead take no damage if you succeed on the saving\n" +
            "throw, and only half damage if you fail.\n"
            );

    public static final Feature stillnessofMind = new Feature (7, "Stillness of Mind", "Starting at 7th level, you can use your action to end one\n" +
            "effect on yourself that is causing you to be charmed\n" +
            "or frightened.\n"
            );

    public static final Feature purityofBody = new Feature (10, "Purity of Body", "At 10th level, your mastery of the ki flowing through you\n" +
            "makes you immune to disease and poison.\n"
            );

    public static final Feature tongueofthesunandMoon = new Feature(13, "Tongue of the Sun and Moon", "Starting at 13th level, you learn to touch the ki of other\n" +
            "minds so that you understand all spoken languages.\n" +
            "Moreover, any creature that can understand a language\n" +
            "can understand what you say.\n"
            );

    //Timeless body level 15

    public static final Feature emptyBody = new Feature (18, "Empty Body", "Beginning at 18th level, you can use your action to\n" +
            "spend 4 ki points to become invisible for 1 minute.\n" +
            "During that time, you also have resistance to all damage\n" +
            "but force damage.\n" +
            "Additionally, you can spend 8 ki points to cast the\n" +
            "astral projection spell, without needing material\n" +
            "components. When you do so, you can’t take any other\n" +
            "creatures with you.\n"
            );

    public static final Feature perfectSelf = new Feature(20, "Perfect Self", "At 20th level, when you roll for initiative and have no ki\n" +
            "points remaining, you regain 4 ki points.\n"
            );

    //Paladin
    //TODO 10/18/2020

    public static final Feature divineSense = new Feature(1, "Divine Sense", "The presence of strong evil registers on your senses like\n" +
            "a noxious odor, and powerful good rings like heavenly\n" +
            "music in your ears. As an action, you can open your\n" +
            "awareness to detect such forces. Until the end of your\n" +
            "next turn, you know the location of any celestial, fiend,\n" +
            "or undead within 60 feet of you that is not behind total\n" +
            "cover. You know the type (celestial, fiend, or undead) of\n" +
            "any being whose presence you sense, but not its identity\n" +
            "(the vampire Count Strahd von Zarovich, for instance).\n" +
            "Within the same radius, you also detect the presence\n" +
            "of any place or object that has been consecrated or\n" +
            "desecrated, as with the hallow spell.\n" +
            "You can use this feature a number of times equal to\n" +
            "1 + your Charisma modifier. When you finish a long rest,\n" +
            "you regain all expended uses.\n"
            );

    public static final Feature layonHands = new Feature (1, "Lay on Hands", "Your blessed touch can heal wounds. You have a pool\n" +
            "of healing power that replenishes when you take a long\n" +
            "rest. With that pool, you can restore a total number of\n" +
            "hit points equal to your paladin level x 5.\n" +
            "As an action, you can touch a creature and draw\n" +
            "power from the pool to restore a number of hit points\n" +
            "to that creature, up to the maximum amount remaining\n" +
            "in your pool.\n" +
            "Alternatively, you can expend 5 hit points from your\n" +
            "pool of healing to cure the target of one disease or\n" +
            "neutralize one poison affecting it. You can cure multiple\n" +
            "diseases and neutralize multiple poisons with a single\n" +
            "use of Lay on Hands, expending hit points separately\n" +
            "for each one.\n" +
            "This feature has no effect on undead and constructs.\n"
            );

    public static final Feature spellcastingPaladin = new Feature (2, "Spellcasting", "By 2nd level, you have learned to draw on divine\n" +
            "magic through meditation and prayer to cast spells as\n" +
            "a cleric does. See chapter 10 for the general rules of\n" +
            "spellcasting and chapter 11 for the paladin spell list.\n\n" +

            "Preparing and Casting Spells\n" +
            "The Paladin table shows how many spell slots you have\n" +
            "to cast your spells. To cast one of your paladin spells of\n" +
            "1st level or higher, you must expend a slot of the spell’s\n" +
            "level or higher. You regain all expended spell slots when\n" +
            "you finish a long rest.\n" +
            "You prepare the list of paladin spells that are available\n" +
            "for you to cast, choosing from the paladin spell list.\n" +
            "When you do so, chose a num ber of paladin spells\n" +
            "equal to your Charisma modifier + half your paladin\n" +
            "level, rounded down (minimum of one spell). The spells\n" +
            "must be of a level for which you have spell slots.\n" +
            "For example, if you are a 5th-level paladin, you have\n" +
            "four 1st-level and two 2nd-level spell slots. With a\n" +
            "Charisma of 14, your list of prepared spells can include\n" +
            "four spells of 1st or 2nd level, in any combination. If you\n" +
            "prepare the 1st-level spell cure wounds, you can cast\n" +
            "it using a 1st-level or a 2nd-level slot. Casting the spell\n" +
            "doesn’t remove it from your list of prepared spells.\n" +
            "You can change your list of prepared spells when you\n" +
            "finish a long rest. Preparing a new list of paladin spells\n" +
            "requires time spent in prayer and meditation: at least 1\n" +
            "minute per spell level for each spell on your list.\n\n" +

            "Spellcasting Ability\n" +
            "Charisma is your spellcasting ability for your paladin\n" +
            "spells, since their pow er derives from the strength of\n"+
            "your convictions. You use your Charisma whenever a\n" +
            "spell refers to your spellcasting ability. In addition, you\n" +
            "use your Charisma m odifier when setting the saving\n" +
            "throw DC for a paladin spell you cast and when making\n" +
            "an attack roll with one.\n\n" +

            "Spell save DC = 8 + your proficiency bonus +\n" +
            "your Charisma modifier\n" +
            "Spell attack modifier = your proficiency bonus +\n" +
            "your Charisma modifier\n\n" +

            "Spellcasting Ability\n" +
            "You can use a holy sym bol (found in chapter 5) as a\n" +
            "spellcasting focus for your paladin spells.\n"
            );

    public static final Feature divineSmite = new Feature(2, "Divine Smite", "Starting at 2nd level, when you hit a creature with a\n" +
            "melee weapon attack, you can expend one paladin spell\n" +
            "slot to deal radiant damage to the target, in addition to\n" +
            "the weapon’s damage. The extra damage is 2d8 for a\n" +
            "1st-level spell slot, plus 1d8 for each spell level higher\n" +
            "than 1st, to a maximum of 5d8. The damage increases\n" +
            "by 1d8 if the target is an undead or a fiend.\n"
            );

    public static final Feature divineHealth = new Feature(3, "Divine Health", "By 3rd level, the divine magic flowing through you\n" +
            "makes you immune to disease.\n"
            );

    public static final Feature sacredOath = new Feature(3, "Sacred Oath", "When you reach 3rd level, you swear the oath that binds\n" +
            "you as a paladin forever. Up to this time you have been\n" +
            "in a preparatory stage, committed to the path but not\n" +
            "yet sworn to it. N ow you choose the Oath of Devotion,\n" +
            "the Oath of the Ancients, or the Oath of Vengeance, all\n" +
            "detailed at the end of the class description.\n" +
            "Your choice grants you features at 3rd level and again\n" +
            "at 7th, 15th, and 20th level. Those features include oath\n" +
            "spells and the Channel Divinity feature.\n\n" +

            "Oath Spells\n" +
            "Each oath has a list of associated spells. You gain\n" +
            "access to these spells at the levels specified in the oath\n" +
            "description. Once you gain access to an oath spell, you\n" +
            "always have it prepared. Oath spells don’t count against\n" +
            "the number of spells you can prepare each day.\n" +
            "If you gain an oath spell that doesn’t appear on the\n" +
            "paladin spell list, the spell is nonetheless a paladin\n" +
            "spell for you.\n\n" +

            "Channel Divinity\n" +
            "Your oath allows you to channel divine energy to fuel\n" +
            "magical effects. Each Channel Divinity option provided\n" +
            "by your oath explains how to use it.\n" +
            "When you use your Channel Divinity, you choose\n" +
            "which option to use. You must then finish a short or long\n" +
            "rest to use your Channel Divinity again.\n" +
            "Some Channel Divinity effects require saving throws.\n" +
            "When you use such an effect from this class, the DC\n" +
            "equals your paladin spell save DC.\n"
            );

    //Ability Score Imporvement level 4
    //Extra Attack level 5

    public static final Feature auraofProtection = new Feature(6, "Aura of Protection", "Starting at 6th level, whenever you or a friendly creature\n" +
            "within 10 feet of you must make a saving throw, the\n" +
            "creature gains a bonus to the saving throw equal to your\n" +
            "Charisma m odifier (with a minim um bonus of +1). You\n" +
            "must be conscious to grant this bonus.\n" +
            "At 18th level, the range of this aura increases to 30 feet.\n"
            );

    public static final Feature auraofCourage = new Feature(10, "Aura of Courage", "Starting at 10th level, you and friendly creatures\n" +
            "within 10 feet of you can’t be frightened while you\n" +
            "are conscious.\n" +
            "At 18th level, the range of this aura increases to 30 feet.\n"
            );

    public static final Feature improveddivineSmite = new Feature (11, "Improved Divine Smite", "By 11th level, you are so suffused with righteous\n" +
            "might that all your melee weapon strikes carry divine\n" +
            "power with them. Whenever you hit a creature with a\n" +
            "melee weapon, the creature takes an extra 1d8 radiant\n" +
            "damage. If you also use your Divine Smite with an\n" +
            "attack, you add this damage to the extra damage of your\n" +
            "Divine Smite.\n"
    );

    public static final Feature cleansingTouch = new Feature(14, "Cleansing Touch", "Beginning at 14th level, you can use your action to\n" +
            "end one spell on yourself or on one willing creature\n" +
            "that you touch.\n" +
            "You can use this feature a number of times equal\n" +
            "to your Charisma modifier (a minimum of once). You\n" +
            "regain expended uses when you finish a long rest.\n"
    );

    //Ranger Class
    //TODO 10/18/2020 Ranger Archetypes: Hunter, Beast Master

    public static final Feature favoredEnemy = new Feature(1, "Favored Enemy", "Beginning at 1st level, you have significant experience\n" +
            "studying, tracking, hunting, and even talking to a certain\n" +
            "type of enemy.\n" +
            "Choose a type of favored enemy: aberrations,\n" +
            "beasts, celestials, constructs, dragons, elementals, fey,\n" +
            "fiends, giants, monstrosities, oozes, plants, or undead.\n" +
            "Alternatively, you can select two races of humanoid\n" +
            "(such as gnolls and orc s) as favored enemies.\n" +
            "You have advantage on W isdom (Survival) checks to\n" +
            "track your favored enem ies, as w ell as on Intelligence\n" +
            "checks to recall information about them.\n" +
            "W hen you gain this feature, you also learn one\n" +
            "language of your choice that is spoken by your favored\n" +
            "enemies, if they speak one at all.\n" +
            "You ch oose one additional favored enemy, as well as\n" +
            "an associated language, at 6th and 14th level. As you\n" +
            "gain levels, your choices should reflect the types of\n" +
            "monsters you have encountered on your adventures." );

    public static final Feature naturalExplorer = new Feature(1, "Natural Explorer", "You are particularly familiar with one type of natural\n" +
            "environment and are adept at traveling and surviving in\n" +
            "such regions. Choose one type of favored terrain: arctic,\n" +
            "coast, desert, forest, grassland, mountain, swamp,\n" +
            "or the Underdark. W hen you make an Intelligence or\n" +
            "Wisdom check related to your favored terrain, your\n" +
            "proficiency bonus is doubled if you are using a skill that\n" +
            "you’re proficient in.\n" +
            "While traveling for an hour or m ore in your favored\n" +
            "terrain, you gain the following benefits:\n" +
            "• Difficult terrain doesn’t slow your group’s travel.\n" +
            "• Your group can’t become lost except by magical\n" +
            "means.\n" +
            "• Even when you are engaged in another activity while\n" +
            "traveling (such as foraging, navigating, or tracking),\n" +
            "you remain alert to danger.\n" +
            "• If you are traveling alone, you can move stealthily at\n" +
            "a normal pace.\n" +
            "• When you forage, you find twice as much food as you\n" +
            "normally would.\n" +
            "• While tracking other creatures, you also learn their\n" +
            "exact number, their sizes, and how long ago they\n" +
            "passed through the area.\n" +
            "You choose additional favored terrain types at 6th\n" +
            "and 10th level.\n"
            );

    //Fighting Style Level 2

    public static final Feature spellcastingRogue = new Feature(2, "Spellcasting", "By the time you reach 2nd level, you have learned to\n" +
            "use the magical essence of nature to cast spells, much\n" +
            "as a druid does. See chapter 10 for the general rules of\n" +
            "spellcasting and chapter 11 for the ranger spell list.\n\n" +

            "Spell Slots\n" +
            "The Ranger table shows how many spell slots you have\n" +
            "to cast your spells of 1st level and higher. To cast one of\n" +
            "these spells, you must expend a slot of the spell’s level\n" +
            "or higher. You regain all expended spell slots when you\n" +
            "finish a long rest.\n" +
            "For example, if you know the 1st-level spell animal\n" +
            "friendship and have a 1st-level and a 2nd-level spell slot\n" +
            "available, you can cast animal friendship using either slot.\n\n" +

            "Spells known of 1st level and higher\n" +
            "You know two 1st-level spells of your choice from the\n" +
            "ranger spell list.\n" +
            "The Spells Known column of the Ranger table shows\n" +
            "when you learn more ranger spells of your choice. Each\n" +
            "of these spells must be of a level for which you have\n"+
            "spell slots. For instance, when you reach 5th level in this\n" +
            "class, you can learn one new spell of 1st or 2nd level.\n" +
            "Additionally, when you gain a level in this class,\n" +
            "you can ch oose one of the ranger spells you know\n" +
            "and replace it with another spell from the ranger\n" +
            "spell list, which also must be of a level for which you\n" +
            "have spell slots.\n\n" +

            "Spellcasting Ability\n" +
            "Wisdom is your spellcasting ability for your ranger\n" +
            "spells, since your magic draws on your attunement to\n" +
            "nature. You use your Wisdom whenever a spell refers\n" +
            "to your spellcasting ability. In addition, you use your\n" +
            "Wisdom modifier w hen setting the saving throw DC for\n" +
            "a ranger spell you cast and when making an attack roll\n" +
            "with one.\n\n" +
            "Spell save DC = 8 + your proficiency bonus +\n" +
            "your Wisdom modifier\n" +
            "Spell attack modifier = your proficiency bonus +\n" +
            "your Wisdom modifier\n"
            );

    public static final Feature rangerArchetype = new Feature(3, "Ranger Archetype","At 3rd level, you choose an archetype that you strive\n" +
            "to emulate: Hunter or Beast Master, both detailed at\n" +
            "the end of the class description. Your choice grants\n" +
            "you features at 3rd level and again at 7th, 11th,\n" +
            "and 15th level.\n"
            );

    public static final Feature primevalAwareness = new Feature(3, "Primeval Awareness", "Beginning at 3rd level, you can use your action and\n" +
            "expend one ranger spell slot to focus your awareness on\n" +
            "the region around you. For 1 minute per level of the spell\n" +
            "slot you expend, you can sense whether the following\n" +
            "types of creatures are present within 1 mile of you (or\n" +
            "within up to 6 miles if you are in your favored terrain):\n" +
            "aberrations, celestials, dragons, elementals, fey, fiends,\n" +
            "and undead. This feature doesn’t reveal the creatures’\n" +
            "location or number."
            );

    //Ability Score Improvement Level 4
    //Extra Attack Level 5

    public static final Feature landsStride = new Feature(8, "Land's Stride", "Starting at 8th level, moving through nonmagical\n" +
            "difficult terrain costs you no extra movement. You can\n" +
            "also pass through nonmagical plants without being\n" +
            "slowed by them and without taking damage from them if\n" +
            "they have thorns, spines, or a similar hazard.\n" +
            "In addition, you have advantage on saving throws\n" +
            "against plants that are magically created or manipulated\n" +
            "to impede movement, such those created by the\n" +
            "entangle spell.\n"
            );

    public static final Feature hideinplainSight = new Feature(10, "Hide in Plain Sight", "Starting at 10th level, you can spend 1 minute creating\n" +
            "camouflage for yourself. You must have access to fresh\n" +
            "mud, dirt, plants, soot, and other naturally occurring\n" +
            "materials with which to create your camouflage.\n" +
            "Once you are camouflaged in this way, you can try\n" +
            "to hide by pressing yourself up against a solid surface,\n" +
            "such as a tree or wall, that is at least as tall and wide\n" +
            "as you are. You gain a +10 bonus to Dexterity (Stealth)\n" +
            "checks as long as you remain there without moving or\n" +
            "taking actions. Once you move or take an action or a\n" +
            "reaction, you must camouflage yourself again to gain\n" +
            "this benefit.\n"
            );

    public static final Feature Vanish = new Feature (14, "Vanish", "Starting at 14th level, you can use the Hide action as a\n" +
            "bonus action on your turn. Also, you can’t be tracked by\n" +
            "nonmagical means, unless you choose to leave a trail.\n"
             );

    public static final Feature feralSenses = new Feature (18, "Feral Senses", "At 18th level, you gain preternatural senses that help\n" +
            "you fight creatures you can’t see. W hen you attack a\n" +
            "creature you can’t see, your inability to see it doesn’t\n" +
            "im pose disadvantage on your attack rolls against it.\n" +
            "You are also aware of the location of any invisible\n" +
            "creature within 30 feet of you, provided that the\n" +
            "creature isn’t hidden from you and you aren’t\n" +
            "blinded or deafened.\n"
            );

    public static final Feature foeSlayer = new Feature (20, "Foe Slayer", "At 20th level, you become an unparalleled hunter of your\n" +
            "enemies. Once on each of your turns, you can add your\n" +
            "Wisdom modifier to the attack roll or the damage roll of\n" +
            "an attack you make against one of your favored enemies.\n" +
            "You can choose to use this feature before or after the\n" +
            "roll, but before any effects of the roll are applied.\n"
            );
	
//Sourcerer Features
// TODO 10/18/2020 expand on sourcerous orgin feature: Draconic, Bloodline or Wild Magic.

public static final Feature spellcastingSourcerer = new Feature(1, "Spellcasting", "An event in your past, or in the life of a parent or\n" + 
		"ancestor, left an indelible mark on you, infusing you with\n" + 
		"arcane m agic. This font of magic, whatever its origin,\n" + 
		"fuels your spells. See chapter 10 for the general rules of\n" + 
		"spellcasting and chapter 11 for the sorcerer spell list.\n" + 
		"\nCantrips\n" + 
		"At 1st level, you know four cantrips of your choice from\n" + 
		"the sorcerer spell list. You learn additional sorcerer\n" + 
		"cantrips of your choice at higher levels, as shown in the\n" + 
		"Cantrips Known column of the Sorcerer table.\n" + 
		"\nSpellSlots\n" + 
		"The Sorcerer table show s how many spell slots you\n" + 
		"have to cast your spells of 1st level and higher. To cast\n" + 
		"one of these sorcerer spells, you must expend a slot of\n" + 
		"the spell’s level or higher. You regain all expended spell\n" + 
		"slots w hen you finish a long rest.\n" + 
		"\tFor example, if you know the 1st-level spell burning\n" + 
		"hands and have a 1st-level and a 2nd-level spell slot\n" + 
		"available, you can cast burning hands using either slot.\n" + 
		"\nSpells Known of 1st Level and Higher\n" + 
		"You know two 1st-level spells of your choice from the\n" + 
		"sorcerer spell list.\n" + 
		"\tThe Spells Known column of the Sorcerer table\n" + 
		"show s when you learn more sorcerer spells of your\n" + 
		"choice. Each of these spells must be of a level for which\n" + 
		"you have spell slots. For instance, when you reach 3rd\n" + 
		"level in this class, you can learn one new spell of 1st\n" + 
		"or 2nd level.\n" + 
		"\tAdditionally, when you gain a level in this class,\n" + 
		"you can choose one of the sorcerer spells you know\n" + 
		"and replace it with another spell from the sorcerer\n" + 
		"spell list, which also must be of a level for w hich you\n" + 
		"have spell slots.\n" + 
		"\nSpell casting Ability\n" + 
		"Charisma is your spellcasting ability for your sorcerer\n" + 
		"spells, since the pow er of your m agic relies on your\n" + 
		"ability to project your w ill into the world. You use your\n" + 
		"Charisma whenever a spell refers to your spellcasting\n" + 
		"ability. In addition, you use your Charisma modifier\n" + 
		"when setting the saving throw DC for a sorcerer spell\n" + 
		"you cast and w hen making an attack roll with one.\n" + 
		"Spell save DC = 8 + your proficiency bonus +\n" + 
		"your Charisma modifier\n" + 
		"Spell attack modifier = your proficiency bonus +\n" + 
		"your Charisma modifier\n" + "\n Spellcasting Focus\n" + 
		"You can use an arcane focus (found in chapter 5) as a\n" + 
		"spellcasting focus for your sorcerer spells.");

public static final Feature sorcerousOrgin = new Feature(1, "Sorcerours Orgin","Choose a sorcerous origin, which describes the\n" + 
		"source of your innate magical power: Draconic\n" + 
		"Bloodline or Wild Magic, both detailed at the end of the\n" + 
		"class description.\n" + 
		"\tYour choice grants you features when you choose it at\n" + 
		"1st level and again at 6th, 14th, and 18th level.");

public static final Feature fontOfMagic = new Feature(2, "Font of Magic", "At 2nd level, you tap into a deep wellspring of magic\n" + 
		"within yourself. This wellspring is represented by\n" + 
		"sorcery points, which allow you to create a variety of\n" + 
		"magical effects.\n" + 
		"\nSorcery Points\n" + 
		"You have 2 sorcery points, and you gain m ore as you\n" + 
		"reach higher levels, as shown in the Sorcery Points\n" + 
		"column of the Sorcerer table. You can never have\n" + 
		"m ore sorcery points than shown on the table for your\n" + 
		"level. You regain all spent sorcery points when you\n" + 
		"finish a long rest.\n" + 
		"\nFlexible Casting\n" + 
		"You can use your sorcery points to gain additional spell\n" + 
		"slots, or sacrifice spell slots to gain additional sorcery\n" + 
		"points. You learn other ways to use your sorcery points\n" + 
		"as you reach higher levels.\n" + 
		"\tCreating Spell Slots. You can transform unexpended\n" + 
		"sorcery points into one spell slot as a bonus action on\n" + 
		"your turn. The Creating Spell Slots table show s the cost\n" + 
		"of creating a spell slot of a given level. You can create\n" + 
		"spell slots no higher in level than 5th.\n" + 
		"\nCreating Spell Slots\n" + 
		"Spell Slot Sorcery\n" + 
		"Level Point Cost\n" + 
		"1st 2\n" + 
		"2nd 3\n" + 
		"3rd 5\n" + 
		"4th 6\n" + 
		"5th 7\n" + 
		"\tConverting a Spell Slot to Sorcery Points. As a\n" + 
		"bonus action on your turn, you can expend one spell\n" + 
		"slot and gain a number of sorcery points equal to the\n" + 
		"slot’s level.\n" );

public static final Feature metamagic = new Feature(3, "Metamagic", "At 3rd level, you gain the ability to twist your spells\n" + 
		"to suit your needs. You gain two of the following\n" + 
		"Metamagic options of your choice. You gain another one\n" + 
		"at 10th and 17th level.\n" + 
		"\tYou can use only one M etam agic option on a spell\n" + 
		"w hen you cast it, unless otherwise noted." + "\nCareful Spell\n" + 
				"W hen you cast a spell that forces other creatures to make\n" + 
				"a saving throw, you can protect some of those creatures\n" + 
				"from the spell’s full force. To do so, you spend 1 sorcery\n" + 
				"point and choose a number o f those creatures up to your\n" + 
				"Charisma modifier (minimum of one creature). A chosen\n" + 
				"creature automatically succeeds on its saving throw\n" + 
				"against the spell.\n" + 
				"\nDistant Spell\n" + 
				"When you cast a spell that has a range of 5 feet or\n" + 
				"greater, you can spend 1 sorcery point to double the\n" + 
				"range of the spell.\n" + 
				"\tWhen you cast a spell that has a range of touch, you\n" + 
				"can spend 1 sorcery point to make the range of the\n" + 
				"spell 30 feet.\n" + 
				"\nEmpowered Spell\n" + 
				"When you roll damage for a spell, you can spend 1\n" + 
				"sorcery point to reroll a number of the damage dice up\n" + 
				"to your Charisma modifier (minimum of one). You must\n" + 
				"use the new rolls.\n" + 
				"\tYou can use Empowered Spell even if you have\n" + 
				"already used a different Metamagic option during the\n" + 
				"casting of the spell.\n" + 
				"\nExtended Spell\n" + 
				"When you cast a spell that has a duration of 1 minute\n" + 
				"or longer, you can spend 1 sorcery point to double its\n" + 
				"duration, to a maximum duration of 24 hours.\n" + 
				"\nHeightened Spell\n" + 
				"When you cast a spell that forces a creature to make a\n" + 
				"saving throw to resist its effects, you can spend 3 sorcery\n" + 
				"points to give one target of the spell disadvantage on its\n" + 
				"first saving throw made against the spell.\n" + 
				"\nQuickened Spell\n" + 
				"When you cast a spell that has a casting time of 1 action,\n" + 
				"you can spend 2 sorcery points to change the casting\n" + 
				"time to 1 bonus action for this casting.\n" + 
				"\nSubtle Spell\n" + 
				"When you cast a spell, you can spend 1 sorcery point to\n" + 
				"cast it without any som atic or verbal components.\n" + 
				"\nTwinned Spell\n" + 
				"When you cast a spell that targets only one creature and\n" + 
				"doesn’t have a range of self, you can spend a number of\n" + 
				"sorcery points equal to the spell’s level to target a second\n" + 
				"creature in range with the same spell (1 sorcery point if\n" + 
				"the spell is a cantrip).\n" );

public static final Feature sorcerousRestoration = new Feature(20, "Sorcerous Restoration","At 20th level, you regain 4 expended sorcery points\n" + 
		"whenever you finish a short rest." );


//Rogue Features
//TODO 10/18/2020 expand on rogue archetypes: Theif, Assasin, Arcane Trickster.
public static final Feature  rogueExpertise = new Feature(1, "Expertise", "At 1st level, choose two of your skill proficiencies, or\n" + 
		"one of your skill proficiencies and your proficiency with\n" + 
		"thieves’ tools. Your proficiency bonus is doubled for any\n" + 
		"ability check you make that uses either of the chosen\n" + 
		"proficiencies.\n" + 
		"\tAt 6th level, you can choose two more of your\n" + 
		"proficiencies (in skills or with thieves’ tools) to gain\n" + 
		"this benefit.\n" );
public static final Feature sneakAttack = new Feature(1, "Sneak Attack", "Beginning at 1st level, you know how to strike subtly\n" + 
		"and exploit a foe’s distraction. Once per turn, you can\n" + 
		"deal an extra 1d6 damage to one creature you hit with\n" + 
		"an attack if you have advantage on the attack roll. The\n" + 
		"attack must use a finesse or a ranged weapon.\n" + 
		"\tYou don’t need advantage on the attack roll if another\n" + 
		"enemy of the target is within 5 feet of it, that enemy\n" + 
		"isn’t incapacitated, and you don’t have disadvantage on\n" + 
		"the attack roll.\n" + 
		"\tThe amount of the extra damage increases as you\n" + 
		"gain levels in this class, as show n in the Sneak Attack\n" + 
		"column of the Rogue table.");

public static final Feature theivesCant = new Feature(1, "Theives' Cant", "During your rogue training you learned thieves’ cant, a\n" + 
		"secret mix of dialect, jargon, and code that allows you to\n" + 
		"hide messages in seem ingly normal conversation. Only\n" + 
		"another creature that knows thieves’ cant understands\n" + 
		"such messages. It takes four times longer to convey such\n" + 
		"a message than it does to speak the same idea plainly.\n" + 
		"\tIn addition, you understand a set of secret signs and\n" + 
		"symbols used to convey short, simple messages, such\n" + 
		"as whether an area is dangerous or the territory of a\n" + 
		"thieves’ guild, whether loot is nearby, or whether the\n" + "people in an area are easy marks or will provide a safe\n" + 
				"house for thieves on the run.");

public static final Feature cunningAction = new Feature(2, "Cunning Action", "Starting at 2nd level, your quick thinking and agility\n" + 
		"allow you to move and act quickly. You can take a\n" + 
		"bonus action on each of your turns in combat. This\n" + 
		"action can be used only to take the Dash, Disengage,\n" + 
		"or Hide action." );

public static final Feature roguishArchetype = new Feature(3, "Roguish Archetype", "At 3rd level, you choose an archetype that you emulate\n" + 
		"in the exercise of your rogue abilities: Thief, Assassin,\n" + 
		"or Arcane Trickster, all detailed at the end of the class\n" + 
		"description. Your archetype choice grants you features\n" + 
		"at 3rd level and then again at 9th, 13th, and 17th level." );

public static final Feature uncannyDodge = new Feature(5, "Uncanny Dodge", "Starting at 5th level, when an attacker that you can see\n" + 
		"hits you with an attack, you can use your reaction to\n" + 
		"halve the attack’s damage against you." );

public static final Feature evasion = new Feature(7, "Evasion", "Beginning at 7th level, you can nimbly dodge out o f the\n" + 
		"way of certain area effects, such as a red dragon’s fiery\n" + 
		"breath or an ice storm spell. When you are subjected\n" + 
		"to an effect that allows you to m ake a Dexterity saving\n" + 
		"throw to take only half damage, you instead take no\n" + 
		"damage if you succeed on the saving throw, and only\n" + 
		"half damage if you fail." );

public static final Feature reliableTalent = new Feature(11, "Reliable Talent", "By 11th level, you have refined your chosen skills until\n" + 
		"they approach perfection. Whenever you make an ability\n" + 
		"check that lets you add your proficiency bonus, you can\n" + 
		"treat a d20 roll of 9 or lower as a 10." );

public static final Feature blindsense = new Feature(14, "Blindsense",  "Starting at 14th level, if you are able to hear, you are\n" + 
		"aware of the location of any hidden or invisible creature\n" + 
		"within 10 feet of you.");

public static final Feature slipperyMind = new Feature(15, "Slippery Mind", "By 15th level, you have acquired greater mental\n" + 
		"strength. You gain proficiency in Wisdom saving throws." );

public static final Feature elusive = new Feature(18, "Elusive", "Beginning at 18th level, you are so evasive that\n" + 
		"attackers rarely gain the upper hand against you. No\n" + 
		"attack roll has advantage against you while you aren’t\n" + 
		"incapacitated.");

public static final Feature strokeOfLuck = new Feature(20, "Stroke Of Luck", "At 20th level, you have an uncanny knack for succeeding\n" + 
		"w hen you need to. If your attack misses a target within\n" + 
		"range, you can turn the m iss into a hit. Alternatively, if\n" + 
		"you fail an ability check, you can treat the d20 roll as a 20.\n" + 
		"\tOnce you use this feature, you can’t use it again until\n" + 
		"you finish a short or long rest.");	

//Warlock Features
//TODO 10/18/2020 expand on otherworldly patron: the Archfey, the Fiend, and the Great Old One
//		  expand on pact boon: pact of the chain, pact of the blade, and pact of the tome

public static final Feature otherworldlyPatron = new Feature(1, "otherworldlyPatron", "At 1st level, you have struck a bargain with an\n" + 
		"otherworldly being of your choice: the Archfey, the\n" + 
		"Fiend, or the Great Old One, each of which is detailed\n" + 
		"at the end of the class description. Your choice\n" + 
		"grants you features at 1st level and again at 6th, 10th,\n" + 
		"and 14th level.");

public static final Feature pactMagic = new Feature(1, "Pact Magic", "Your arcane research and the magic bestow ed on you\n" + 
		"by your patron have given you facility with spells. See\n" + 
		"chapter 10 for the general rules of spellcasting and\n" + 
		"chapter 11 for the w arlock spell list.\n" + 
		"\nCantrips\n" + 
		"You know two cantrips of your choice from the warlock\n" + 
		"spell list. You learn additional warlock cantrips of your\n" + 
		"choice at higher levels, as shown in the Cantrips Known\n" + 
		"column of the Warlock table.\n" + 
		"\nSpell Slots\n" + 
		"The Warlock table shows how many spell slots you have.\n" + 
		"The table also shows what the level of those slots is; all\n" + 
		"of your spell slots are the same level. To cast one of your\n" + 
		"warlock spells of 1st level or higher, you must expend a\n" + 
		"spell slot. You regain all expended spell slots when you\n" + 
		"finish a short or long rest.\n" + 
		"\tFor example, when you are 5th level, you have\n" + 
		"two 3rd-level spell slots. To cast the 1st-level spell\n" + 
		"thunderwave, you must spend one of those slots, and\n" + 
		"you cast it as a 3rd-level spell.\n" + 
		"\nSpells Known of 1st Level and Higher\n" + 
		"At 1st level, you know two 1st-level spells of your choice\n" + 
		"from the warlock spell list.\n" + 
		"\tThe Spells Known column of the Warlock table shows\n" + 
		"when you learn more warlock spells of your choice of 1st\n" + 
		"level and higher. A spell you choose must be of a level\n" + 
		"no higher than what’s show n in the table's Slot Level\n" + 
		"column for your level. W hen you reach 6th level, for\n" + 
		"example, you learn a new warlock spell, which can be\n" + 
		"1st, 2nd, or 3rd level." + "\n\tAdditionally, when you gain a level in this class,\n" + 
				"you can choose one of the warlock spells you know\n" + 
				"and replace it with another spell from the warlock\n" + 
				"spell list, which also must be of a level for which you\n" + 
				"have spell slots.\n" + 
				"\nSpellcasting Ability\n" + 
				"Charisma is your spellcasting ability for your warlock\n" + 
				"spells, so you use your Charisma whenever a spell refers\n" + 
				"to your spellcasting ability. In addition, you use your\n" + 
				"Charisma modifier w hen setting the saving throw DC\n" + 
				"for a w arlock spell you cast and when making an attack\n" + 
				"roll with one.\n" + 
				"Spell save DC = 8 + your proficiency bonus +\n" + 
				"your Charisma modifier\n" + 
				"Spell attack modifier = your proficiency bonus +\n" + 
				"your Charisma modifier\n" + 
				"\n" + 
				"\nSpellcasting Focus\n" + 
				"You can use an arcane focus (found in chapter 5) as a\n" + 
				"spellcasting focus for your warlock spells." );

public static final Feature  eldridgeInvocations = new Feature(2, "Eldridge Invocations", "In your study of occult lore, you have unearthed eldritch\n" + 
		"invocations, fragments of forbidden knowledge that\n" + 
		"imbue you with an abiding magical ability.\n" + 
		"\tAt 2nd level, you gain two eldritch invocations of your\n" + 
		"choice. Your invocation options are detailed at the end\n" + 
		"of the class description. When you gain certain w arlock\n" + 
		"levels, you gain additional invocations of your choice,\n" + 
		"as show n in the Invocations Known colum n of the\n" + 
		"Warlock table.\n" + 
		"\tAdditionally, when you gain a level in this class,\n" + 
		"you can choose one of the invocations you know and\n" + 
		"replace it with another invocation that you could learn\n" + 
		"at that level." );

public static final Feature pactBoon = new Feature(3, "Pact Boon", "At 3rd level, your otherworldly patron bestow s a gift\n" + 
		"upon you for your loyal service. You gain one of the\n" + 
		"following features of your choice.\n" + 
		"\nPact of the Chain\n" + 
		"You learn the find familiar spell and can cast it as a\n" + 
		"ritual. The spell doesn’t count against your number of\n" + 
		"spells known.\n" + 
		"\tWhen you cast the spell, you can choose one of the\n" + 
		"norm al form s for your familiar or one of the following\n" + 
		"special forms: imp, pseudodragon, quasit, or sprite.\n" + 
		"\tAdditionally, when you take the Attack action, you can\n" + 
		"forgo one of your own attacks to allow your familiar to\n" + 
		"make one attack o f its own.\n" + 
		"\nPact of the Blade\n" + 
		"You can use your action to create a pact weapon in your\n" + 
		"empty hand. You can choose the form that this melee\n" + 
		"weapon takes each time you create it (see chapter 5 for\n" + 
		"weapon options). You are proficient with it while you\n" + 
		"wield it. This w eapon counts as m agical for the purpose\n" + 
		"of overcom ing resistance and immunity to nonm agical\n" + 
		"attacks and damage." + "\tYour pact weapon disappears if it is m ore than 5 feet\n" + 
				"away from you for 1 minute or more. It also disappears\n" + 
				"if you use this feature again, if you dismiss the weapon\n" + 
				"(no action required), or if you die.\n" + 
				"\tYou can transform one magic weapon into your pact\n" + 
				"weapon by performing a special ritual while you hold\n" + 
				"the weapon. You perform the ritual over the course\n" + 
				"of 1 hour, which can be done during a short rest.\n" + 
				"You can then dismiss the weapon, shunting it into an\n" + 
				"extradimensional space, and it appears whenever you\n" + 
				"create your pact weapon thereafter. You can’t affect an\n" + 
				"artifact or a sentient w eapon in this way. The weapon\n" + 
				"ceases being your pact weapon if you die, if you perform\n" + 
				"the 1-hour ritual on a different weapon, or if you use\n" + 
				"a 1-hour ritual to break your bond to it. The weapon\n" + 
				"appears at your feet if it is in the extradimensional space\n" + 
				"when the bond breaks.\n" + 
				"\nPact of the Tome\n" + 
				"Your patron gives you a grimoire called a Book of\n" + 
				"Shadows. W hen you gain this feature, choose three\n" + 
				"cantrips from any class’s spell list. While the book is on\n" + 
				"your person, you can cast those cantrips at will. They\n" + 
				"don’t count against your number of cantrips known.\n" + 
				"\tIf you lose your Book o f Shadows, you can perform\n" + 
				"a 1-hour cerem ony to receive a replacement from your\n" + 
				"patron. This ceremony can be performed during a short\n" + 
				"or long rest, and it destroys the previous book. The book\n" + 
				"turns to ash when you die.");

public static final Feature  mysticArcanum = new Feature(6, "Mystic Arcanum", "At 11th level, your patron bestow s upon you a magical\n" + 
		"secret called an arcanum. Choose one 6th-level spell\n" + 
		"from the warlock spell list as this arcanum.\n" + 
		"You can cast your arcanum spell once without\n" + 
		"expending a spell slot. You must finish a long rest before\n" + 
		"you can do so again.\n" + 
		"\tAt higher levels, you gain more warlock spells of your\n" + 
		"choice that can be cast in this way: one 7th-level spell\n" + 
		"at 13th level, one 8th-level spell at 15th level, and one\n" + 
		"9th-level spell at 17th level. You regain all uses of your\n" + 
		"Mystic Arcanum when you finish a long rest.");

public static final Feature  eldritchMaster = new Feature(20, "Eldritch Master", "At 20th level, you can draw on your inner reserve of\n" + 
		"mystical power while entreating your patron to regain\n" + 
		"expended spell slots. You can spend 1 minute entreating\n" + 
		"your patron for aid to regain all your expended spell slots\n" + 
		"from your Pact Magic feature. Once you regain spell slots\n" + 
		"with this feature, you must finish a long rest before you\n" + 
		"can do so again." );

	
}
