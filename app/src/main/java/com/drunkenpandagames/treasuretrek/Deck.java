package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 */

public class Deck {

    Card[] cards = new Card[30];

    Deck() {
        fillDeck();
    }

    public void shuffle() {

    }

    private void fillDeck() {
        cards[0] = new Card(new Option(1, -1, 0), new Option(0, -1, 1));
        cards[1] = new Card(new Option(0, -1, 1), new Option(0, 1, -1));
        cards[2] = new Card(new Option(0, -1, 0), new Option(0, 0, -1));
        cards[3] = new Card(new Option(-1, 0, 0), new Option(0, -1, 0));
        cards[4] = new Card(new Option(2, -1, 0), new Option(0, 2, -1));
        cards[5] = new Card(new Option(-2, 1, 0), new Option(0, 1, -2));
        cards[6] = new Card(new Option(-2, 0, 0), new Option(0, -2, 0));
        cards[7] = new Card(new Option(-1, -2, 0), new Option(0, -2, -1));
        cards[8] = new Card(new Option(1, 0, 0), new Option(0, 0, 1));
        cards[9] = new Card(new Option(0, 2, 0), new Option(0, 0, 2));
        cards[10] = new Card(new Option(-1, 0, 2), new Option(2, 0, -1));
        cards[11] = new Card(new Option(-1, 0, 1), new Option(0, 1, -1));
        cards[12] = new Card(new Option(1, 0, -1), new Option(-1, 0, 1));
        cards[13] = new Card(new Option(-1, 1, 0), new Option(1, 0, -1));
        cards[14] = new Card(new Option(-1, 0, 0), new Option(0, 0, -1));
        cards[15] = new Card(new Option(1, -1, 0), new Option(-1, 1, 0));
        cards[16] = new Card(new Option(0, -1, 2), new Option(-1, 2, 0));
        cards[17] = new Card(new Option(1, 0, -2), new Option(0, -2, 1));
        cards[18] = new Card(new Option(0, 0, 2), new Option(2, 0, 0));
        cards[19] = new Card(new Option(1, 0, 0), new Option(0, 1, 0));
        cards[20] = new Card(new Option(2, 0, 0), new Option(0, 2, 0));
        cards[21] = new Card(new Option(0, -2, 0), new Option(0, 0, -2));
        cards[22] = new Card(new Option(0, 0, -2), new Option(-2, 0, 0));
        cards[23] = new Card(new Option(0, -1, -2), new Option(-1, 0, -2));
        cards[24] = new Card(new Option(0, 1, 0), new Option(0, 0, 1));
        cards[25] = new Card(new Option(0, 1, 0), new Option(0, 0, 1)); // Special
        cards[26] = new Card(new Option(1, -2, 0), new Option(-2, 0, 1));
        cards[27] = new Card(new Option(-2, -1, 0), new Option(-2, 0, -1));
        cards[28] = new Card(new Option(1, 1, 1), new Option(1,1,1)); // Special
        cards[29] = new Card(new Option(-1, -1, -1), new Option(-1, -1, -1)); // Special
    }
}
