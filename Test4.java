package com.company.TaskDay9;

import java.util.Arrays;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        int aMax = 0;
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            aMax = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                aMax = aMax + matrix[i][j];
                if (aMax > max) {
                    max = aMax;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            aMax = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                aMax = aMax + matrix[i][j];
                if (max == aMax) {
//                    System.out.println(Arrays.toString(matrix[i]));
                    System.out.println("max - " + max + " line - " + i);
                    i = matrix.length;
                    break;
                }
            }
        }
    }
}
