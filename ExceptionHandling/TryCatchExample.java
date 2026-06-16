package ExceptionHandling;

public class TryCatchExample {
    public static void main(String []args){
        
        try {
            
            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by Zero!");

        }

        System.out.println("Program continues...");

    }
}
