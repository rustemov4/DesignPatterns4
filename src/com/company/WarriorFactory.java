package com.company;
import java.util.Scanner;
public class WarriorFactory {
    public Fight getWarrior(String warrior){
        Scanner in = new Scanner(System.in);
        if(warrior.equalsIgnoreCase("ARCHER")){
            System.out.println("Input the nickname, waepon");
            String nickname = in.nextLine();
            String weapon = in.nextLine();
            return new Archer(weapon,nickname);
        }
        else if(warrior.equalsIgnoreCase("SWORDSMAN")){
            System.out.println("Input the nickname, waepon");
            String nickname = in.nextLine();
            String weapon = in.nextLine();
            return new Swordsman(weapon,nickname);
        }
        return null;
    }
}
