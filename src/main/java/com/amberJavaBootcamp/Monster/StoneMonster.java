package com.amberJavaBootcamp.Monster;

public class StoneMonster extends Monster{
     public StoneMonster(String cccc) {
         super(cccc);
     }
        @Override
        public String attack() {
            String output = "Attack with stone!";
            return output;
        }
    }

