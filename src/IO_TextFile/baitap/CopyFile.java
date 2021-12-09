package IO_TextFile.baitap;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
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
        /* Cách 2
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(path);
            FileWriter fileWriter = new FileWriter(path1, true);
            int c;
            while ((c = fileReader.read()) != -1) {
                fileWriter.write(c);
            }
            System.out.println("Copy finish...");
            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
    }
}
/* Cách 3 */
//public void copyFile(String path, String filePath) {
//    try {
//        File file = new File(filePath);
//        if (!file.exists()) {
//            throw new FileNotFoundException();
//        }
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
//        int c;
//        while ((c = bufferedReader.read()) != -1) {
//            bufferedWriter.write(c);
//        }
//        System.out.println("Copy finish...");
//        bufferedReader.close();
//        bufferedWriter.close();
//    } catch (Exception e) {
//        System.err.println("File không tồn tại or nội dung có lỗi");
//    }
//}
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Provide source file name :");
//        String path = sc.next();
//        System.out.print("Provide destination file name :");
//        String path1 = sc.next();
//        demo.CopyFile copyFile = new demo.CopyFile();
//        copyFile.copyFile(path,path1);
//    }