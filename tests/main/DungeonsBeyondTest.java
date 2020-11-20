package main;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class DungeonsBeyondTest {

    //Testing of method by Ruturaj Darji
    @Test
    void getImage() {
        //within the getImage function, there is already a print statement declaring if the image was successfully loaded or not
        //if that statement prints, this test is passed

        Image test = DungeonsBeyond.getImage("src/graphics/TestImage.png");
    }
}