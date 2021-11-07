package array.thuchanh;

import java.util.Scanner;

public class SearchMinValue {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size :");
        size = input.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Property list: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index] + " at position " + (index+1));
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
