package edu.fju.guess;

import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class Guess10To100 {
    public static void main(String[] args) {
        Random r = new Random();
        int secret = r.nextInt(90)+10;
        System.out.println("secret:" + secret);
        boolean play = true;
            while (play){
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            System.out.println(s);
            int num = Integer.parseInt(s);
            if (secret > num) {
                System.out.println("bigger");
            } else {
                if (secret < num) {
                    System.out.println("smaller");
                } else {
                    System.out.println("bingo");
                    play = false;
                }
            }
        }
    }
}