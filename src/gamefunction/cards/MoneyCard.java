package gamefunction.cards;

import gamefunction.Card;
import main.GameHandler;
import gamefunction.enums.CardType;

public class MoneyCard extends Card {
    private int amount;

    public MoneyCard(String name, int amount, CardType type) {
        super(name,type);
        this.amount = amount;
    }

    public MoneyCard(CardType cardType, String name, String description, int amount) {
        super(cardType, name, description);
        this.amount = amount;
    }

    //METHODS


    @Override
    public void cardAction(GameHandler gameHandler) {
        gameHandler.changeMoney(gameHandler.getCurrentPlayer(),amount);
    }


    //GETTERS AND SETTERS
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

