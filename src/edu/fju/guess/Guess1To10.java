package edu.fju.guess;

import java.util.Random;
import java.util.Scanner;

public class Guess1To10 {
    public static void main(String[] args) {
        Random r = new Random();
        int secret = r.nextInt(20);
        System.out.println("secret:" + secret);
            for (int i = 0; i < 3; i++) {
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
                        System.out.println("bingo");i=5;

                    }
                }


            }
        }
    }