package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 * @author Brad Gibbons
 */

public class Card {
    private int id;
    private String title;
    private Option option1;
    private Option option2;

    /**
     * Constructor for Card object.
     * @param id Id of the Card.
     * @param title Title of the card.
     * @param path Path to the image for the card.
     * @param option1 Option 1 of the card.
     * @param option2 Option 2 of the card.
     */
    Card(int id, String title, String path, Option option1, Option option2) {
        this.id = id;
        this.title = title;
        this.option1 = option1;
        this.option2 = option2;
    }

    /**
     * Returns the ID of the card.
     * @return The ID of the card.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the title of the card.
     * @return The title of the card.
     */
    public String getTitle() {
        return "<b>" + title + "</b>";
    }

    /**
     * Returns the first option of the card.
     * @return The first option of the card.
     */
    public Option getOption1() {
        return option1;
    }

    /**
     * Returns the second option of the card.
     * @return The second option of the card.
     */
    public Option getOption2() {
        return option2;
    }

    /**
     * Executes the card's first option.
     * @param deck Deck the card is in.
     * @param player Player interacting with card.
     */
    public void swipeLeft(Deck deck, Player player) {
        option1.execute(deck, player);
    }

    /**
     * Executes the card's second option.
     * @param deck Deck the card is in.
     * @param player Player interacting with card.
     */
    public void swipeRight(Deck deck, Player player) {
        option2.execute(deck, player);
    }
}
