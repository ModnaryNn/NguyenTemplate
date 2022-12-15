package gamefunction.squares.buyablesquare;

import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.Square;
import gamefunction.enums.ColorGroup;
import gamefunction.squares.BuyAbleSquare;

public class RailRoadSquare extends BuyAbleSquare {

    //INSTANCE VARIABLES

    //CONSTRUCTOR
    public RailRoadSquare(){
        super();
    }

    public RailRoadSquare(String name, int x, int y) {
        super(name, x, y);
    }

    //METHODS

    @Override
    public void action(GameHandler gameHandler) {
        if (gameHandler.checkAvailable(this)){
            System.out.println("This square is available");
        }
        else {
            if (gameHandler.checkOwnerShip(gameHandler.getCurrentPlayer(), this)) {
                System.out.println("This is your land");;
            }
            else {
                System.out.println("This is not your land");
            }
        }

    }

    public void updateRentPrice(){
        setRent(getBaseRent() * getOwner().getRailRoadCount());
    }

    //SETTER AND GETTERS
}
