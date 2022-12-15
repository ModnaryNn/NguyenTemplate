package gamefunction.squares;

import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.Square;

public abstract class BuyAbleSquare extends Square {
    private Player owner;
    private int price;
    private int value;

    //CONSTRUCTOR
    public BuyAbleSquare(){
        setAvailable(true);
    }

    public BuyAbleSquare(String name , int x, int y) {
        super(name,true,x,y);
    }

    //METHODS

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
