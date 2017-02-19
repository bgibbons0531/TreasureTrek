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
     * @param m message .
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
        String temp = msg;
        for (int i=0; i<temp.length(); i++) {
            if (temp.charAt(i) == '+' || temp.charAt(i) == '-') {
                temp = "<b>" + temp.substring(0,i-4) + "</b>" + temp.substring(i-4);
                return temp;
            }
        }
        return ("<b>" + temp + "<b>");
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
