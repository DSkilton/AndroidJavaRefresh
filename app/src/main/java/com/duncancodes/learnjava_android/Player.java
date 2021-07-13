package com.duncancodes.learnjava_android;

import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory; //only allowed to store objects of class/ type Loot

    public Player(){//calls constructor from line 13
        this("Unknown player");
    }

    public Player(String handle){//calls constructor from line 17
        this(handle, 1);
    }

    public Player(String handle, int startingLevel){
//        handleName = handle;
//        lives = 3;
//        level = startingLevel;
//        score = 0;
        setDefaultWeapon();
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        inventory = new ArrayList<>();
    }

    public String getHandleName(){
        return handleName;
    }

    public void setHandleName(String handle){
        if(handle.length() < 3){
            System.out.println("The name " + handle + " is too short, must be 3 characters or more.");
            return;
        }
        handleName = handle;
    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword", 10, 20);

    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setNameAndLevel(String name, int level){
//        this.handleName = name;
//        this.level = level;
        setHandleName(name);
        setLevel(level);
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    public void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot){
        if(this.inventory.contains(loot)){
            inventory.remove(loot);
               return true;
        }

        return false;
    }

    public void showInventory(){
        for(Loot item : inventory){
            System.out.println(item.getName());
        }
        System.out.println("========");
    }

    public int score(){
        int total = 0;
        for(int i = 0; i < inventory.size(); i++){
            Loot currentLoot = inventory.get(i);
            System.out.println(currentLoot.getName() + " is worth " + currentLoot);
            total = total + currentLoot.getValue();
        }
        return total;
    }

}// end of class
