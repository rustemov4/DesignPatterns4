package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WarriorFactory warriorFactory = new WarriorFactory();
        System.out.println("Choose the warrior");
        String res = in.nextLine();
        Fight warrior = warriorFactory.getWarrior(res);
        warrior.fight();
    }
}
