package com.duncancodes.learnjava_android;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName());
        tim.setHandleName("Tim");
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getHandleName());
        System.out.println("Lives: " + tim.getLives());

        Player louise = new Player("Louise");
        System.out.println(louise.getHandleName());
        louise.setLives(5);
        System.out.println("Level: " + tim.getHandleName());
        System.out.println("Lives: " + tim.getLives());

        Player gr8 = new Player("gr8", 9);
        System.out.println(gr8.getHandleName());
    }

}
