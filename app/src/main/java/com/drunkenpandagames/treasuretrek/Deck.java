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
                new Option(0, "Cauterize<br>wound<br>+1 Health<br>-1 Energy", 1, -1, 0),
                new Option(0, "Let it be<br><br>-1 Energy<br>+1 Sanity", 0, -1, 1));
        cards[1] = new Card(1, "Ghost",
                new Option(1, "Run around<br>-1 Energy<br>+1 Sanity", 0, -1, 1),
                new Option(1, "Run past<br>+1 Energy<br>-1 Sanity", 0, 1, -1));
        cards[2] = new Card(2, "Slime on Head",
                new Option(2, "Rip it<br>off<br>-1 Energy", 0, -1, 0),
                new Option(2, "Leave it<br><br>-1 Sanity", 0, 0, -1));
        cards[3] = new Card(3, "Bear Trap",
                new Option(3, "Pull leg<br>out<br>-1 Health", -1, 0, 0),
                new Option(3, "Pry open<br>trap<br>-1 Energy", 0, -1, 0));
        cards[4] = new Card(4, "Monkey Steals Map",
                new Option(4, "Hunt him<br>down<br>+2 health<br>-1 Energy", 2, -1, 0),
                new Option(4, "Let him<br>go<br>+2 Energy<br>-1 Sanity", 0, 2, -1));
        cards[5] = new Card(5, "Poison",
                new Option(5, "Let body<br>rest<br>-2 Health<br>+1 Energy", -2, 1, 0),
                new Option(5, "Drink gross<br>cure<br>+1 Energy<br>-2 Sanity", 0, 1, -2));
        cards[6] = new Card(6, "Bee Hive",
                new Option(6, "Go under<br>-2 Health", -2, 0, 0),
                new Option(6, "Go around<br>-2 Energy", 0, -2, 0));
        cards[7] = new Card(7, "Skeleton Ambush",
                new Option(7, "Fight him<br><br><br>-1 Health<br>-2 Energy", -1, -2, 0),
                new Option(7, "Escape<br>through<br>crack<br>-2 Energy<br>-1 Sanity", 0, -2, -1));
        cards[8] = new Card(8, "Rest Area",
                new Option(8, "Gather<br>fruit<br>+1 Health", 1, 0, 0),
                new Option(8, "Meditate<br><br>+1 Sanity", 0, 0, 1));
        cards[9] = new Card(9, "Look Out!",
                new Option(9, "Sleep<br>+2 Energy", 0, 2, 0),
                new Option(9, "Keep watch<br>+2 Sanity", 0, 0, 2));
        cards[10] = new Card(10, "Stuck Boar",
                new Option(10, "Save it<br>-1 Health<br>+2 Sanity", -1, 0, 2),
                new Option(10, "Eat it<br>+2 Health<br>-1 Sanity", 2, 0, -1));
        cards[11] = new Card(11, "Eerie Statue",
                new Option(11, "Climb over<br>rocks<br>-1 Health<br>+1 Sanity", -1, 0, 1),
                new Option(11, "Walk past<br><br>+1 Energy<br>-1 Sanity", 0, 1, -1));
        cards[12] = new Card(12, "Stuck Rabbit",
                new Option(12, "Eat it<br>+1 Health<br>-1 Sanity", 1, 0, -1),
                new Option(12, "Save it<br>-1 Health<br>+1 Sanity", -1, 0, 1));
        cards[13] = new Card(13, "Potion Master",
                new Option(13, "Energy<br>potion<br>-1 Health<br>+1 Energy", -1, 1, 0),
                new Option(13, "Health<br>potion<br>+1 Health<br>-1 Sanity", 1, 0, -1));
        cards[14] = new Card(14, "Fork in the Road",
                new Option(14, "Jagged<br>path<br>-1 Health", -1, 0, 0),
                new Option(14, "Spooky<br>path<br>-1 Sanity", 0, 0, -1));
        cards[15] = new Card(15, "Wrong Step",
                new Option(15, "Find cloth<br><br>+1 Health<br>-1 Energy", 1, -1, 0),
                new Option(15, "Wait it<br>out<br>-1 Health<br>+1 Energy", -1, 1, 0));
        cards[16] = new Card(16, "Hostile Adventurer",
                new Option(16, "Run away<br>-1 Energy<br>+2 Sanity", 0, -1, 2),
                new Option(16, "Help her<br>-1 Health<br>+2 Energy", -1, 2, 0));
        cards[17] = new Card(17, "Injured Adventurer",
                new Option(17, "Cannibalize<br>+1 Health<br>-2 Sanity", 1, 0, -2),
                new Option(17, "Help him<br>-2 Energy<br>+1 Sanity", 0, -2, 1));
        cards[18] = new Card(18, "Dead jaguar",
                new Option(18, "Bury it<br>+2 Sanity", 0, 0, 2),
                new Option(18, "Cook it<br>+2 Health", 2, 0, 0));
        cards[19] = new Card(19, "Free Time",
                new Option(19, "Eat food<br>+1 Health", 1, 0, 0),
                new Option(19, "Rest<br>+1 Energy", 0, 1, 0));
        cards[20] = new Card(20, "Extra Free Time",
                new Option(20, "Feast<br>+2 Health", 2, 0, 0),
                new Option(20, "Hibernate<br>+2 Energy", 0, 2, 0));
        cards[21] = new Card(21, "Haunted Bridge",
                new Option(21, "The long<br>way<br>-2 Energy", 0, -2, 0),
                new Option(21, "The short<br>way<br>-2 Sanity", 0, 0, -2));
        cards[22] = new Card(22, "Adventurer Under Attack",
                new Option(22, "Keep<br>walking<br>-2 Sanity", 0, 0, -2),
                new Option(22, "Intervene<br><br>-2 Health", -2, 0, 0));
        cards[23] = new Card(23, "Giant Spider",
                new Option(23, "Run away<br>-1 Energy<br>-2 Sanity", 0, -1, -2),
                new Option(23, "Fight<br>-1 Health<br>-2 Sanity", -1, 0, -2));
        cards[24] = new Card(24, "Questionable Spring",
                new Option(24, "Drink<br>from it<br>+1 Energy", 0, 1, 0),
                new Option(24, "Keep<br>walking<br>+1 Sanity", 0, 0, 1));
        cards[25] = new Card(25, "Dual Idols",
                new Option(25, "Choose<br>left<br>idol<br>+1 Energy<br>The ground<br>shifts", 0, 1, 0),
                new Option(25, "Choose<br>right<br>idol<br>+1 Sanity<br>The ground<br>shifts", 0, 0, 1));
        cards[26] = new Card(26, "Temple Witch",
                new Option(26, "Offer soul<br>+1 Health<br>-2 Sanity", 1, 0, -2),
                new Option(26, "Offer life<br>-2 Health<br>+1 Sanity", -2, 0, 1));
        cards[27] = new Card(27, "Broken Leg",
                new Option(27, "Walk it<br>off<br>-2 Health<br>-1 Energy", -2, -1, 0),
                new Option(27, "Reset it<br><br>-2 Health<br> -1 Sanity", -2, 0, -1));
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
