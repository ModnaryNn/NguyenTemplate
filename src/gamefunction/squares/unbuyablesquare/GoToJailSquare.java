package gamefunction.squares.unbuyablesquare;

import gamefunction.GameHandler;
import gamefunction.Square;
import gamefunction.enums.MoveType;

public class GoToJailSquare extends Square {

    //CONSTRUCTOR

    public GoToJailSquare(){
        super();
    }

    public GoToJailSquare(String name,boolean available, int x, int y) {
        super(name,available,x,y);
    }

    //METHODS
    @Override
    public void action(GameHandler gameHandler) {
        gameHandler.setInJail(gameHandler.getCurrentPlayer());
        gameHandler.movePlayer(gameHandler.getCurrentPlayer(), MoveType.DIRECTLY,10);
    }
}

