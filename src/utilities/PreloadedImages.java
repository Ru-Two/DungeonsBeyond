package utilities;

import main.DungeonsBeyond;

import java.awt.*;
import java.awt.image.*;

public final class PreloadedImages {

    public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final Dimension sheetSize = new Dimension((int)((screenSize.getHeight()-50)*(17f/22f)), (int)screenSize.getHeight()-50);
    public static final Dimension windowSize = new Dimension((int)sheetSize.getHeight(), (int)sheetSize.getHeight());
    public static final double windowUnit = (sheetSize.getWidth()/8.5);

    public static final BufferedImage layoutSheet_unscaled = DungeonsBeyond.getImage("src/graphics/basic_sheet2.png");
    public static final double layoutSheetUnit = (layoutSheet_unscaled.getWidth()/8.5);
    public static final Image layoutSheet = layoutSheet_unscaled.getScaledInstance((int)sheetSize.getWidth(), (int)sheetSize.getHeight(), Image.SCALE_SMOOTH);
    //public static final Image layoutSheet = layoutSheet_unscaled;

    //Positions of everything on the sheet
    public static final Rectangle character_name_position = new Rectangle(119, 146, 570, 65);
    public static final Rectangle class_level_position = new Rectangle(739,105,303,50);
    public static final Rectangle background_position = new Rectangle(1048,103,259,50);
    public static final Rectangle player_name_position  = new Rectangle(1319,102,243,50);
    public static final Rectangle race_position  = new Rectangle(736,178,306,50);
    public static final Rectangle alignment_position  = new Rectangle(1046,177,264,50);
    public static final Rectangle exp_points_position = new Rectangle(1314,177,243,50);
    public static final Rectangle proficiency_bonus_position = new Rectangle(124,371,76,43);

    public static final Point inspiration_position = new Point(123,447);
    public static final Point strength_saving_throws_position = new Point(274, 534);
    public static final Point athletics_position = new Point(274, 561);
    public static final Point dexterity_saving_throws_position = new Point(274, 723);
    public static final Point acrobatics_position = new Point(274, 750);
    public static final Point sleight_of_hands_position = new Point(274, 776);
    public static final Point saving_throws_position = new Point(274, 803);
    public static final Point constitution_saving_throws_position = new Point(274, 913);
    public static final Point intelligence_saving_throws_position = new Point(274, 1103);
    public static final Point arcana_position = new Point(274, 1129);
    public static final Point history_position = new Point(274, 1155);
    public static final Point investigation_position = new Point(274, 1182);
    public static final Point nature_position = new Point(274, 1208);
    public static final Point religion_position = new Point(274, 1234);
    public static final Point wisdom_saving_throws_position = new Point(274, 1291);
    public static final Point animal_handling_position = new Point(274, 1318);
    public static final Point insight_position = new Point(274, 1345);
    public static final Point medicine_position = new Point(274, 1371);
    public static final Point perception_position = new Point(274, 1397);
    public static final Point survival_position = new Point(274, 1423);
    public static final Point charisma_saving_throws_position = new Point(274, 1481);
    public static final Point deception_position = new Point(274, 1508);
    public static final Point intimidation_position = new Point(274, 1534);
    public static final Point performance_position = new Point(274, 1560);
    public static final Point persuasion_position = new Point(274, 1586);

