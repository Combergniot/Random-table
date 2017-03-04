package com.sdajava.pseudolosowe;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Random random = new Random();

        // System.out.println(random.nextInt() %10 );

        int[][] table = new int[10][10];

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table.length; col++) {

                table[row][col] = random.nextInt(100);
            }
        }
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table.length; col++) {
                System.out.print(table[row][col] + "\t\t");
            }
            System.out.println();



        }
    }
}

