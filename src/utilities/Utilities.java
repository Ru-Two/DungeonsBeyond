package utilities;

public final class Utilities {

    public static final Dice d100 = new Dice(100);
    public static final Dice d20 = new Dice(20);
    public static final Dice d12 = new Dice(12);
    public static final Dice d10 = new Dice(10);
    public static final Dice d8 = new Dice(8);
    public static final Dice d6 = new Dice(6);
    public static final Dice d4 = new Dice(4);

    public static final int[] proficiencies = {0,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};

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
    public static final int PERSUASSION = 13;
    public static final int RELIGION = 14;
    public static final int SLEIGHT_OF_HAND = 15;
    public static final int STEALTH = 16;
    public static final int SURVIVAL = 17;
    

    //weapon types
    public static final int SIMPLE_MELEE = 0;
    public static final int SIMPLE_RANGED = 1;
    public static final int MARTIAL_MELEE = 2;
    public static final int MARTIAL_RANGED = 3;

    //armour types
    public static final int LIGHT_ARMOUR = 0;
    public static final int MEDIUM_ARMOUR = 1;
    public static final int HEAVY_ARMOUR = 2;
    public static final int SHIELD_ARMOUR = 3;

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
    public static final Feature archdruid = new Feature(20, "Archdruid", "At 20th level, you can use your W ild Shape an unlimited\n" +
            "number of times.\n" +
            "\tAdditionally, you can ignore the verbal and somatic\n" +
            "components of your druid spells, as well as any material\n" +
            "components that lack a cost and aren't consumed by a\n" +
            "spell. You gain this benefit in both your normal shape\n" +
            "and your beast shape from Wild Shape.");
}
