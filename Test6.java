package com.company.TaskDay9;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        int aMax;
        int max = 0;
        int count = 0;
        int[][] matrix2 = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                if (max == matrix[i][j]) {
                    matrix2[i] = matrix[i];
                    count++;
                    j = matrix.length;
                }
            }
        }
        if (count == 1) {
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    if (max == matrix2[i][j]) {
                        System.out.println("Winner - " + i);
                        i = matrix2.length;
                        break;
                    }
                }
            }
        }
        int n = 0;
        if (count > 1) {
            for (int i = 0; i < matrix2.length; i++) {
                aMax = 0;
                for (int j = 0; j < matrix2[i].length; j++) {
                    if (max == matrix2[i][j]) {
                        j = 0;
                        while (j < matrix[i].length) {
                            aMax = aMax + matrix[i][j];
                            j++;
                        }
                        if (aMax > n) {
                            n = aMax;
                        }
                    }
                }
            }
            for (int i = 0; i < matrix2.length; i++) {
                aMax = 0;
                for (int j = 0; j < matrix2[i].length; j++) {
                    while (j < matrix2.length) {
                        aMax = aMax + matrix2[i][j];
                        j++;
                    }
                }
                if (n == aMax) {
                    System.out.println("Winner is - " + i);
                    break;
                }
            }
        }
    }
}
