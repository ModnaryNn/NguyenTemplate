package gamefunction;

import gamefunction.enums.CardType;
import gamefunction.enums.ColorGroup;

import java.util.*;

public abstract class GameBoard {

    private final List<Square> squares = new ArrayList<>();
    private final List<Card> chanceCards = new ArrayList<>();
    private final List<Card> communityChestCards = new ArrayList<>();
    //the key of propertyColors is the name of the color group.
    private final Map<ColorGroup, Integer> propertyColors = new HashMap<>();

    public GameBoard() {
    }

    public void addCard(Card card) {
        if (card.getCardType() == CardType.CC)
            communityChestCards.add(card);
        else
            chanceCards.add(card);
    }

    public final void addSquare(Square Square) {
        squares.add(Square);
    }

    public Card drawCCCard() {
        Card card = communityChestCards.remove(0);
        addCard(card);
        return card;
    }

    public Card drawChanceCard() {
        Card card = chanceCards.remove(0);
        addCard(card);
        return card;
    }

    public Square getSquare(int index) {
        return squares.get(index);
    }

    public int getSquareSize() {
        return squares.size();
    }


    public int getPropertyNumberForColor(ColorGroup colorGroup) {
        Integer number = propertyColors.get(colorGroup);
        if (number != null)
            return number;
        return 0;
    }

    public Square querySquare(String string) {
        for (Square squares : squares) {
            if (squares.getName().equals(string))
                return squares;
        }
        return null;
    }



    public void removeCards() {
        communityChestCards.clear();
    }

    public final void shuffleCards() {
        Collections.shuffle(communityChestCards);
        Collections.shuffle(chanceCards);
    }
}
