package gamefunction;

import main.Constant;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Board {
    BufferedImage boardIMG;
    public Board() {
        try {
            this.boardIMG = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/monopoly-board.jpg")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void draw(Graphics g) {
        g.drawImage(boardIMG, 0, 0, Constant.SCREEN_HEIGHT, Constant.SCREEN_HEIGHT, null);
    }
}