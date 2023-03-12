public class SwappingTheValuesWithTemprorayVariable{

    public static void main(String[] args) {
       
	//Declare and initialize variables
	    
	int a = 5;
	    
	int b = 4;
	    
	//Declare new variable and assign value of 'a'
	   
	int c = a;
	    
	//Assign the value 'b' to 'a'
	   
 	a = b;
	    
	//Assign the value of 'c' to 'b' 
	    
	b = c;
	    
	//Print the swapped values
	    
	System.out.println("Swapped value of a = " + a);
	    
	System.out.println("Swapped value of b = " + b);
    
    }

}
