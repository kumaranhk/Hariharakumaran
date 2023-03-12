import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
	// Declare and initialize array
        int[] number =  {1,2,3,4,7,6,8};
	//Sort the array 
        Arrays.sort(number);
        //Compare the digits with their +1 number.
        for (int i = 0; i < number.length; i++) {
                if(number[i] != i + 1){
		    //Print the missing element
                    System.out.println("Missing element = "+(i+1));
		    //break the loop 
                    break;
                }
        }
       
    }
}