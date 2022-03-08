package com.amberJavaBootcamp.Monster;

public class WaterMonster extends Monster {
     public WaterMonster(String bbbb) {
        super(bbbb);
    }
    @Override
    public String attack() {
        String output = "Attack with water!";
        return output;
    }
}
