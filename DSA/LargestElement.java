package DSA;

public class LargestElement {
    public static void main(String []args){
        int [] numbers = {12, 45, 7, 89, 34};
        int largest = numbers[0];
        for (int i = 1; i< numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
                
            }
        }
        System.out.println("The Largest Number In List is: " + largest);
    }
    

}