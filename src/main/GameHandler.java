package main;

import gamefunction.Dice;
import gamefunction.GameBoard;
import gamefunction.Player;
import gamefunction.Square;
import gamefunction.enums.CardType;
import gamefunction.enums.MoveType;
import gamefunction.gameboard.GameBoardDefault;
import gamefunction.squares.BuyableSquare;

import java.util.ArrayList;
import java.util.List;

public class GameHandler {

    public Dice dice;
    public int turnCount;
    public int playerTurn = 0;
    public List<Player> players = new ArrayList<>();
    private GameBoard gameBoard;

    //CONSTRUCTOR
    public GameHandler() {
        dice = new Dice(2);
        playerTurn = 0;
        gameBoard = new GameBoardDefault();
    }

    //METHODS
    public void setNumberOfPlayers(int number) {
        players.clear();
        for (int i = 0; i < number; i++) {
            Player player = new Player("Player " + (i + 1));
            players.add(player);
        }
    }

    //TURN CONTROL
    public void nextTurn() {
        playerTurn++;
        if (playerTurn >= players.size()) {
            playerTurn = 0;
        }
    }


    //PLAYER CONTROL
    public Player getCurrentPlayer() {
        return players.get(playerTurn);
    }

    public Player getPlayer(int index){
        return players.get(index);
    }

    public void movePlayer(Player player, MoveType moveType, int amount) {
        if (moveType == MoveType.DIRECTLY) {
            player.setPosition(amount);
        } else if (moveType == MoveType.RELATIVE) {
            player.setPosition(player.getPosition() + amount);
        }
    }

    public void changeMoney(Player player, int amount) {
        player.setMoney(player.getMoney() + amount);
    }


    //SQUARE CONTROL
    public boolean checkAvailable(Square square) {
        return square.isAvailable();
    }

    public boolean checkOwnerShip(Player player, BuyableSquare square) {
        if(square.getOwner() == player){
        return true;
        }
        else{
            return false;
        }
    }

    public boolean checkBuyAble(Player player, BuyableSquare square) {
        if (square.isAvailable()){
            if (square.getOwner() == null){
                return true;
            }
            else {
                if (player.getMoney() > square.getValue() *2){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else {
            return false;
        }
    }




    //JAIL CONTROL
    public void setInJail(Player player){
        player.setInJail(true);
    }

    //CARD CONTROL
    public void playACard(Player player, CardType type) {

    }



    //DICE CONTROL
    public void rollDice() {
        dice.roll();
    }



}
