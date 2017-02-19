package com.drunkenpandagames.treasuretrek;

import java.util.Random;

/**
 * Created by Brad_Laptop on 2/18/17.
 * @author Brad Gibbons
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
     * @param start Start index of the shuffle.
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
     * I apologize for the long method for setting the cards.
     * Would implement a config file to parse in the deck info if there was more time.
     */
    private void fillDeck() {
        cards[0] = new Card(0, "First Aid",
                new Option(0, "Cauterize\nWound\n+1 Health\n-1 Energy", 1, -1, 0),
                new Option(0, "Let it be\n-1 Energy\n+1 Sanity", 0, -1, 1));
        cards[1] = new Card(1, "Ghost",
                new Option(1, "Run around\n-1 Energy\n+1 Sanity", 0, -1, 1),
                new Option(1, "Run past\n+1 Energy\n-1 Sanity", 0, 1, -1));
        cards[2] = new Card(2, "Slime on Head",
                new Option(2, "Rip it\noff\n-1 Energy", 0, -1, 0),
                new Option(2, "Leave it\n-1 Sanity", 0, 0, -1));
        cards[3] = new Card(3, "Bear Trap",
                new Option(3, "Pull leg\nout\n-1 Health", -1, 0, 0),
                new Option(3, "Pry open\ntrap\n-1 Energy", 0, -1, 0));
        cards[4] = new Card(4, "Monkey Steals Map",
                new Option(4, "Hunt him\ndown\n+2 health\n-1 Energy", 2, -1, 0),
                new Option(4, "Let him\ngo\n+2 Energy\n-1 Sanity", 0, 2, -1));
        cards[5] = new Card(5, "Poison",
                new Option(5, "Let body\nrest\n-2 Health\n+1 Energy", -2, 1, 0),
                new Option(5, "Drink gross\ncure\n+1 Energy\n-2 Sanity", 0, 1, -2));
        cards[6] = new Card(6, "Bee Hive",
                new Option(6, "Go under\n-2 Health", -2, 0, 0),
                new Option(6, "Go around\n -2 Energy", 0, -2, 0));
        cards[7] = new Card(7, "Skeleton Ambush",
                new Option(7, "Fight him\n-1 Health\n-2 Energy", -1, -2, 0),
                new Option(7, "Escape\nthrough\ncrack\n-2 Energy\n-1 Sanity", 0, -2, -1));
        cards[8] = new Card(8, "Rest Area",
                new Option(8, "Eat\n+1 Health", 1, 0, 0),
                new Option(8, "Meditate\n+1 Sanity", 0, 0, 1));
        cards[9] = new Card(9, "Look Out!",
                new Option(9, "Sleep\n+2 Energy", 0, 2, 0),
                new Option(9, "Keep Watch\n+2 Sanity", 0, 0, 2));
        cards[10] = new Card(10, "Stuck Boar",
                new Option(10, "Save it\n-1 Health\n+2 Sanity", -1, 0, 2),
                new Option(10, "Eat it\n+2 Health\n-1 Sanity", 2, 0, -1));
        cards[11] = new Card(11, "Eerie Statue",
                new Option(11, "Climb over\nrocks\n-1 Health\n+1 Sanity", -1, 0, 1),
                new Option(11, "Walk past\n+1 Energy\n-1 Sanity", 0, 1, -1));
        cards[12] = new Card(12, "Stuck Rabbit",
                new Option(12, "Eat it\n+1 Health\n-1 Sanity", 1, 0, -1),
                new Option(12, "Save it\n-1 Health\n+1 Sanity", -1, 0, 1));
        cards[13] = new Card(13, "Potion Master",
                new Option(13, "Energy\nPotion\n-1 Health\n+1 Energy", -1, 1, 0),
                new Option(13, "Health\nPotion\n+1 Health\n-1 Sanity", 1, 0, -1));
        cards[14] = new Card(14, "Fork in Road",
                new Option(14, "Jagged\nPath\n-1 Health", -1, 0, 0),
                new Option(14, "Dark Path\n-1 Sanity", 0, 0, -1));
        cards[15] = new Card(15, "Wrong step",
                new Option(15, "Find cloth\n+1 Health\n-1 Energy", 1, -1, 0),
                new Option(15, "Wait it\nout\n-1 Health\n+1 Energy", -1, 1, 0));
        cards[16] = new Card(16, "Hostile Adventurer",
                new Option(16, "Run away\n-1 Energy\n+2 Sanity", 0, -1, 2),
                new Option(16, "Help her\n-1 Health\n+2 Energy", -1, 2, 0));
        cards[17] = new Card(17, "Injured Adventurer",
                new Option(17, "Cannibalize\n+1 Health\n-2 Sanity", 1, 0, -2),
                new Option(17, "Help him\n-2 Energy\n+1 Sanity", 0, -2, 1));
        cards[18] = new Card(18, "Dead jaguar",
                new Option(18, "Bury it\n+2 Sanity", 0, 0, 2),
                new Option(18, "Cook it\n+2 Health", 2, 0, 0));
        cards[19] = new Card(19, "Free Time",
                new Option(19, "Eat food\n+1 Health", 1, 0, 0),
                new Option(19, "Rest\n+1 Energy", 0, 1, 0));
        cards[20] = new Card(20, "Extra Free Time",
                new Option(20, "Feast\n+2 Health", 2, 0, 0),
                new Option(20, "Hibernate\n+2 Energy", 0, 2, 0));
        cards[21] = new Card(21, "Haunted Bridge",
                new Option(21, "The long\nway\n-2 Energy", 0, -2, 0),
                new Option(21, "The short\nway\n-2 Sanity", 0, 0, -2));
        cards[22] = new Card(22, "Adventurer Under Attack",
                new Option(22, "Keep\nwalking\n-2 Sanity", 0, 0, -2),
                new Option(22, "Intervene\n-2 Health", -2, 0, 0));
        cards[23] = new Card(23, "Giant Spider",
                new Option(23, "Run Away\n-1 Energy\n-2 Sanity", 0, -1, -2),
                new Option(23, "Fight\n-1 Health\n-2 Sanity", -1, 0, -2));
        cards[24] = new Card(24, "Questionable Spring",
                new Option(24, "Drink\nfrom it\n+1 Energy", 0, 1, 0),
                new Option(24, "Keep\nwalking\n+1 Sanity", 0, 0, 1));
        cards[25] = new Card(25, "Dual Idols",
                new Option(25, "Choose Left\nIdol\n+1 Energy\nThe ground shifts", 0, 1, 0),
                new Option(25, "Chose Right\nIdol\n+1 Sanity\nThe ground shifts", 0, 0, 1));
        cards[26] = new Card(26, "Temple Witch",
                new Option(26, "Offer soul\n+1 Health\n-2 Sanity", 1, 0, -2),
                new Option(26, "Offer life\n-2 Health\n+1 Sanity", -2, 0, 1));
        cards[27] = new Card(27, "Broken Leg",
                new Option(27, "Walk it\noff\n-2 Health\n-1 Energy", -2, -1, 0),
                new Option(27, "Reset it\n-2 Health\n -1 Sanity", -2, 0, -1));
        cards[28] = new Card(28, "Nothing here",
                new Option(28, "Turn left", 0, 0, 0),
                new Option(28, "Turn right", 0, 0, 0)); // +2/-2 to 1, -1/+1 to 2
        cards[29] = new Card(29, "Empty room",
                new Option(29, "Go left", 0, 0, 0),
                new Option(29, "Go right", 0, 0, 0)); // +3 to 1 or +1 to 3
    }

    /**
     * Returns the card at the given index.
     * @param index Index of card to get.
     * @return The card at the given index.
     */
    public Card getCardByIndex(int index) {
        return cards[index];
    }

    /**
     * Returns the index of the card.
     * @param id id of the card to get.
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
