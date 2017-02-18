package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 */

public class Card {
    Option option1;
    Option option2;

    Card(Option option1, Option option2) {
        this.option1 = option1;
        this.option2 = option2;
    }

    public void swipeLeft(Player player) {
        option1.execute(player);
    }

    public void swipeRight(Player player) {
        option2.execute(player);
    }
}
