package DSA;

public class SumOfArray {
    public static void main(String []args) {
        int [] numbers = {12, 45, 7, 89, 34};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("The Sum Of Array is: " + sum);
    }
}
