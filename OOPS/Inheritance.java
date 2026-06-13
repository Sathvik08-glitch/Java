package OOPS;

class Animal{

    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog Barks");

    }
}

class Cat extends Animal{
    
    void sound(){
        System.out.println("Cat Meows");
    }
}

public class Inheritance {
    public static void main(String [] args) {

        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.sound();
        d.sound();
        c.sound();
    }
}