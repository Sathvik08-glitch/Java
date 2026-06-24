package DSA;

public class LinearSearch {
    public static void main(String []args) {
        int [] numbers = {12, 45, 7, 89, 34};
        int target = 89;

        for(int i = 0; i<numbers.length; i++ ){
            if(numbers[i] == target){
                System.out.println("Found the required value at: " + i);
            }
        }
    }
}
