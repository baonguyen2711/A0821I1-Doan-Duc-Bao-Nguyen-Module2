package DSAStackAndQueue.baitap;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberOfCharacterInString {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String : ");
        string = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.print("String is : " + string + "\n");
        string = string.replaceAll(" ","");
        String[] charArray = string.split("");
        TreeMap<String, Integer> eachCharCount = new TreeMap<String,Integer>();
        for (String x : charArray) {
            if (eachCharCount.containsKey(x)) {
                eachCharCount.put(x, eachCharCount.get(x) + 1);
            }
            else {
                eachCharCount.put(x, 1);
            }
        }
        System.out.println("The number of each character in the string: " + eachCharCount);
    }
}
