package edu.fju.vendingmachine;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
      int total = 0;
      int aprice = 20;
      int bprice = 15;
      int cprice = 25;
      int[] prices ={20,15,25};
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit){
            System.out.println("please put your coin (1/5/10) total:" + total);
            String s = scanner.next();
            switch (s) {
                case "1":
                case "5":
                case "10":
                    int m = Integer.parseInt(s);
                    total += m;
                    break;
                case "0":
                    System.out.println("Returing your coins...");
                    System.out.println("total:" + total);
                    exit = true;
                    break;

                case "a":
                    if (total >= aprice) {
                        System.out.println("DON!");
                        total -= aprice;
                    } else {
                        System.out.println("beep");
                    }
                    break;
                case "b":
                    if (total >= bprice) {
                        System.out.println("DON!");
                        total -= bprice;
                    } else {
                        System.out.println("beep");
                    }
                    break;
                case "c":
                    if (total >= cprice) {
                        System.out.println("DON!");
                        total -= cprice;
                    } else {
                        System.out.println("beep");
                    }
                    break;
                default:
                    System.out.println("other");
                    break;
            }
        }
    }
}
