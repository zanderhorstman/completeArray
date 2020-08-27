import java.util.Arrays;

//Complete the application started below to print out the sum of values in an array.
// Use for-loops to assist you in iterating through each value.
public class createArray {
    public static void main(String[] args) {


        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10}; //this is the array
        int sum = 0;


        System.out.print("The current list of numbers is: ");

        for (int i = 0; i < numbers.length; i++) {   // for as long as (i = 0. i < (array).length; add 1 to i) {
            sum = sum + numbers[i]; // sum = sum + (array)[i]

        }//adds all pre-set values within an array together, adds 1 because index begins at 0.
        System.out.println(sum);
        System.out.println(Arrays.toString(numbers));
    }
}
