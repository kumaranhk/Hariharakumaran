public class PrintEvenNumbersinRange{
    	public static void main(String[] args) {
    		    //Declare and initialize range 
	    		int start = 1 ;
	    		int end = 20;
	    		//Access the elements using for loop
	    		for(int i = start ; i <= end ; i++){
	    		    //check whether it is odd or even using modulo operator
    		        if (i % 2 == 0 ){
    		            //Print the values which statisfies the condition
    		            System.out.print(i + " ");
    		        }
	    		}
    	}

}