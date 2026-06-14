package OOPS;

abstract class Payments {
    abstract void pay(int amount);
}

class UPI extends Payments {
    void pay(int amount){
        System.out.println("Payment of " + amount + " is done using UPI");
    }
}

class CreditCard extends Payments {
    void pay(int amount){
        System.out.println("Payment of " + amount + " is done using Credit Card");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Payments p1 = new UPI();
        p1.pay(1000);
        Payments p2 = new CreditCard();
        p2.pay(2000);

    }
}