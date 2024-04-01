package com.example;

import java.util.Random;
import java.util.Scanner;

public class LR_2 {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);

        System.out.print("Enter the matrix formaton method (R - random or  M - manual): ");
        String matrixMethodFormation = inputScan.nextLine();

        System.out.print("Enter the matrix heigth (number between 1 and 20): ");
        int matrixHeight = inputScan.nextInt();

        System.out.print("Enter the matrix width (number between 1 and 20): ");
        int matrixWidth = inputScan.nextInt();

        Matrix matrix = new Matrix(matrixHeight, matrixWidth, matrixMethodFormation);


        System.out.println(String.format("Min value in matrix: %d", matrix.min()));
        System.out.println(String.format("Max value in matrix: %d", matrix.max()));
        System.out.println(String.format("Average value of matrix: %f", matrix.average()));

        inputScan.close();
    }

    private static class Matrix {
        public int height;
        public int width;
        public String methodFormation;
        public int[][] values;

        public final int MIN_RANDOM_VALUE = 0;
        public final int MAX_RANDOM_VALUE = 100;

        public Matrix(int height, int width, String methodFormation) {
            this.methodFormation = methodFormation;

            if (height > 0 && height < 20) {
                this.height = height;
            } else {
                throw new Error("Wrong matrix height value");
            }

            if (width > 0 && height < 20) {
                this.width = width;
            } else {
                throw new Error("Wrong matrix width value");
            }

            this.values = new int[this.height][width];

            if (this.methodFormation.equals("R")) {
                Random rand = new Random();
                for (int i = 0; i < this.height; i++) {
                    for (int j = 0; j < this.width; j++) {
                        this.values[i][j] = rand.nextInt(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                    }
            }
            } else if (this.methodFormation.equals("M")) {
                Scanner inputScan = new Scanner(System.in);

                for (int i = 0; i < this.height; i++) {
                    for (int j = 0; j < this.width; j++) {
                        System.out.print(String.format("Enter int value for %d element in %d row: ", j, i));
                        this.values[i][j] = inputScan.nextInt();
                    }
                }

                inputScan.close();
            } else {
                throw new Error("Wrong method formation of matrix");
            }
            
        }

        public int min() {
            int minElem = this.MAX_RANDOM_VALUE + 1;
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    if (minElem > this.values[i][j])
                        minElem = this.values[i][j];
                }
            }
            return minElem;
        }

        public int max() {
            int maxElem = this.MIN_RANDOM_VALUE - 1;
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    if (maxElem < this.values[i][j])
                        maxElem = this.values[i][j];
                }
            }
            return maxElem;
        }

        public int sum() {
            int sumMatrixElements = 0;
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    sumMatrixElements += this.values[i][j];
                }
            }
            return sumMatrixElements;
        }

        public float average() {
            float averageMatrixElements = 0.0f;
            int matrixSum = this.sum();
            int elementsCount = this.height * this.width;

            averageMatrixElements = matrixSum / elementsCount;
            
            return averageMatrixElements;
        }
    }
}



