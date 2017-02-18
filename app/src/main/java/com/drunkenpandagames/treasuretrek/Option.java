package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 * @author Brad Gibbons
 */

public class Option {
    private int cardId;
    private String msg;
    private int health, energy, sanity;

    /**
     * Constructor for an Option object.
     * @param cardId Id of the card the option is found in.
     * @param m messsage .
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
     * Returns the message of the option.
     * @return The message of the option.
     */
    public String getMessage() {
        return msg;
    }

    /**
     * Executes the Option.
     * @param deck Deck the option is a part of.
     * @param player Player the option interacts with.
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
