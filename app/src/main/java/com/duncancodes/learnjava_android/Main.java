package com.duncancodes.learnjava_android;

public class Main {
    public static void main(String[] args) {
        VampireKing dracula = new VampireKing("Dracula");
        dracula.showInfo();

        while(dracula.getLives() > 0){
            dracula.takeDamage(12);
            dracula.showInfo();
        }
    }

}
