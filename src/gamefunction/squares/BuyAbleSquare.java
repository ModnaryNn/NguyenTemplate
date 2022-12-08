package gamefunction.squares;

import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.Square;

public abstract class BuyAbleSquare extends Square {
    private String name;
    private boolean available;
    private int x;
    private int y;

    private Player owner;
    private int price;
    private int value;

    //CONSTRUCTOR
    public BuyAbleSquare(){
    }

    public BuyAbleSquare(String name, boolean available, int x, int y) {
        this.name = name;
        this.available = available;
        this.x = x;
        this.y = y;
    }

    //METHODS
    public void action(GameHandler gameHandler){

    }

    //SETTERS AND GETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

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
