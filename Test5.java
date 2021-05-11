package com.company.TaskDay9;

import java.util.Arrays;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max == matrix[i][j]) {
                    System.out.println("max - " + max + " row - " + i + " columns - " + j);
                    i = matrix.length;
                    break;
                }
            }
        }
    }
}
