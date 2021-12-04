package Array.baitap;

import java.util.Scanner;

public class MaxValueInTwoArray {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row : ");
        a = input.nextInt();
        System.out.println("Enter the column : ");
        b = input.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Enter the Element : [" + (i + 1) + "][" + (j + 1) + "] : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Element in Array[][] : ");
        for (int i = 0;i < a ; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max = arr[0][0];
        int u = 1, t = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    u = i + 1;
                    t = j + 1;
                }
            }

        }
        System.out.println("\nThe largest property value in the list is : " +
                max + " ,at position [" + u + "][" + t + "]");
    }
}
