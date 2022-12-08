package gamefunction.squares.buyablesquare;

import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.Square;
import gamefunction.enums.ColorGroup;

public class UtilitySquare extends Square {

    //INSTANCE VARIABLES
    private final ColorGroup colorGroup = ColorGroup.RAILROAD;
    private int price = 150;
    private int baseRent;
    private int rent;
    private Player owner;

    //CONSTRUCTOR
    public UtilitySquare(){
        super();
    }

    public UtilitySquare(String name, boolean available, int x, int y) {
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


    public void updateRentPrice(int diceValue){
        if (owner.getUtilityCount() == 1){
            rent = diceValue * 4;
        } else if (owner.getUtilityCount() == 2){
            rent = diceValue * 10;
        }
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
}
