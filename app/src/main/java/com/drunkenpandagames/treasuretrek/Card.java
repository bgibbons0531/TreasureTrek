package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 */

public class Card {
    private int id;
    private String title;
    private Option option1;
    private Option option2;

    /**
     * Constructor for Card object.
     * @param id
     * @param title
     * @param option1
     * @param option2
     */
    Card(int id, String title, Option option1, Option option2) {
        this.id = id;
        this.title = title;
        this.option1 = option1;
        this.option2 = option2;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Option getOption1() {
        return option1;
    }

    public Option getOption2() {
        return option2;
    }

    /**
     * Executes the card's first option.
     * @param deck
     * @param player
     */
    public void swipeLeft(Deck deck, Player player) {
        option1.execute(deck, player);
    }

    /**
     * Executes the card's second option.
     * @param deck
     * @param player
     */
    public void swipeRight(Deck deck, Player player) {
        option2.execute(deck, player);
    }
}
