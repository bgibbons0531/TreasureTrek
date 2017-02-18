package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 */

public class Player {
    private int health;
    private int energy;
    private int sanity;

    Player() {
        this.health = 7;
        this.energy = 7;
        this.sanity = 7;
    }

    public void changeStats(int h, int e, int s) {
        health += h;
        energy += e;
        sanity += s;
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public int getSanity() {
        return sanity;
    }
}
