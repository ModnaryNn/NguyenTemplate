package gamefunction.squares;

import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.Square;
import gamefunction.enums.ColorGroup;

public abstract class BuyableSquare extends Square {
    private ColorGroup colorGroup;
    private int price;
    private int baseRent;
    private int rent;
    private Player owner;
    private int value;



    //CONSTRUCTOR
    public BuyableSquare() {
        setAvailable(true);
    }

    public BuyableSquare(String name, int x, int y) {
        super(name, true, x, y);
    }

    //METHODS

    public ColorGroup getColorGroup() {
        return colorGroup;
    }

    public void setColorGroup(ColorGroup colorGroup) {
        this.colorGroup = colorGroup;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract void buy(GameHandler gameHandler);


    public abstract void sell(GameHandler gameHandler);
}