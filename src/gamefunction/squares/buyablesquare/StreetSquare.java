package gamefunction.squares.buyablesquare;

import gamefunction.GameHandler;
import gamefunction.enums.ColorGroup;
import gamefunction.squares.BuyAbleSquare;

public class StreetSquare extends BuyAbleSquare {

    private ColorGroup colorGroup;
    private int housePrice;
    private int houseCount;
    private int baseRent;
    private int rent;

    //CONSTRUCTOR
    public StreetSquare(){
        super();
    }

    public StreetSquare(String name, int x, int y) {
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

    public void updateValue(){
        if (houseCount == 0){
            setValue(getPrice());
        } else {
            setValue(getPrice() + houseCount * housePrice);
        }
    }

    public void updateRent(){
        if (houseCount == 0){
            rent = baseRent;
        } else {
            rent = getValue() / 2;
        }
    }


    //GETTERS AND SETTERS
    public ColorGroup getColorGroup() {
        return colorGroup;
    }

    public void setColorGroup(ColorGroup colorGroup) {
        this.colorGroup = colorGroup;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public int getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(int houseCount) {
        this.houseCount = houseCount;
    }

    public int getBaseRent() {
        return baseRent;
    }

    public void setBaseRent(int baseRent) {
        this.baseRent = baseRent;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
