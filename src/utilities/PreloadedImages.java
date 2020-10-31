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
    public static final Rectangle player_name_position = new Rectangle(119, 146, 570, 65);


    //Different font styles for different fields
    public static final Font player_name_font = new Font("Verdana", Font.PLAIN, (int)(windowUnit/4.2));

    public static final BufferedImage abilityScores_png = DungeonsBeyond.getImage("src/graphics/abilityScores2.png");
    public static final BufferedImage basicSheet = DungeonsBeyond.getImage("src/graphics/basic_sheet.png");

    public static final Image deleteImg = DungeonsBeyond.getImage("src/graphics/delete.png").getScaledInstance(40, 40, Image.SCALE_SMOOTH);
}
