package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 */

public class Option {
    int cardId;
    String msg;
    int health, energy, sanity;

    /**
     *
     * @param cardId
     * @param m msg
     * @param h health
     * @param e energy
     * @param s sanity
     */
    Option(int cardId, String m, int h, int e, int s) {
        this.cardId = cardId;
        this.msg = m;
        this.health = h;
        this.energy = e;
        this.sanity = s;
    }

    /**
     * Returns the title of the card.
     * @return The title of the card.
     */
    public String getMessage() {
        return msg;
    }

    /**
     * Executes the Option. I apologize for the long case statement, would parse in a config file
     * to load a deck if given more time to develop.
     * @param deck
     * @param player
     */
    public void execute(Deck deck, Player player) {

        player.changeStats(health, energy, sanity);

        switch(cardId) {
            case(25): deck.shuffle(deck.getCardIndex(25)+1);
                break;
            case(28):
                break;
            case(29):
                break;
        }
    }
}
