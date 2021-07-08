package com.duncancodes.learnjava_android;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim, 8");
//        System.out.println(tim.getHandleName());
//        tim.setHandleName("Timothy");
//        System.out.println(tim.getHandleName());
//        System.out.println("Level: " + tim.getHandleName());
//        System.out.println("Lives: " + tim.getLives());
//        System.out.println(tim.getWeapon().getName());
//        Player louise = new Player("Louise");
//        System.out.println(louise.getHandleName());
//        louise.setLives(5);
//        System.out.println("Level: " + tim.getHandleName());
//        System.out.println("Lives: " + tim.getLives());
//        Player gr8 = new Player("gr8", 9);
//        System.out.println(gr8.getHandleName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        tim.setWeapon(myAxe);
//        System.out.println(tim.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        tim.pickUpLoot(redPotion);
        tim.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        tim.showInventory();

    }

}
