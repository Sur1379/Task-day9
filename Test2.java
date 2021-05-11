package com.company.TaskDay9;

public class Test2 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int n = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < matrix[i].length - n) {
                    matrix[i][j] = 0;
                } else if (j == matrix[i].length - n) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 2;
                }
            }
            n++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}