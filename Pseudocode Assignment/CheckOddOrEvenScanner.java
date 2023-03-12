import java.util.*;
public class CheckOddOrEvenScanner{
    	public static void main(String[] args) {
    	    //Using sacnner class to get input in run time
    	    Scanner in = new Scanner(System.in);
    	    System.out.print("Enter value to check : ");
    	    //Declare a variable to store the value
    	    int num = in.nextInt();
	        //check whether it is odd or even using modulo operator
    		if (num % 2 == 0 ){
    		    System.out.println(num + " is an even number ");
    		}
    		else{
    		    System.out.println(num + " is an odd number ");
    		}
	    }
}