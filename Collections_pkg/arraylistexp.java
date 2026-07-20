package Collections_pkg;

import java.util.ArrayList;

class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}
public class arraylistexp {
    public static void main(String[] args) {
        ArrayList<Student> details = new ArrayList<>();
        details.add(new Student("Alice",20));
        details.add(new Student("bob",21));
        System.out.println(details.get(0).name);
        System.out.println(details.get(1).age);
    }
}
