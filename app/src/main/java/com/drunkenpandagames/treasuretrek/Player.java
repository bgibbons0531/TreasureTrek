package com.drunkenpandagames.treasuretrek;

/**
 * Created by Brad_Laptop on 2/18/17.
 * @author Brad Gibbons
 */

public class Player {
    private int health;
    private int energy;
    private int sanity;

    /**
     * Constructor for Player object.
     */
    Player() {
        this.health = 7;
        this.energy = 7;
        this.sanity = 7;
    }

    /**
     * Alters the player's vitals.
     * @param h Change in health of the player.
     * @param e Change in energy of the player.
     * @param s Change in sanity of the player.
     */
    public void changeStats(int h, int e, int s) {
        // Cap the values at 7
        health = (health + h <= 7) ? health + h : 7;
        energy = (energy + e <= 7) ? energy + e : 7;
        sanity = (sanity + s <= 7) ? sanity + s : 7;
    }

    /**
     * Checks whether or not the player is still alive.
     * @return A boolean on if the player is still alive or not.
     */
    public boolean isAlive() {
        boolean alive = true;
        if (health < 1 || energy < 1 || sanity < 1) alive = false;
        return alive;
    }

    /**
     * Returns the player's health.
     * @return The player's health.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Returns the player's energy.
     * @return The player's energy.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Returns the player's sanity.
     * @return The player's sanity.
     */
    public int getSanity() {
        return sanity;
    }
}
