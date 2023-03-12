public class SwappingValues{
    	public static void main(String[] args) {
    		//Declare and initialize variables
	    		int a = 5;
	    		int b = 4;
	    		//add the values and assign it to 'a'
	    		a = a + b;
	    		//Subtract 'a' and 'b' and assign it to 'b'
	    		b = a - b;
	    		//Subtract 'a' and 'b' and assign it to 'a'
	    		a = a - b;
	    		//Print the swapped values
	    		System.out.println("Swapped value of a = " + a);
	    		System.out.println("Swapped value of b = " + b);
    	}

}