package DSA;

public class LinearSearch {
    public static void main(String []args) {
        int [] numbers = {12, 45, 7, 89, 34};
        int target = 13;
        boolean found = false;
        for(int i = 0; i<numbers.length; i++ ){
                if(numbers[i] == target){
                    found = true;
                System.out.println("Found the required value at: " + i);
                
            }

        }
        if (!found){
                    System.out.println("Element not found");
                }
    }
}
