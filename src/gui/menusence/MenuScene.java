package gui.menusence;


import controller.KL;
import controller.ML;
import gui.shape.Rect;
import main.Constant;
import main.GamePanel;
import gui.Scene;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class MenuScene extends Scene {

    int i = 0;

    public KL keyListener;
    public ML mouseListener;
    public BufferedImage title, play, playPressed, exit, exitPressed;
    public Rect playRect, exitRect, titleRect;
    public BufferedImage playCurrentImage, exitCurrentImage;

    public MenuScene(KL keyListener, ML mouseListener) {
        this.keyListener = keyListener;
        this.mouseListener = mouseListener;

        try {
            BufferedImage spriteSheet = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/menuSprite.png")));
            title = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/monopoly_logo.png")));
            play = spriteSheet.getSubimage(0,121,261,121);
            playPressed = spriteSheet.getSubimage(264,121,261,121);
            exit = spriteSheet.getSubimage(0,0,233,93);
            exitPressed = spriteSheet.getSubimage(264,0,233,93);
        } catch (Exception e){
            e.printStackTrace();
        }

        playCurrentImage = playPressed;
        exitCurrentImage = exit;

        titleRect = new gui.shape.Rect(Constant.SCREEN_WIDTH / 2 -200,Constant.SCREEN_HEIGHT/12,400,300);
        playRect = new gui.shape.Rect(Constant.SCREEN_WIDTH / 2 -150,Constant.SCREEN_HEIGHT/2 - 100,150,70);
        exitRect = new gui.shape.Rect(Constant.SCREEN_WIDTH / 2 -150,Constant.SCREEN_HEIGHT/2,130,55);
    }
    @Override
    public void update(double dt) {
        if (mouseListener.getX() >= playRect.x && mouseListener.getX() <= playRect.x + playRect.width &&
                mouseListener.getY() >= playRect.y && mouseListener.getY() <= playRect.y + playRect.height){
            playCurrentImage = playPressed;
            if (mouseListener.isPressed()){
                GamePanel.getGamePanel().changeState(1);
            }
        } else {
            playCurrentImage = play;
        }

        if (mouseListener.getX() >= exitRect.x && mouseListener.getX() <= exitRect.x + exitRect.width &&
                mouseListener.getY() >= exitRect.y && mouseListener.getY() <= exitRect.y + exitRect.height){
            exitCurrentImage = exitPressed;
            if (mouseListener.isPressed()){
                GamePanel.getGamePanel().close();
            }
        } else {
            exitCurrentImage = exit;
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, Constant.SCREEN_WIDTH, Constant.SCREEN_HEIGHT);
        g.drawImage(title,(int)titleRect.x,(int)titleRect.y,(int)titleRect.width,(int)titleRect.height,null); //logo
        g.drawImage(playCurrentImage,(int)playRect.x,(int)playRect.y,(int)playRect.width,(int)playRect.height,null);
        g.drawImage(exitCurrentImage,(int)exitRect.x,(int)exitRect.y,(int)exitRect.width,(int)exitRect.height,null);
    }
}
