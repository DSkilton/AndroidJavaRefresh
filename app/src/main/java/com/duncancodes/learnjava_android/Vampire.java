package com.duncancodes.learnjava_android;

public class Vampire extends Enemy {
    public Vampire(String name){
        super(name, 20, 3);
    }

    @Override
    public void takeDamage(int damage){
        int damageDone = (damage / 2);
        super.takeDamage(damageDone);//vampires only take half the damage

    }
}
