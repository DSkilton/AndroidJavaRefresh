package com.duncancodes.learnjava_android;

public class Main {
    public static void main(String[] args) {
        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.takeDamage(30);
        uglyTroll.showInfo();

        Vampire vlad = new Vampire ("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();
    }

}
