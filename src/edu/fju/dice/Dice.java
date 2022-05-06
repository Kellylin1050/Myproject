package edu.fju.dice;

import java.util.Random;
public class Dice {
    Random random = new Random();
    int point = 1;
    public Dice() {
        Random random = new Random();
        point = random.nextInt(9)+1;
    }

}
