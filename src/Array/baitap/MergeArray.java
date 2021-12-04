package Array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1,size2;
        int[] arr1,arr2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size 1 : ");
        size1 = input.nextInt();
        arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter Element " + (i+1) + " : " );
            arr1[i] = input.nextInt();
        }
        System.out.print("Element in Array 1 : ");
        for (int k: arr1) {
            System.out.print(k + " ");
        }
        System.out.println("\nEnter the size 2 : ");
        size2 = input.nextInt();
        arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter Element " + (i+1) + " : " );
            arr2[i] = input.nextInt();
        }
        System.out.print("Element in Array 2 : ");
        for (int k: arr2) {
            System.out.print(k + " ");
        }
        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int index = 0;
        for (int k : arr1 ){
            result[index] = k;
            index++;
        }
        for (int k :arr2) {
            result[index] = k;
            index++;
        }
        System.out.println("\nAfter merge Array : " + Arrays.toString(result));
        /* Cách 2
        //int a = arr1.length;
        //int b = arr2.length;
        //int[] result = new int[a+b];
        //System.arraycopy(arr1, 0 ,result , 0 , a);
        //System.arraycopy(arr2, 0 ,result , a , b);
        //System.out.println(Arrays.toString(result));*/
    }
}
