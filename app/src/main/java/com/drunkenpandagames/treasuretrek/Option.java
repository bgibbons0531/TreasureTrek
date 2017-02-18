package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 */

public class Option {
    int health;
    int energy;
    int sanity;

    Option(int health, int energy, int sanity) {
        this.health = health;
        this.energy = energy;
        this.sanity = sanity;
    }

    public void execute(Player player) {
        player.changeStats(health, energy, sanity);
    }
}