    public static final Rectangle strength_as_position = new Rectangle(117,586,85,62);
    public static final Rectangle dexterity_as_position = new Rectangle(117,776,85,62);
    public static final Rectangle constitution_as_position = new Rectangle(117,964,85,62);
    public static final Rectangle intelligence_as_position = new Rectangle(117,1153,85,62);
    public static final Rectangle wisdom_as_position = new Rectangle(117,1343,85,62);
    public static final Rectangle charisma_as_position = new Rectangle(117,1533,85,62);
    public static final Rectangle strength_as_position_bonus_position = new Rectangle(144,537,36,30);
    public static final Rectangle dexterity_as_position_bonus_position = new Rectangle(144,729,76,43);
    public static final Rectangle constitution_as_position_bonus_position = new Rectangle(144,917,76,43);
    public static final Rectangle intelligence_as_position_bonus_position = new Rectangle(144,1107,76,43);
    public static final Rectangle wisdom_as_position_bonus_position = new Rectangle(144,1297,76,43);
    public static final Rectangle charisma_as_position_bonus_position = new Rectangle(144,1486,76,43);
    public static final Rectangle strength_save_num_position = new Rectangle(300,532,31,23);
    public static final Rectangle strength_athletics_position = new Rectangle(300,558,31,23);
    public static final Rectangle dexterity_save_num_position = new Rectangle(300,722,31,23);
    public static final Rectangle acrobatics_num_position = new Rectangle(300,747,31,23);
    public static final Rectangle sleightofhand_num_position = new Rectangle(300,774,31,23);
    public static final Rectangle stealth_num_position = new Rectangle(300,800,31,23);
    public static final Rectangle constitution_save_num_position = new Rectangle(300,910,31,23);
    public static final Rectangle intelligence_save_num_position = new Rectangle(300,1100,31,23);
    public static final Rectangle arcana_num_position = new Rectangle(300,1126,31,23);
    public static final Rectangle history_num_position = new Rectangle(300,1152,31,23);
    public static final Rectangle investigation_num_position = new Rectangle(300,1179,31,23);
    public static final Rectangle nature_num_position = new Rectangle(300,1205,31,23);
    public static final Rectangle religion_num_position = new Rectangle(300,1232,31,23);
    public static final Rectangle wisdom_save_num_position = new Rectangle(300,1289,31,23);
    public static final Rectangle animalhandling_num = new Rectangle(300,1316,31,23);
    public static final Rectangle insight_num_position = new Rectangle(300,1343,31,23);
    public static final Rectangle medicine_num_position = new Rectangle(300,1386,31,23);
    public static final Rectangle perception_num_position = new Rectangle(300,1395,31,23);
    public static final Rectangle survival_num_position = new Rectangle(300,1422,31,23);
    public static final Rectangle charisma_save_num_position = new Rectangle(300,1479,31,23);
    public static final Rectangle deception_num_position = new Rectangle(300,1506,31,23);
    public static final Rectangle intimidation_num_position = new Rectangle(300,1531,31,23);
    public static final Rectangle performance_num_position = new Rectangle(300,1557,31,23);
    public static final Rectangle persuasion_num_position = new Rectangle(300,1585,31,23);
    public static final Rectangle other_proficiencies_languages_position = new Rectangle(83,1692,455,389);
    public static final Rectangle attacks_spellcasting_position = new Rectangle(607,1050,461,1027);
    public static final Rectangle features_traits_position = new Rectangle(1133,1046,461,1027);
    public static final Rectangle equipment_position = new Rectangle(1132,342,461,642);
    public static final Rectangle armor_class_position = new Rectangle(638,387,72,65);
    public static final Rectangle initiative_position = new Rectangle(780,380,103,92);
    public static final Rectangle speed_num_position = new Rectangle(942,382,103,92);
    public static final Rectangle current_hit_point_position = new Rectangle(624,571,428,92);
    public static final Rectangle temp_hit_point_position = new Rectangle(622,725,428,92);
    public static final Rectangle current_hit_point_max_position = new Rectangle(822,534,222,22);
    public static final Rectangle total_hit_dice_position = new Rectangle(672,864,133,24);
    public static final Rectangle hit_dice_position = new Rectangle(625,895,181,65);
    public static final Rectangle death_saves_position = new Rectangle(864,866,185,97);

    //Different font styles for different fields
    public static final Font player_name_font = new Font("Verdana", Font.PLAIN, (int)(windowUnit/4.2));

    public static final BufferedImage abilityScores_png = DungeonsBeyond.getImage("src/graphics/abilityScores2.png");
    public static final BufferedImage basicSheet = DungeonsBeyond.getImage("src/graphics/basic_sheet.png");

    public static final Image deleteImg = DungeonsBeyond.getImage("src/graphics/delete.png").getScaledInstance(40, 40, Image.SCALE_SMOOTH);
}
