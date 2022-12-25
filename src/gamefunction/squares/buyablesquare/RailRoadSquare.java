package gamefunction.squares.buyablesquare;

import gamefunction.GameHandler;
import gamefunction.squares.BuyableSquare;

public class RailRoadSquare extends BuyableSquare {

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

    @Override
    public void buy(GameHandler gameHandler) {
        gameHandler.getCurrentPlayer().addMoney(- getPrice());
        setOwner(gameHandler.getCurrentPlayer());
        gameHandler.getCurrentPlayer().setRailRoadCount(gameHandler.getCurrentPlayer().getRailRoadCount() + 1);
    }

    @Override
    public void sell(GameHandler gameHandler) {
        getOwner().setRailRoadCount(getOwner().getRailRoadCount() - 1);
        gameHandler.changeMoney(getOwner(), getPrice() / 2);
        setOwner(null);
        setAvailable(true);
    }

    //SETTER AND GETTERS
}
