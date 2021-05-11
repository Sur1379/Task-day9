package com.company.TaskDay9;

public class Test3 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int[] row0 = {7, 2, 3, 5};
        int[] row1 = {2, 3, 1, 2};
        int[] row2 = {3, 1, 5, 1};
        int[] row3 = {5, 2, 1, 8};

//        n*n/2 - n/2

        matrix[0] = row0;
        matrix[1] = row1;
        matrix[2] = row2;
        matrix[3] = row3;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (count == 1) {
                System.out.println("NO");
                break;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("YES");
        }
    }
}
