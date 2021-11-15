package array.baitap;

import java.util.Scanner;

public class SumTheMainDiagonal {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size : ");
        x = input.nextInt();
        int[][] arr = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Enter the Element [" + (i + 1) + "][" + (j + 1) + "] : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Element in Array [][] : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of the numbers diagonal : " + sum);
    }
}
