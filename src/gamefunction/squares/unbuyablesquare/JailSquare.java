package gamefunction.squares.unbuyablesquare;

import main.GameHandler;
import gamefunction.squares.UnbuyableSquare;

public class JailSquare extends UnbuyableSquare {

    //CONSTRUCTOR
    public JailSquare(){
        super();
    }

    public JailSquare(String name,boolean available, int x, int y) {
        super(name,x,y);
    }

    //METHODS

    @Override
    public void action(GameHandler gameHandler) {
        gameHandler.setInJail(gameHandler.getCurrentPlayer());
    }
}

