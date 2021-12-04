package AccessModifierAndStaticMethods.baitap;

public class Student {
    private String name = "Nguyên";
    private String classes = "A0821I1";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    void display() {
        System.out.println("Name : " + name + " ,Class : " + classes);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.display();
        student2.setName("Diệu");
        student2.setClasses("A0821I1");
        student2.display();
    }
}

