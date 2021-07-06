package com.duncancodes.learnjava_android;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;


    public Player(){//calls constructor from line 13
        this("Unknown player");
    }

    public Player(String handle){//calls constructor from line 17
        this(handle, 1);
    }

    public Player(String handle, int startingLevel){
        handleName = handle;
        lives = 3;
        level = startingLevel;
        score = 0;
        setDefaultWeapon();
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

}
