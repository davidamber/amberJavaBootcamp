package com.amberJavaBootcamp.Monster;

public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("aaaa");
        Monster m2 = new WaterMonster("bbbb");
        Monster m3 = new StoneMonster("cccc");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("cccc");
        System.out.println(m1.attack());

        Monster m4 = new Monster("dddd");
        System.out.println(m4.attack());
        }
    }
