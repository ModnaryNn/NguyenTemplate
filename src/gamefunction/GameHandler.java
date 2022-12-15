package gamefunction;

import gamefunction.enums.CardType;
import gamefunction.enums.MoveType;
import gamefunction.gameboard.GameBoardDefault;
import gamefunction.squares.BuyAbleSquare;

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

    public boolean checkOwnerShip(Player player, BuyAbleSquare square) {
        if(square.getOwner() == player){
        return true;
        }
        else{
            return false;
        }
    }

    public void checkBuyAble(Player player, BuyAbleSquare square) {

    }


    public void buySquare(){

    }

    public void sellSquare(){

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
