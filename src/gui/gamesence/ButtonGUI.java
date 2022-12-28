package gui.gamesence       ;


import controller.KL;
import controller.ML;
import gui.shape.Rect;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class ButtonGUI {
    private KL keyListener;
    private ML mouseListener;
    private BufferedImage roll, rollPressed, buy, buyPressed, end, endPressed;
    private Rect rollRect, buyRect, endRect;
    private BufferedImage rollCurrentImage, buyCurrentImage, endCurrentImage;

    public ButtonGUI(KL keyListener, ML mouseListener) {
        this.keyListener = keyListener;
        this.mouseListener = mouseListener;

        try {
            BufferedImage spriteSheet = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/gameButton.png")));
            roll = spriteSheet.getSubimage(35 ,305,585,190);
            rollPressed = spriteSheet.getSubimage(35,587,585,190);

            buy = spriteSheet.getSubimage(670,305,585,190);
            buyPressed = spriteSheet.getSubimage(670,587,585,190);

            end = spriteSheet.getSubimage(1302,305,585,190);
            endPressed = spriteSheet.getSubimage(1302,587,585,190);

        } catch (Exception e){
            e.printStackTrace();
        }

        rollCurrentImage = roll;
        buyCurrentImage = buy;
        endCurrentImage = end;

        rollRect = new gui.shape.Rect(750,600,150,50);
        buyRect = new gui.shape.Rect(925,600,150,50);
        endRect = new gui.shape.Rect(1100,600,150,50);
    }

    public void update(double dt) {
        if (mouseListener.getX() >= rollRect.x && mouseListener.getX() <= rollRect.x + rollRect.width &&
                mouseListener.getY() >= rollRect.y && mouseListener.getY() <= rollRect.y + rollRect.height){
            rollCurrentImage = rollPressed;
            if (mouseListener.isPressed()){
                //
            }
        } else {
            rollCurrentImage = roll;
        }

        if (mouseListener.getX() >= buyRect.x && mouseListener.getX() <= buyRect.x + buyRect.width &&
                mouseListener.getY() >= buyRect.y && mouseListener.getY() <= buyRect.y + buyRect.height){
            buyCurrentImage = buyPressed;
            if (mouseListener.isPressed()){
                //
            }
        } else {
            buyCurrentImage = buy;
        }

        if (mouseListener.getX() >= endRect.x && mouseListener.getX() <= endRect.x + endRect.width &&
                mouseListener.getY() >= endRect.y && mouseListener.getY() <= endRect.y + endRect.height){
            endCurrentImage = endPressed;
            if (mouseListener.isPressed()){
                //
            }
        } else {
            endCurrentImage = end;
        }
    }

    public void draw(Graphics g) {
        g.drawImage(rollCurrentImage,(int)rollRect.x,(int)rollRect.y,(int)rollRect.width,(int)rollRect.height,null);
        g.drawImage(buyCurrentImage,(int)buyRect.x,(int)buyRect.y,(int)buyRect.width,(int)buyRect.height,null);
        g.drawImage(endCurrentImage,(int)endRect.x,(int)endRect.y,(int)endRect.width,(int)endRect.height,null);
    }
}
