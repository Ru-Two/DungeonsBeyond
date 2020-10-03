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
    public static final Trait toolProficiency = new Trait("Tool Proficiency","You gain proficiency with the artisan’s tools of your choice: smith’s tools, brewer’s supplies, or mason’s tools.");
    public static final Trait stonecunning = new Trait("Stonecunning","Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
    public static final Trait dwarvenToughness = new Trait("Dwarven Toughness","Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.");

    //Elf traits
    public static final Trait feyAncestry = new Trait("Fey Ancestry","You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
    public static final Trait trance = new Trait("Trance","Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep");
    public static final Trait cantrip = new Trait("Cantrip","You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
    public static final Trait maskOfTheWild = new Trait("Mask of the Wild","You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.");
    public static final Trait superiorDarkvision = new Trait("Superior Darkvision","Your darkvision has a radius of 120ft.");
    public static final Trait sunlightSensitivity = new Trait("Sunlight Sensitivity","You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight.");
    public static final Trait drowMagic = new Trait("Drow Magic","You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");

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

    //Half-orc traits
    public static final Trait relentlessEndurance = new Trait("Relentless Endurance","When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
    public static final Trait savageAttacks = new Trait("Savage Attacks","When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");

    //Tiefling traits
    public static final Trait hellishResistance = new Trait("Hellish Resistance","You have resistance to fire damage.");
    public static final Trait infernalLegacy = new Trait("InfernalLegacy","You know the thaumaturgy cantrip. Once you reach 3rd level, you can cast the hellish rebuke spell once per day as a 2nd-level spell. Once you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");


}
