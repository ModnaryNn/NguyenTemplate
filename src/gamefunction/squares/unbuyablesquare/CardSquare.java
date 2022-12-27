package gamefunction.squares.unbuyablesquare;

import main.GameHandler;
import gamefunction.enums.CardType;
import gamefunction.squares.UnbuyableSquare;

public class CardSquare extends UnbuyableSquare {
    private CardType type;

    //CONSTRUCTOR

    public CardSquare(){
        super();
    }

    public CardSquare(CardType type, String name) {
        super();
        this.setName(name);
        this.type = type;
    }

    public CardSquare(String name, int x, int y,CardType type) {
        super(name,x,y);
        this.type = type;
    }

    //METHODS


    @Override
    public void action(GameHandler gameHandler) {
        gameHandler.playACard(gameHandler.getCurrentPlayer(), type);
    }

    //SETTERS AND GETTERS
    public void setType(CardType type) {
        this.type = type;
    }

    public CardType getType() {
        return type;
    }
}
