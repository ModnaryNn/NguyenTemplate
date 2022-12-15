package gamefunction.squares;

import gamefunction.Square;

public abstract class UnbuyableSquare extends Square {

    public UnbuyableSquare(){
        setAvailable(false);
    }

    public UnbuyableSquare(String name, int x, int y){
        super(name, false, x, y);
    }

}
