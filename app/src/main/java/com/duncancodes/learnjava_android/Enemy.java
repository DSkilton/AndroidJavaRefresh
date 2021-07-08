package com.duncancodes.learnjava_android;

public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
