package main;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class DungeonsBeyondTest {

    //Testing of method by Ruturaj Darji
    @Test
    void getImage() {
        Image test = DungeonsBeyond.getImage("src/graphics/TestImage.png");
    }
}