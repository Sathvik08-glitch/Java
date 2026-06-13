package OOPS;

class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}

public class ClassesAndObjects {
    public static void main(String [] args) {
      
        Student obj = new Student();
        obj.name = "Sathvik";
        obj.age = 20;
        
        obj.introduce();
    }
}