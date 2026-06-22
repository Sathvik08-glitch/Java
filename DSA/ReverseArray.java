package DSA;

public class ReverseArray {
    public static void main(String []args) {

        int [] numbers = {12, 45, 7, 89, 34};
        int [] reversed = new int[numbers.length];
        int j = 0;

        for (int i = numbers.length - 1; i>=0; i--){    ///loop for orignal array to be printed in reverse 
            reversed[j] = numbers[i];    ///stores values of original array in reversed array
            j++;
        }

            for (int x = 0; x < reversed.length; x++) {     ///loop for how reversed array should be printed
            System.out.println(reversed[x] + " ");      ///prints reversed array
            } 
    }
}
