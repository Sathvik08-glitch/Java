package ExceptionHandling;

public class MultipleCatchExample {
    public static void main(String[] args) {
        
        try {
            
            int[] numbers = {10,20,30,40,50};

            System.out.println(numbers[8]);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Error!");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Error!");


        }

        System.out.println("Program Continues...");
    }
}
