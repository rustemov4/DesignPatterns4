package com.company;

public class Archer extends Warrior implements Fight{
    public Archer() {
    }

    public Archer(String weapon, String nickName) {
        super(weapon, nickName);
    }

    @Override
    public void fight() {
        System.out.println("I am fighting with bow and arrows");
    }
}
