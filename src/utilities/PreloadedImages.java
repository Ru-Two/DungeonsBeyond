package utilities;

import main.DungeonsBeyond;

import javax.swing.*;
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

    public static final Icon checkbox_unselected = new ImageIcon("src/graphics/unselected.png");
    public static final Icon checkbox_selected = new ImageIcon("src/graphics/selected.png");

    //Positions of everything on the sheet
    public static final Rectangle character_name_position = new Rectangle(119, 146, 570, 65);
    public static final Rectangle class_level_position = new Rectangle(739,105,303,50);
    public static final Rectangle background_position = new Rectangle(1048,103,259,50);
    public static final Rectangle player_name_position  = new Rectangle(1319,102,243,50);
    public static final Rectangle race_position = new Rectangle(736,178,306,50);
    public static final Rectangle alignment_position = new Rectangle(1046,177,264,50);
    public static final Rectangle exp_points_position = new Rectangle(1314,177,243,50);
    public static final Rectangle proficiency_bonus_position = new Rectangle(153,364,50,43);

    public static final Point inspiration_checkbox_position = new Point(123,447);

    public static final Point strength_save_checkbox_position = new Point(256, 530);
    public static final Point dexterity_save_checkbox_position = new Point(256, 717);
    public static final Point constitution_save_checkbox_position = new Point(256, 907);
    public static final Point intelligence_save_checkbox_position = new Point(256, 1095);
    public static final Point wisdom_save_checkbox_position = new Point(256, 1285);
    public static final Point charisma_save_checkbox_position = new Point(256, 1475);

    public static final Rectangle strength_save_num_position = new Rectangle(302,530,29,24);
    public static final Rectangle dexterity_save_num_position = new Rectangle(302,719,29,24);
    public static final Rectangle constitution_save_num_position = new Rectangle(302,908,29,24);
    public static final Rectangle intelligence_save_num_position = new Rectangle(302,1098,29,24);
    public static final Rectangle wisdom_save_num_position = new Rectangle(302,1287,29,24);
    public static final Rectangle charisma_save_num_position = new Rectangle(302,1477,29,24);

    public static final Rectangle strength_as_position = new Rectangle(130,586,85,62);
    public static final Rectangle dexterity_as_position = new Rectangle(130,776,85,62);
    public static final Rectangle constitution_as_position = new Rectangle(130,964,85,62);
    public static final Rectangle intelligence_as_position = new Rectangle(130,1153,85,62);
    public static final Rectangle wisdom_as_position = new Rectangle(130,1343,85,62);
    public static final Rectangle charisma_as_position = new Rectangle(130,1533,85,62);

    public static final Rectangle strength_as_bonus_position = new Rectangle(150,537,36,30);
    public static final Rectangle dexterity_as_bonus_position = new Rectangle(150,729,36,30);
    public static final Rectangle constitution_as_bonus_position = new Rectangle(150,917,36,30);
    public static final Rectangle intelligence_as_bonus_position = new Rectangle(150,1107,36,30);
    public static final Rectangle wisdom_as_bonus_position = new Rectangle(150,1297,36,30);
    public static final Rectangle charisma_as_bonus_position = new Rectangle(150,1486,36,30);

    public static final Point athletics_checkbox_position = new Point(256, 557);
    public static final Point acrobatics_checkbox_position = new Point(256, 746);
    public static final Point sleightofhands_checkbox_position = new Point(256, 772);
    public static final Point stealth_checkbox_position = new Point(256, 799);
    public static final Point arcana_checkbox_position = new Point(256, 1125);
    public static final Point history_checkbox_position = new Point(256, 1151);
    public static final Point investigation_checkbox_position = new Point(256, 1178);
    public static final Point nature_checkbox_position = new Point(256, 1204);
    public static final Point religion_checkbox_position = new Point(256, 1230);
    public static final Point animalhandling_checkbox_position = new Point(256, 1314);
    public static final Point insight_checkbox_position = new Point(256, 1341);
    public static final Point medicine_checkbox_position = new Point(256, 1367);
    public static final Point perception_checkbox_position = new Point(256, 1393);
    public static final Point survival_checkbox_position = new Point(256, 1420);
    public static final Point deception_checkbox_position = new Point(256, 1504);
    public static final Point intimidation_checkbox_position = new Point(256, 1530);
    public static final Point performance_checkbox_position = new Point(256, 1556);
    public static final Point persuasion_checkbox_position = new Point(256, 1583);

    public static final Rectangle athletics_num_position = new Rectangle(302,557,29,24);
    public static final Rectangle acrobatics_num_position = new Rectangle(302,746,29,24);
    public static final Rectangle sleightofhand_num_position = new Rectangle(302,772,29,24);
    public static final Rectangle stealth_num_position = new Rectangle(302,799,29,24);
    public static final Rectangle arcana_num_position = new Rectangle(302,1125,29,24);
    public static final Rectangle history_num_position = new Rectangle(302,1151,29,24);
    public static final Rectangle investigation_num_position = new Rectangle(302,1178,29,24);
    public static final Rectangle nature_num_position = new Rectangle(302,1204,29,24);
    public static final Rectangle religion_num_position = new Rectangle(302,1230,29,24);
    public static final Rectangle animalhandling_num_position = new Rectangle(302,1314,29,24);
    public static final Rectangle insight_num_position = new Rectangle(302,1341,29,24);
    public static final Rectangle medicine_num_position = new Rectangle(302,1367,29,24);
    public static final Rectangle perception_num_position = new Rectangle(302,1393,29,24);
    public static final Rectangle survival_num_position = new Rectangle(302,1420,29,24);
    public static final Rectangle deception_num_position = new Rectangle(302,1504,29,24);
    public static final Rectangle intimidation_num_position = new Rectangle(302,1530,29,24);
    public static final Rectangle performance_num_position = new Rectangle(302,1556,29,24);
    public static final Rectangle persuasion_num_position = new Rectangle(302,1583,29,24);

    public static final Rectangle other_proficiencies_languages_position = new Rectangle(83,1692,455,389);
    public static final Rectangle attacks_spellcasting_position = new Rectangle(607,1050,461,1027);
    public static final Rectangle features_traits_position = new Rectangle(1133,1046,461,1027);
    public static final Rectangle equipment_position = new Rectangle(1132,342,461,642);
    public static final Rectangle armor_class_position = new Rectangle(643,387,72,65);
    public static final Rectangle initiative_position = new Rectangle(815,380,70,92);
    public static final Rectangle speed_position = new Rectangle(963,382,80,92);
    public static final Rectangle current_hit_points_position = new Rectangle(630,571,428,92);
    public static final Rectangle temp_hit_points_position = new Rectangle(630,725,428,92);
    public static final Rectangle current_hit_point_max_position = new Rectangle(822,534,222,22);
    public static final Rectangle total_hit_dice_position = new Rectangle(672,864,133,24);
    public static final Rectangle hit_dice_position = new Rectangle(655,895,150,65);
    public static final Rectangle death_saves_position = new Rectangle(864,866,185,97);

    //Different font styles for different fields

    public static final Font larger_sized_font = new Font("Verdana", Font.PLAIN, (int)(windowUnit/4));
    public static final Font medium_sized_font = new Font("Verdana", Font.PLAIN, (int)(windowUnit/5));
    public static final Font smaller_sized_font = new Font("Verdana", Font.PLAIN, (int)(windowUnit/10));
    public static final Font player_name_font = new Font("Verdana", Font.PLAIN, (int)(windowUnit/4.2));
    public static final Font header_font = new Font("Verdana", Font.PLAIN, (int)(windowUnit/5.5));


    public static final BufferedImage abilityScores_png = DungeonsBeyond.getImage("src/graphics/abilityScores2.png");
    public static final BufferedImage basicSheet = DungeonsBeyond.getImage("src/graphics/basic_sheet.png");

    public static final Image deleteImg = DungeonsBeyond.getImage("src/graphics/delete.png").getScaledInstance(40, 40, Image.SCALE_SMOOTH);
}
