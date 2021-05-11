package com.company.TaskDay9;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        int numberOfRows = scn.nextInt();
        int numberOfColumns = scn.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        int[][] matrix2 = new int[numberOfColumns][numberOfRows];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                matrix2[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
            int[][] matrix3 = new int[numberOfRows][numberOfRows];
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfRows; j++) {
                    for (int k = 0; k < numberOfColumns; k++) {
                        matrix3[i][j] += matrix[i][k] * matrix2[k][j];
                    }
                }
            }
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfRows; j++) {
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
