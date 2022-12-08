package gamefunction.squares.buyablesquare;

import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.Square;
import gamefunction.enums.ColorGroup;
import gamefunction.squares.BuyAbleSquare;

public class RailRoadSquare extends BuyAbleSquare {

    //INSTANCE VARIABLES
    private final ColorGroup colorGroup = ColorGroup.RAILROAD;
    private int price;
    private int baseRent = 50;
    private int rent;
    private Player owner;

    //CONSTRUCTOR
    public RailRoadSquare(){
        super();
    }

    public RailRoadSquare(String name, boolean available, int x, int y) {
        super(name, available, x, y);
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
        rent = baseRent * owner.getRailCount();
    }

    //SETTER AND GETTERS

    public ColorGroup getColorGroup() {
        return colorGroup;
    }

    public int getBaseRent() {
        return baseRent;
    }

    public void setBaseRent(int baseRent) {
        this.baseRent = baseRent;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public int getRent(){
        return rent;
    }

    public void setRent(){
        rent = baseRent * owner.getRailCount();
    }

}
