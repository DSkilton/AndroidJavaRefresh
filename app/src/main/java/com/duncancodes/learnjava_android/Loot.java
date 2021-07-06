package com.duncancodes.learnjava_android;

enum lootType{POTION, RING, ARMOR} //no semi colon

public class Loot {
    private String name;
    private lootType type;
    private int value;

    public Loot(String name, lootType type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public lootType getType() {
        return type;
    }

    public void setType(lootType type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
