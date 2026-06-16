package ExceptionHandling;

public class FinallyExample {
    public static void main(String []args){

        try {
             
            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot Divide By Zero!!");

        } finally {
            System.out.println("Finally Block Executed...");
        }
        System.out.println("Program Continues...");
    }
}
