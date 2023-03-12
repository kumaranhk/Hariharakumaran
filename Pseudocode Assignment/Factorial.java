public class Factorial
{
    
    public static void main(String[] args) {
        
	//Declare a variable and initialize value need to find factorial
	    
	int a = 6;
	    
	//Declare a new variable and asiign value as 1 to store the answer
	    
	int fact = 1;
	    
	//Find the factorial using for 
	    
	for (int i = a ; i >= 1 ; i--){
	        
	 	fact = fact * i;
	    
	}
	    
	System.out.println("Factorial of " + a + " = " + fact);
	    
    
   }

}