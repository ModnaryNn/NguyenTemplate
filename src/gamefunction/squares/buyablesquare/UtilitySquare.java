package gamefunction.squares.buyablesquare;

import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.Square;
import gamefunction.enums.ColorGroup;
import gamefunction.squares.BuyAbleSquare;

public class UtilitySquare extends BuyAbleSquare {

    //INSTANCE VARIABLES

    //CONSTRUCTOR
    public UtilitySquare(){
        super();
    }

    public UtilitySquare(String name, int x, int y) {
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


    public void updateRentPrice(int diceValue){
        if (getOwner().getUtilityCount() == 1){
            setRent(diceValue * 4);
        } else if (getOwner().getUtilityCount() == 2){
            setRent( diceValue * 10);
        }
    }



    //SETTER AND GETTERS
}
