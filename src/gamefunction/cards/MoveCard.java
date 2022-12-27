package gamefunction.cards;

import gamefunction.Card;
import main.GameHandler;
import gamefunction.enums.CardType;
import gamefunction.enums.MoveType;

public class MoveCard extends Card {
    private MoveType moveType;
    private int destination;

    //CONSTRUCTOR

    public MoveCard(String name, MoveType moveType, int destination, CardType type) {
        super(name,type);
        this.moveType = moveType;
        this.destination = destination;
    }

    public MoveCard(CardType cardType, String name, String description, MoveType moveType, int destination) {
        super(cardType, name, description);
        this.moveType = moveType;
    }

    //METHODS


    @Override
    public void cardAction(GameHandler gameHandler) {
        gameHandler.movePlayer(gameHandler.getCurrentPlayer(), moveType,destination);
    }

    //GETTERS AND SETTERS

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}