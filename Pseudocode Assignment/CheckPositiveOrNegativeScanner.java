import java.util.*;
public class CheckPositiveOrNegativeScanner{
    	public static void main(String[] args) {
    	    //Using sacnner class to get input in run time
    	    Scanner in = new Scanner(System.in);
    	    System.out.print("Enter value to check : ");
    	    //Declare a variable to store the value
    	    int num = in.nextInt();
	        //check whether it is positive or negative 
	        //if it greater than zero it is positive or else it is negative
    		if (num > 0 ){
    		    System.out.println(num + " is a positive number ");
    		}
    		else{
    		    System.out.println(num + " is an negative number ");
    		}
	    }
}