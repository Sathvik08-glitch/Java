package DSA;

public class SmallestElement {
    public static void main(String[] args){
        int [] numbers = {12, 45, 7, 89,34};
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("The Smallest Number In The List is: " + smallest);
    }
}
