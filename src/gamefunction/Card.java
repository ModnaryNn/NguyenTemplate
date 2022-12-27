package gamefunction;

import gamefunction.enums.CardType;
import main.GameHandler;

public abstract class Card {
    private CardType cardType;
    private String name;
    private String description;

    //CONSTRUCTOR

    public Card(String name, CardType type){
        this.name = name;
        this.cardType = type;
    }
    public Card(CardType cardType, String name, String description) {
        this.cardType = cardType;
        this.name = name;
        this.description = description;
    }

    //METHODS

    public void cardAction(GameHandler gameHandler){

    }

    //GETTERS AND SETTERS

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
