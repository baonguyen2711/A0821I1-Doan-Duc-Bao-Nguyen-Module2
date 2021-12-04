package SortAlgorithm.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter elenment" + (i + 1) + ": ");
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\nBegin sort: ");
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        boolean check = true;
        for (int i = 0; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
            if (!check){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + " ");
            }
            System.out.println();
        }
    }
}
