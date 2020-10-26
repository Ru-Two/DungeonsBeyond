package main;

import javax.swing.text.JTextComponent;
import java.awt.*;

public class DBTextComponent extends JTextComponent {
    public DBTextComponent(){
        setText(" ");
    }

    public DBTextComponent(String text){
        setText(text);
    }

    @Override
    public void paintComponent(Graphics g){
        if(getText().equals(" ")){
            g.drawString(getText(), getX(), getY());

        }
    }
}
