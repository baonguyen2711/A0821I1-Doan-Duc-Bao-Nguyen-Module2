package IO_BinaryFileAndSerialization.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFile implements Serializable {
    private int id;
    private String name;
    private String address;

    public StudentFile() {
    }

    public StudentFile(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentFile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static void writeToFile(String path, List<StudentFile> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<StudentFile> readDataFromFile(String path){
        List<StudentFile> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<StudentFile>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        List<StudentFile> students = new ArrayList<>();
        students.add(new StudentFile(1, "V?? Ki???u Anh", "H?? N???i"));
        students.add(new StudentFile(2, "Nguy???n Minh Qu??n", "H?? N???i"));
        students.add(new StudentFile(3, "?????ng Huy Ho??", "???? N???ng"));
        students.add(new StudentFile(4, "Nguy???n Kh??nh T??ng", "H?? N???i"));
        students.add(new StudentFile(5, "Nguy???n Kh???c Nh???t", "H?? N???i"));
        writeToFile("student.txt",students);
        List<StudentFile> studentDataFromFile = readDataFromFile("student.txt");
        for (StudentFile student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
