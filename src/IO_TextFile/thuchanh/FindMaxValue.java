package IO_TextFile.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                numbers.add(Integer.valueOf(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("\nGiá trị lớn nhất là: " + max);
            System.out.println("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FindValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FindMaxValue findMaxValue = new FindMaxValue();
        List<Integer> numbers = findMaxValue.readFile(path);
        int maxValue = findMax(numbers);
        findMaxValue.writeFile("result", maxValue);
    }
}
