package gamefunction.squares.buyablesquare;

import gamefunction.GameHandler;
import gamefunction.squares.BuyableSquare;

public class StreetSquare extends BuyableSquare {


    private int housePrice;
    private int houseCount;
    private boolean colorGroupActive;

    //CONSTRUCTOR
    public StreetSquare(){
        super();
        colorGroupActive = false;
    }

    public StreetSquare(String name, int x, int y) {
        super(name, x, y);
        colorGroupActive = false;
    }

    //METHODS

    @Override
    public void action(GameHandler gameHandler) {
        if (gameHandler.checkAvailable(this)){
            System.out.println("This square is available");
        }
        else {
            if (gameHandler.checkOwnerShip(gameHandler.getCurrentPlayer(), this)) {
                System.out.println("This is your land");
            }
            else {
                System.out.println("This is not your land");
            }
        }
    }

    public void updateValue(){
        if (getHouseCount() == 0){
            setValue(getPrice());
        } else {
            setValue(getPrice() + getHouseCount() * getHousePrice());
        }
    }

    public void updateRent(){
        if (houseCount == 0){
            setRent(getBaseRent());
        } else {
            setRent(getValue() / 2) ;
        }
    }


    //GETTERS AND SETTERS

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

    public boolean isColorGroupActive() {
        return colorGroupActive;
    }

    public void setColorGroupActive(boolean colorGroupActive) {
        this.colorGroupActive = colorGroupActive;
    }

    @Override
    public void buy(GameHandler gameHandler) {
    if (getOwner() == null){
        gameHandler.changeMoney(gameHandler.getCurrentPlayer(), -getPrice());
    }
    else {
        gameHandler.changeMoney(this.getOwner(), getValue()*2);
        gameHandler.changeMoney(gameHandler.getCurrentPlayer(), -getValue()*2);
    }
        setOwner(gameHandler.getCurrentPlayer());
        updateValue();
    }

    public void buyHouse(int houseCount){
        this.setHouseCount(getHouseCount() + houseCount);
        updateValue();
    }

    @Override
    public void sell(GameHandler gameHandler) {
        gameHandler.changeMoney(getOwner(), getValue() / 2);
        setOwner(null);
    }
}
