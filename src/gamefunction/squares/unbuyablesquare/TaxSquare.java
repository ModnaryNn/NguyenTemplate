package gamefunction.squares.unbuyablesquare;

import gamefunction.GameHandler;
import gamefunction.Square;

public class TaxSquare extends Square {


    //INSTANCE VARIABLE
    private int taxAmount;

    //CONSTRUCTOR
    public TaxSquare(){
        super();
    }

    public TaxSquare(String name,boolean available, int x, int y, int taxAmount) {
        super(name,available,x,y);
        this.taxAmount = taxAmount;
    }

    //METHODS


    @Override
    public void action(GameHandler gameHandler) {
        gameHandler.changeMoney(gameHandler.getCurrentPlayer(),-taxAmount);
    }

    //GETTERS AND SETTERS
    public int getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
    }
}