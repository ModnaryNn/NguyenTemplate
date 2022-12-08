package gamefunction.squares.unbuyablesquare;

import gamefunction.GameHandler;
import gamefunction.Square;

public class JailSquare extends Square {

    //CONSTRUCTOR
    public JailSquare(){
        super();
    }

    public JailSquare(String name,boolean available, int x, int y) {
        super(name,available,x,y);
    }

    //METHODS

    @Override
    public void action(GameHandler gameHandler) {
        gameHandler.setInJail(gameHandler.getCurrentPlayer());
    }
}

