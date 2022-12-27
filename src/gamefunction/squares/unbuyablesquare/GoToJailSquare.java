package gamefunction.squares.unbuyablesquare;

import main.GameHandler;
import gamefunction.enums.MoveType;
import gamefunction.squares.UnbuyableSquare;

public class GoToJailSquare extends UnbuyableSquare {

    //CONSTRUCTOR

    public GoToJailSquare(){
        super();
    }

    public GoToJailSquare(String name, int x, int y) {
        super(name,x,y);
    }

    //METHODS
    @Override
    public void action(GameHandler gameHandler) {
        gameHandler.setInJail(gameHandler.getCurrentPlayer());
        gameHandler.movePlayer(gameHandler.getCurrentPlayer(), MoveType.DIRECTLY,10);
    }
}

