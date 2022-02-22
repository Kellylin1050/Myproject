package edu.fju;
public class Starsline { /* v型星星
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (i == j || i == 19 - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/
    /*public static void main(String[] args) {  //奇怪圖形
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (j == 0 || j == 19 || (j >= 2 && j <= 17)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/

    public static void main(String[] args) { //斜線星星
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (i * 2 == j) {
                    System.out.print("*");}
                else {
                    System.out.print(" ");}
            }  System.out.println();
        }

    }
}




