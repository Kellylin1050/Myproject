package edu.fju;

public class Sorting1 {
    public static void main(String[] args) {
        int[] n = {12, 5, 6, 3, 15};
        System.out.println(n.length);
        for (int i=0; i<n.length; i++) {
            //System.out.println(i);
            for (int j=0; j<n.length-1; j++) {
                if (n[j] > n[j+1]) {
                    int tmp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ",");
        }
    }
}
