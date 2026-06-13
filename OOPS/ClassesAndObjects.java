package OOPS;

class Test {
    String name = "Sathvik";
    int age = 20;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
    }
}

public class ClassesAndObjects {
    public static void main(String [] args) {

        Test obj = new Test();
        obj.display();
    }
}