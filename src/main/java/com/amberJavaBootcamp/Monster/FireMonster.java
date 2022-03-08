package com.amberJavaBootcamp.Monster;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        String output = "Attack with fire!";
        return output;
    }
}



