package OOPS;

class Kid {

    String name;
    int age ;

    Kid(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class Constructors {
    public static void main(String [] args) {

        Kid k1 = new Kid("Sathvik", 20);
        k1.display();
    }
}