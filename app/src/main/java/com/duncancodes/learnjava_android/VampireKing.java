package com.duncancodes.learnjava_android;

import java.util.Random;

public class VampireKing extends Vampire {
    public VampireKing(String name){
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage / 2);
    }

    public boolean runAway(){
//        if(getLives() < 2){
//            return true;
//        } else {
//            return false;
//        }
        return (getLives() < 2); //more concise way of doing the same thing from lines 15 to 19
    }

    public boolean dodges(){
        Random rand = new Random();
        int chance = rand.nextInt(6); //sets upper bound to 5

        if(chance > 3){
            System.out.println("Dracula dodges");
            return true;
        }

        return false;
    }

}
