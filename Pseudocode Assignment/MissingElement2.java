import java.util.*;

public class MissingElement2 {
    public static void main(String[] args) {
	    // Declare and initialize array
        int[] number =  {1,2,3,4,7,6,8};
        //Declare two new variables to store sum 
        int sum = 0, sum1 = 0;
	    //Sort the array 
        Arrays.sort(number);
        //Add the values in array store it in 'sum'
        for (int i = 0; i < number.length; i++) {
                sum = sum + number[i];
        }
        //Add the natural numbers range in array first and last number
        for (int i = number[0]; i <= number[number.length - 1]; i++){
            sum1 = sum1 + i;
        } 
        //Print difference b/w 'sum1' and 'sum'
        System.out.println("MissingElement = " + (sum1 - sum) );
       
    }
}