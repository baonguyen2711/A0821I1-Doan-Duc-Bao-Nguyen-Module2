package demo;

import java.io.*;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide source file name :");
        String path = sc.next();
        System.out.print("Provide destination file name :");
        String path1 = sc.next();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path1));
            int c;
            while ((c = bufferedReader.read()) != -1) {
                bufferedWriter.write(c);
            }
            System.out.println("Copy finish...");
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
    }
}