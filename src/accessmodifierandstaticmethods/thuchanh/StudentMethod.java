package accessmodifierandstaticmethods.thuchanh;

public class StudentMethod {
    private final int number;
    private final String name;
    private static String college = "FPT";
    StudentMethod(int num, String n) {
        number = num;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display(){
        System.out.println(number + " " + name + " "+ college);
    }
}
class TestStudentMethod{
    public static void main(String[] args) {
        StudentMethod.change();
        StudentMethod s1 = new StudentMethod(1,"Nguyên");
        StudentMethod s2 = new StudentMethod(2,"Diệu");
        StudentMethod s3 = new StudentMethod(3,"Ngọc");
        s1.display();
        s2.display();
        s3.display();
    }
}
