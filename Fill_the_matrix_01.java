package Exersice;

import java.util.Scanner;

public class Fill_the_matrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",\\s+");
        int size = Integer.parseInt(input[0]);
        String patternType = input[1];

        if(patternType.equals("A")){
            TypeA(size);
        }else if(patternType.equals("B")){
            TypeB(size);
        }
    }
    private static void TypeA (int size){
        int[][] matrix = new int[size][size];
        int number = 0;

        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                number = number + 1;
                matrix[row][col] = number;
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void TypeB(int size){
        int number = 0;
        int[][]matrix = new int[size][size];

        for (int col = 0; col < size; col++) {
            if(col%2==0){
                for (int row = 0; row < size; row++) {
                    number = number+1;
                    matrix[row][col] = number;
                }
            }else {
                for (int row = size-1; row >=0; row--) {
                    number=number+1;
                    matrix[row][col] = number;
                }
            }

        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
