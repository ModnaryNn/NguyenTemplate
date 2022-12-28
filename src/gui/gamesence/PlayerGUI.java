package gui.gamesence;

import gamefunction.Player;
import main.GameHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class PlayerGUI {

    private BufferedImage[] playerAvatar;

    public PlayerGUI(){
        playerAvatar = new BufferedImage[5];
        try {
            this.playerAvatar[0] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/pawns/boot.png")));
            this.playerAvatar[1] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/pawns/car.png")));
            this.playerAvatar[2] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/pawns/hat.png")));
            this.playerAvatar[3] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/assets/pawns/iron.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void displayStatus(Graphics g){
           for (int i = 0 ; i < GameHandler.getGameHandler().getNumberOfPlayers(); i++){
                g.setFont(new Font("TimesRoman", Font.PLAIN, 18));
                g.drawString(GameHandler.getGameHandler().getPlayer(i).getName(), 800, i*100+30);
                g.drawRect(800, i*100+30, 450, 80);
                g.drawImage(playerAvatar[i], 820, i*100 +50,70,50, null);
                g.drawString("Money: " + GameHandler.getGameHandler().getPlayer(i).getMoney(), 900, i*100+70);
                g.drawString("Position: " + GameHandler.getGameHandler().getGameBoard().getSquare(GameHandler.getGameHandler().getPlayer(i).getPosition()).getName(), 900, i*100+90);

                if  (GameHandler.getGameHandler().getPlayer(i).isJailCard()){
                    g.drawString("Jail Card: Yes", 1100, i*100+70);
                }
                else {
                    g.drawString("Jail Card: No", 1100, i*100+70);
                }

           }
    }

    public void displayPlayerPosition(Graphics g){
        for (int i = 0 ; i < GameHandler.getGameHandler().getNumberOfPlayers(); i++){
            Player player = GameHandler.getGameHandler().getPlayer(i);
            g.drawImage(playerAvatar[i],getPlayerPositionX(player),getPlayerPositionY(player),30,20, null);
        }
    }

    public void draw(Graphics g) {
        displayStatus(g);
        displayPlayerPosition(g);
    }

    public int getPlayerPositionX(Player player){
        return  GameHandler.getGameHandler().getGameBoard().getSquare(player.getPosition()).getX();
    }

    public int getPlayerPositionY(Player player){
        return  GameHandler.getGameHandler().getGameBoard().getSquare(player.getPosition()).getY();
    }
}
