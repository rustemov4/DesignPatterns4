package com.company;

public class Swordsman extends Warrior implements Fight{
    public Swordsman(String weapon, String nickName) {
        super(weapon, nickName);
    }

    public Swordsman() {
    }

    @Override
    public void fight() {
        System.out.println("I am fighting with sword");
    }
}
