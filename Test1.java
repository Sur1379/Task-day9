package com.company.TaskDay9;

public class Test1 {
    public static void maian(String[] args) {
        int[][] matrix = new int[10][10];
        int n = 1;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(j == matrix.length - n){
                    matrix[i][j] = 1;
                    n++;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
            System.out.print(matrix[i][j] +"   ");
        }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 735;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while( n / 10 > 0){
            if (max < n % 10 ){
                max = n % 10;
            }
            if( min > n % 10 ){
                min = n % 10;
            }
            n = n / 10;
        }
        System.out.print(max);
    }
}
