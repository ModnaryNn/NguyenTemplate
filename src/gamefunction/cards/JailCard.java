package gamefunction.cards;

import gamefunction.Card;
import gamefunction.GameHandler;
import gamefunction.Player;
import gamefunction.enums.CardType;
import gamefunction.enums.MoveType;

public class JailCard extends Card {


    //CONSTRUCTOR
    public JailCard( CardType type) {
        super("Go to Jail",type);
    }

    public JailCard(CardType cardType, String name, String description) {
        super(cardType,name, description);
    }

    //METHODS
    @Override
    public void cardAction(GameHandler gameHandler) {
        gameHandler.setInJail(gameHandler.getCurrentPlayer());
        gameHandler.movePlayer(gameHandler.getCurrentPlayer(), MoveType.DIRECTLY,10);
    }
}
