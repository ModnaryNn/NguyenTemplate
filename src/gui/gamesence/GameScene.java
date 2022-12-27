package gui.gamesence;


import gamefunction.Board;
import gui.Scene;
import main.GameHandler;
import main.GamePanel;

import javax.swing.*;
import java.awt.*;

public class GameScene extends Scene {

    public Board board = new Board();
    public GameHandler gameHandler = new GameHandler();

    private static int inputNumberOfPlayers(GameHandler gameHandler) {
        int numPlayers = 0;
        while(numPlayers < 2 || numPlayers > 4) {
            String numberOfPlayers = JOptionPane.showInputDialog(
                    GamePanel.getGamePanel(), "How many players" , 4);
            if (numberOfPlayers == null) {
                System.exit(0);
            }
            try {
                numPlayers = Integer.parseInt(numberOfPlayers);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        GamePanel.getGamePanel(), "Please input a number"
                );
                continue;
            }
            if (numPlayers < 2 || numPlayers > 4) {
                JOptionPane.showMessageDialog(
                        GamePanel.getGamePanel(),
                        "Please input a number between 2 and 4"
                );
            } else {
                gameHandler.setNumberOfPlayers(numPlayers);
            }
        }
        for (int i = 0; i < numPlayers; i++) {
            String name = JOptionPane.showInputDialog(
                    GamePanel.getGamePanel(),
                    "Please input name for Player " + (i + 1)
            );
            if (name.equals("") || name.trim().isEmpty()) {
                gameHandler.getPlayer(i).setName("Player " + (i + 1));
            } else {
                gameHandler.getPlayer(i).setName(name);
            }
        }
        return numPlayers;
    }



    public GameScene(){
        int numPlayers = inputNumberOfPlayers(gameHandler);
    }


    @Override
    public void update(double dt) {
    }

    @Override
    public void draw(Graphics g) {
        board.draw(g);
        //player.draw(g);
    }
}
