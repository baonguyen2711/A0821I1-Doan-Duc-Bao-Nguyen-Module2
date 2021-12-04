package Array.baitap;

import java.util.Scanner;

public class SumTheNumbers {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row : ");
        a = input.nextInt();
        System.out.print("Enter the column : ");
        b = input.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Enter the Element [" + (i + 1) + "][" + (j + 1) + "] : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Element in Array [][] : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int x;
        System.out.print("The position of the column you want to sum : ");
        x = input.nextInt()-1;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = sum + arr[i][x];
        }
        System.out.print(sum);
    }
}
