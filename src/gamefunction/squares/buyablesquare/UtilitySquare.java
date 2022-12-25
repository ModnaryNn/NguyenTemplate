package gamefunction.squares.buyablesquare;

import gamefunction.GameHandler;
import gamefunction.squares.BuyableSquare;

public class UtilitySquare extends BuyableSquare {

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

    @Override
    public void buy(GameHandler gameHandler) {
        gameHandler.getCurrentPlayer().addMoney(- getPrice());
        setOwner(gameHandler.getCurrentPlayer());
        gameHandler.getCurrentPlayer().setUtilityCount(gameHandler.getCurrentPlayer().getUtilityCount() + 1);
    }

    @Override
    public void sell(GameHandler gameHandler) {
        getOwner().setUtilityCount(getOwner().getUtilityCount() - 1);
        gameHandler.changeMoney(getOwner(), getPrice() / 2);
        setOwner(null);
        setAvailable(true);
    }

    //SETTER AND GETTERS
}
