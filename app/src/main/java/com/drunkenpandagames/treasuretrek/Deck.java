package com.drunkenpandagames.treasuretrek;

import java.util.Random;

/**
 * Created by Brad_Laptop on 2/18/17.
 */

public class Deck {

    private Card[] cards = new Card[30];

    /**
     * Constructor for the Deck object.
     */
    Deck() {
        fillDeck();
        shuffle(0);
    }

    /**
     * Shuffles the deck from the index to the end of the deck
     * @param start
     */
    public void shuffle(int start) {
        Random rand = new Random();
        for (int i=start; i<30; i++) {
            int num = rand.nextInt((29 - start) + 1) + start;
            Card temp = cards[i];
            cards[i] = cards[num];
            cards[num] = temp;
        }
    }

    /**
     * Fills the deck with cards.
     * I appologize for the long method for setting the cards.
     * Would implement a config file to parse in the deck info.
     */
    private void fillDeck() {
        cards[0] = new Card(0, "First Aid",
                new Option(0, "Cauterize Wound", 1, -1, 0),
                new Option(0, "Let it be", 0, -1, 1));
        cards[1] = new Card(1, "Ghost",
                new Option(1, "Run around\n-1 Energy\n+1 Sanity", 0, -1, 1),
                new Option(1, "Run through\n+1 Energy\n-1 Sanity", 0, 1, -1));
        cards[2] = new Card(2, "Slime on Head",
                new Option(2, "Rip it off\n-1 Energy", 0, -1, 0),
                new Option(2, "Leave it\n-1 Sanity", 0, 0, -1));
        cards[3] = new Card(3, "Bear Trap",
                new Option(3, "Pull leg out\n-1 Health", -1, 0, 0),
                new Option(3, "Pry open trap\n-1 Energy", 0, -1, 0));
        cards[4] = new Card(4, "Monkey Steals Map",
                new Option(4, "Hunt him down\n+2 health\n-1 Energy", 2, -1, 0),
                new Option(4, "Let him go\n+2 Energy\n-1 Sanity", 0, 2, -1));
        cards[5] = new Card(5, "Poison",
                new Option(5, "Let body rest\n-2 Health\n+1 Energy", -2, 1, 0),
                new Option(5, "Drink gross cure\n+1 Energy\n-2 Sanity", 0, 1, -2));
        cards[6] = new Card(6, "Bee Hive",
                new Option(6, "Go underneath\n-2 Health", -2, 0, 0),
                new Option(6, "Go around\n -2 Energy", 0, -2, 0));
        cards[7] = new Card(7, "Skeleton Ambush",
                new Option(7, "Fight him\n-1 Health\n-2 Energy", -1, -2, 0),
                new Option(7, "Escape through crack\n-2 Energy\n-1 Sanity", 0, -2, -1));
        cards[8] = new Card(8, "Rest Area",
                new Option(8, "Eat\n+1 Health", 1, 0, 0),
                new Option(8, "Meditate\n+1 Sanity", 0, 0, 1));
        cards[9] = new Card(9, "Look Out!",
                new Option(9, "Sleep\n+2 Energy", 0, 2, 0),
                new Option(9, "Keep Watch", 0, 0, 2));
        cards[10] = new Card(10, "Stuck Boar",
                new Option(10, "Save it", -1, 0, 2),
                new Option(10, "Eat it", 2, 0, -1));
        cards[11] = new Card(11, "",
                new Option(11, "", -1, 0, 1),
                new Option(11, "", 0, 1, -1));
        cards[12] = new Card(12, "Stuck Rabbit",
                new Option(12, "Eat it", 1, 0, -1),
                new Option(12, "Save it", -1, 0, 1));
        cards[13] = new Card(13, "",
                new Option(13, "", -1, 1, 0),
                new Option(13, "", 1, 0, -1));
        cards[14] = new Card(14, "",
                new Option(14, "", -1, 0, 0),
                new Option(14, "", 0, 0, -1));
        cards[15] = new Card(15, "",
                new Option(15, "", 1, -1, 0),
                new Option(15, "", -1, 1, 0));
        cards[16] = new Card(16, "",
                new Option(16, "", 0, -1, 2),
                new Option(16, "", -1, 2, 0));
        cards[17] = new Card(17, "",
                new Option(17, "", 1, 0, -2),
                new Option(17, "", 0, -2, 1));
        cards[18] = new Card(18, "",
                new Option(18, "", 0, 0, 2),
                new Option(18, "", 2, 0, 0));
        cards[19] = new Card(19, "",
                new Option(19, "", 1, 0, 0),
                new Option(19, "", 0, 1, 0));
        cards[20] = new Card(20, "",
                new Option(20, "", 2, 0, 0),
                new Option(20, "", 0, 2, 0));
        cards[21] = new Card(21, "",
                new Option(21, "", 0, -2, 0),
                new Option(21, "", 0, 0, -2));
        cards[22] = new Card(22, "",
                new Option(22, "", 0, 0, -2),
                new Option(22, "", -2, 0, 0));
        cards[23] = new Card(23, "",
                new Option(23, "", 0, -1, -2),
                new Option(23, "", -1, 0, -2));
        cards[24] = new Card(24, "",
                new Option(24, "", 0, 1, 0),
                new Option(24, "", 0, 0, 1));
        cards[25] = new Card(25, "",
                new Option(25, "", 0, 1, 0),
                new Option(25, "", 0, 0, 1));
        cards[26] = new Card(26, "",
                new Option(26, "", 1, -2, 0),
                new Option(26, "", -2, 0, 1));
        cards[27] = new Card(27, "",
                new Option(27, "", -2, -1, 0),
                new Option(27, "", -2, 0, -1));
        cards[28] = new Card(28, "",
                new Option(28, "", 0, 0, 0),
                new Option(28, "", 0, 0, 0)); // +2/-2 to 1, -1/+1 to 2
        cards[29] = new Card(29, "",
                new Option(29, "", 0, 0, 0),
                new Option(29, "", 0, 0, 0)); // +3 to 1 or +1 to 3
    }

    /**
     * Returns the card at the given index.
     * @param index
     * @return The card at the given index.
     */
    public Card getCardByIndex(int index) {
        return cards[index];
    }

    /**
     * Returns the index of the card.
     * @param id
     * @return The index of the card.
     */
    public int getCardIndex(int id) {
        for (int i=0; i<30; i++) {
            if (cards[i].getId() == id) {
                return i;
            }
        }
        return 0;
    }
}
