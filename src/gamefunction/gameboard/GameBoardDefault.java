package gamefunction.gameboard;

import com.sun.jdi.request.StepRequest;
import gamefunction.GameBoard;
import gamefunction.cards.JailCard;
import gamefunction.cards.MoneyCard;
import gamefunction.cards.MoveCard;
import gamefunction.enums.CardType;
import gamefunction.enums.ColorGroup;
import gamefunction.enums.MoveType;
import gamefunction.squares.buyablesquare.RailRoadSquare;
import gamefunction.squares.buyablesquare.StreetSquare;
import gamefunction.squares.buyablesquare.UtilitySquare;
import gamefunction.squares.unbuyablesquare.*;


public class GameBoardDefault extends GameBoard {
    public GameBoardDefault() {
        super();

        int rrBaseRent = 50;
        int rrPrice = 200;

        GoSquare s0 = new GoSquare();
        StreetSquare s1 = new StreetSquare();
        CardSquare s2 = new CardSquare();
        StreetSquare s3 = new StreetSquare();
        TaxSquare s4 = new TaxSquare();
        RailRoadSquare s5 = new RailRoadSquare();
        StreetSquare s6 = new StreetSquare();
        CardSquare s7 = new CardSquare(CardType.CHANCE, "Chance 1");
        StreetSquare s8 = new StreetSquare();
        StreetSquare s9 = new StreetSquare();
        JailSquare s10 = new JailSquare();
        StreetSquare s11 = new StreetSquare();
        UtilitySquare s12 = new UtilitySquare();
        StreetSquare s13 = new StreetSquare();
        StreetSquare s14 = new StreetSquare();
        RailRoadSquare s15 = new RailRoadSquare();
        StreetSquare s16 = new StreetSquare();
        CardSquare s17 = new CardSquare(CardType.CC, "Community Chest 2");
        StreetSquare s18 = new StreetSquare();
        StreetSquare s19 = new StreetSquare();
        FreeParkingSquare s20 = new FreeParkingSquare();
        StreetSquare s21 = new StreetSquare();
        CardSquare s22 = new CardSquare(CardType.CHANCE, "Chance 2");
        StreetSquare s23 = new StreetSquare();
        StreetSquare s24 = new StreetSquare();
        RailRoadSquare s25 = new RailRoadSquare();
        StreetSquare s26 = new StreetSquare();
        StreetSquare s27 = new StreetSquare();
        UtilitySquare s28 = new UtilitySquare();
        StreetSquare s29 = new StreetSquare();
        GoToJailSquare s30 = new GoToJailSquare();
        StreetSquare s31 = new StreetSquare();
        StreetSquare s32 = new StreetSquare();
        CardSquare s33 = new CardSquare(CardType.CC, "Community Chest 3");
        StreetSquare s34 = new StreetSquare();
        RailRoadSquare s35 = new RailRoadSquare();
        CardSquare s36 = new CardSquare(CardType.CHANCE, "Chance 3");
        StreetSquare s37 = new StreetSquare();
        TaxSquare s38 = new TaxSquare();
        StreetSquare s39 = new StreetSquare();

        s0.setPosition(640,670);
        s0.setName("Go");

        s1.setPrice(60);
        s1.setColorGroup(ColorGroup.BROWN);
        s1.setHousePrice(50);
        s1.setName("Old Kent Road");
        s1.setBaseRent(2);
        s1.setPosition(595,670);

        s2.setName("Community Chest");
        s2.setPosition(535,670);

        s3.setPrice(60);
        s3.setColorGroup(ColorGroup.BROWN);
        s3.setHousePrice(50);
        s3.setName("Whitechapel Road");
        s3.setBaseRent(4);
        s3.setPosition(475,670);

        s4.setName("Income Tax");
        s4.setTaxAmount(200);
        s4.setPosition(420,670);

        s5.setName("Kings Cross Station");
        s5.setBaseRent(rrBaseRent);
        s5.setPrice(rrPrice);
        s5.setColorGroup(ColorGroup.RAILROAD);
        s5.setPosition(360,670);


        s6.setPrice(100);
        s6.setColorGroup(ColorGroup.TEAL);
        s6.setHousePrice(50);
        s6.setName("The Angel Islington");
        s6.setBaseRent(6);
        s6.setPosition(300,670);

        s7.setName("Chance");
        s7.setPosition(240,670);

        s8.setPrice(100);
        s8.setColorGroup(ColorGroup.TEAL);
        s8.setHousePrice(50);
        s8.setName("Euston Road");
        s8.setBaseRent(6);
        s8.setPosition(180,670);

        s9.setPrice(120);
        s9.setColorGroup(ColorGroup.TEAL);
        s9.setHousePrice(50);
        s9.setName("Pentonville Road");
        s9.setBaseRent(8);
        s9.setPosition(125,670);

        s10.setName("Jail");
        s10.setPosition(50,670);

        s11.setPrice(140);
        s11.setColorGroup(ColorGroup.FUCHSIA);
        s11.setHousePrice(100);
        s11.setName("Pall Mall");
        s11.setBaseRent(10);
        s11.setPosition(40,590);

        s12.setName("Electric Company");
        s12.setPrice(150);
        s35.setColorGroup(ColorGroup.UTILITY);
        s12.setPosition(40,530);


        s13.setPrice(140);
        s13.setColorGroup(ColorGroup.FUCHSIA);
        s13.setHousePrice(100);
        s13.setName("Whitehall");
        s13.setBaseRent(10);
        s13.setPosition(40,475);

        s14.setPrice(160);
        s14.setColorGroup(ColorGroup.FUCHSIA);
        s14.setHousePrice(100);
        s14.setName("Northumberland Avenue");
        s14.setBaseRent(12);
        s14.setPosition(40,415);


        s15.setName("Marylebone Station");
        s15.setBaseRent(rrBaseRent);
        s15.setPrice(rrPrice);
        s15.setColorGroup(ColorGroup.RAILROAD);
        s15.setPosition(40,355);


        s16.setPrice(180);
        s16.setColorGroup(ColorGroup.ORANGE);
        s16.setHousePrice(100);
        s16.setName("Bow Street");
        s16.setBaseRent(14);
        s16.setPosition(40,295);

        s17.setName("Community Chest");
        s17.setPosition(40,240);

        s18.setPrice(180);
        s18.setColorGroup(ColorGroup.ORANGE);
        s18.setHousePrice(100);
        s18.setName("Marlborough Street");
        s18.setBaseRent(14);
        s18.setPosition(40,180);

        s19.setPrice(200);
        s19.setColorGroup(ColorGroup.ORANGE);
        s19.setHousePrice(100);
        s19.setName("Vine Street");
        s19.setBaseRent(16);
        s19.setPosition(40,120);

        s20.setName("Free Parking");
        s20.setPosition(40,40);

        s21.setPrice(220);
        s21.setColorGroup(ColorGroup.RED);
        s21.setHousePrice(150);
        s21.setName("The Strand");
        s21.setBaseRent(18);
        s21.setPosition(125,40);

        s22.setName("Chance");
        s22.setPosition(180,40);

        s23.setPrice(220);
        s23.setColorGroup(ColorGroup.RED);
        s23.setHousePrice(150);
        s23.setName("Fleet Street");
        s23.setBaseRent(18);
        s23.setPosition(240,40);

        s24.setPrice(240);
        s24.setColorGroup(ColorGroup.RED);
        s24.setHousePrice(150);
        s24.setName("Trafalgar Square");
        s24.setBaseRent(20);
        s24.setPosition(300,40);

        s25.setName("Fenchurch St Station");
        s25.setBaseRent(rrBaseRent);
        s25.setPrice(rrPrice);
        s25.setColorGroup(ColorGroup.RAILROAD);
        s25.setPosition(360,40);


        s26.setPrice(260);
        s26.setColorGroup(ColorGroup.YELLOW);
        s26.setHousePrice(150);
        s26.setName("Leicester Square");
        s26.setBaseRent(22);
        s26.setPosition(420,40);

        s27.setPrice(260);
        s27.setColorGroup(ColorGroup.YELLOW);
        s27.setHousePrice(150);
        s27.setName("Coventry Street");
        s27.setBaseRent(22);
        s27.setPosition(475,40);

        s28.setName("Water Works");
        s28.setPrice(150);
        s35.setColorGroup(ColorGroup.UTILITY);
        s28.setPosition(535,40);


        s29.setPrice(280);
        s29.setColorGroup(ColorGroup.YELLOW);
        s29.setHousePrice(150);
        s29.setName("Piccadilly");
        s29.setBaseRent(24);
        s29.setPosition(595,40);

        s30.setName("Go To Jail");
        s30.setPosition(670,40);

        s31.setPrice(300);
        s31.setColorGroup(ColorGroup.GREEN);
        s31.setHousePrice(200);
        s31.setName("Regent Street");
        s31.setBaseRent(26);
        s31.setPosition(670,120);

        s32.setPrice(300);
        s32.setColorGroup(ColorGroup.GREEN);
        s32.setHousePrice(200);
        s32.setName("Oxford Street");
        s32.setBaseRent(26);
        s32.setPosition(670,180);

        s33.setName("Community Chest");
        s33.setPosition(670,240);

        s34.setPrice(320);
        s34.setColorGroup(ColorGroup.GREEN);
        s34.setHousePrice(200);
        s34.setName("Bond Street");
        s34.setBaseRent(28);
        s34.setPosition(670,295);

        s35.setName("Liverpool Street Station");
        s35.setBaseRent(rrBaseRent);
        s35.setPrice(rrPrice);
        s35.setColorGroup(ColorGroup.RAILROAD);
        s35.setPosition(670,355);


        s36.setName("Chance");
        s36.setPosition(670,415);

        s37.setPrice(350);
        s37.setColorGroup(ColorGroup.BLUE);
        s37.setHousePrice(200);
        s37.setName("Park Lane");
        s37.setBaseRent(35);
        s37.setPosition(670,475);

        s38.setName("Super Tax");
        s38.setTaxAmount(100);
        s38.setPosition(670,530);

        s39.setPrice(400);
        s39.setColorGroup(ColorGroup.BLUE);
        s39.setHousePrice(200);
        s39.setName("Mayfair");
        s39.setBaseRent(50);
        s39.setPosition(670,590);


        //Add the squares to the board
        super.addSquare(s0);
        super.addSquare(s1);
        super.addSquare(s2);
        super.addSquare(s3);
        super.addSquare(s4);
        super.addSquare(s5);
        super.addSquare(s6);
        super.addSquare(s7);
        super.addSquare(s8);
        super.addSquare(s9);
        super.addSquare(s10);
        super.addSquare(s11);
        super.addSquare(s12);
        super.addSquare(s13);
        super.addSquare(s14);
        super.addSquare(s15);
        super.addSquare(s16);
        super.addSquare(s17);
        super.addSquare(s18);
        super.addSquare(s19);
        super.addSquare(s20);
        super.addSquare(s21);
        super.addSquare(s22);
        super.addSquare(s23);
        super.addSquare(s24);
        super.addSquare(s25);
        super.addSquare(s26);
        super.addSquare(s27);
        super.addSquare(s28);
        super.addSquare(s29);
        super.addSquare(s30);
        super.addSquare(s31);
        super.addSquare(s32);
        super.addSquare(s33);
        super.addSquare(s34);
        super.addSquare(s35);
        super.addSquare(s36);
        super.addSquare(s37);
        super.addSquare(s38);
        super.addSquare(s39);

        super.addCard(new MoneyCard("Win $50", 50, CardType.CC));
        super.addCard(new MoneyCard("Win $20", 20, CardType.CC));
        super.addCard(new MoneyCard("Win $10", 10, CardType.CC));
        super.addCard(new MoneyCard("Lose $100", -100, CardType.CC));
        super.addCard(new MoneyCard("Lose $50", -50, CardType.CC));
        super.addCard(new JailCard(CardType.CC));
        super.addCard(new MoveCard("Move to St. Charles Place", MoveType.DIRECTLY, 10,CardType.CC));
        super.addCard(new MoveCard("Move to Boardwalk",MoveType.DIRECTLY, 10 ,CardType.CC));

        super.addCard(new MoneyCard("Win $50", 50, CardType.CHANCE));
        super.addCard(new MoneyCard("Win $20", 20, CardType.CHANCE));
        super.addCard(new MoneyCard("Win $10", 10, CardType.CHANCE));
        super.addCard(new MoneyCard("Lose $100", -100, CardType.CHANCE));
        super.addCard(new MoneyCard("Lose $50", -50, CardType.CHANCE));
        super.addCard(new JailCard(CardType.CHANCE));
        super.addCard(new MoveCard("Move to Illinois Avenue",MoveType.DIRECTLY, 10, CardType.CHANCE));

        super.shuffleCards();
    }
}
