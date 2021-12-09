package IO_TextFile.thuchanh;

import java.io.*;
import java.util.Scanner;

public class SumTheNumbers {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = " ";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng là: " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        SumTheNumbers sumTheNumbers = new SumTheNumbers();
        sumTheNumbers.readFileText(path);
    }
}
