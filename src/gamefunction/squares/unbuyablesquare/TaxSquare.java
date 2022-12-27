package gamefunction.squares.unbuyablesquare;

import main.GameHandler;
import gamefunction.squares.UnbuyableSquare;

public class TaxSquare extends UnbuyableSquare {


    //INSTANCE VARIABLE
    private int taxAmount;

    //CONSTRUCTOR
    public TaxSquare(){
        super();
    }

    public TaxSquare(String name, int x, int y, int taxAmount) {
        super(name,x,y);
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