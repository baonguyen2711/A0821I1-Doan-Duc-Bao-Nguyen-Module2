package JavaCollection.thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {
    public static class Student implements Comparable<Student>{
        private String name;
        private int age;
        private String address;

        public Student() {
        }

        public Student(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student student) {
            return this.getName().compareTo(student.getName());
        }
    }
    public static class AgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getAge() > o2.getAge()) {
                return 1;
            }else if (o1.getAge()==o2.getAge()){
                return 0;
            }else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Nguyen",30,"DaNang");
        Student student2 = new Student("Dieu",32,"DaNang");
        Student student3 = new Student("Ngan",20,"DaNang");
        Student student4 = new Student("Ngoc",20,"DaNang");
        List<Student> list  = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student st: list ) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("................................");
        for (Student st : list) {
            System.out.println(st.toString());
        }
    }
}
