package gui.gamesence;

import main.Constant;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class BoardGUI    {
    BufferedImage boardIMG,backgroundIMG;
    public BoardGUI() {
        try {
            this.boardIMG = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/monopoly-board.jpg")));
            this.backgroundIMG = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/gameSenceBackground.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void draw(Graphics g) {
        g.drawImage(backgroundIMG,0,0, Constant.SCREEN_WIDTH, Constant.SCREEN_HEIGHT,null);
        g.drawImage(boardIMG, 20, 0, Constant.SCREEN_HEIGHT, Constant.SCREEN_HEIGHT, null);
    }
}