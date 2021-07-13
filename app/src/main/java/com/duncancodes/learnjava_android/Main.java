package com.duncancodes.learnjava_android;

public class Main {
    public static void main(String[] args) {
        VampireKing dracula = new VampireKing("Dracula");
        dracula.showInfo();

        while(dracula.getLives() > 0){
            if(dracula.dodges()){
                continue;
            }
            if(dracula.runAway()){
                System.out.println("Dracula ran away");
                break;
            } else {
                dracula.takeDamage(80);
                dracula.showInfo();
            }
        }
    }

}
