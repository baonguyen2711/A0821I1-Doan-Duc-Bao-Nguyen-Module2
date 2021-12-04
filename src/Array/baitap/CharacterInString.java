package Array.baitap;

import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) {
        String str;
        int count = 0;
        char kytu = 'n';
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any string : ");
        str = input.nextLine();
        System.out.println("String is : " + str);
        System.out.println("The character : " + kytu);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == kytu) {
                count++;
            }
        }
        System.out.println("Number of occurrences of character " + kytu + "in string is : " + count);
    }
}
