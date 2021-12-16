//package JavaCollection.baitap;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadAndWrite {
//    public static final String PRODUCT_FILE = "src/JavaCollection/baitap/product";
//    public static final List<ArrayListProduct> products = new ArrayList<>();
//    public void readFile() {
//        try {
//            File file = new File(PRODUCT_FILE);
//            String line;
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            while ((line = bufferedReader.readLine()) != null) {
//
//                String[] temp = line.split(",");
//                int id = Integer.parseInt(temp[0]);
//                String name = temp[1];
//                int price = Integer.parseInt(temp[2]);
//                ArrayListProduct arrayListProduct = new ArrayListProduct(name,price);
//                products.add(arrayListProduct);
//            }
//            bufferedReader.close();
//        } catch (Exception e) {
//            System.err.println("File không tồn tại or nội dung có lỗi");
//        }
//    }
//
//    public void writeFile(List<ArrayListProduct> listProducts) {
//        try {
//            FileWriter writer = new FileWriter(PRODUCT_FILE);
//            BufferedWriter bufferedWriter = new BufferedWriter(writer);
//            for (ArrayListProduct product : listProducts) {
//                bufferedWriter.write(product.toString());
//                bufferedWriter.write("\n");
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
