package gamefunction.squares;

import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.Square;
import gamefunction.enums.CardType;

public class CardSquare extends Square {
    private CardType type;

    //CONSTRUCTOR

    public CardSquare(){
        super();
    }

    public CardSquare(CardType type, String name) {
        this.setName(name);
        this.type = type;
    }

    public CardSquare(String name, boolean available, int x, int y) {
        super(name, available, x, y);
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
