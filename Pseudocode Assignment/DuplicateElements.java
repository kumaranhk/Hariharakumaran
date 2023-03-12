public class DuplicateElements{
	
    public static void main(String[] args) {
	    
	//Declare and initialize array need to check
	    
	int num[] = {1,2,3,5,7,3,2,1};
	    
	//Access elements in array using nested for loop
	    
	for(int i = 0 ; i < num.length ; i++){
	        
		for(int j = i + 1 ; j < num.length ; j++){
	            
		//Compare the elements 
	            
			if (num[i] == num[j]){
	                
			//Print the duplicate elements
	                
			System.out.println("Duplicate element = " + num[i]);
	            
			}
	        
		}
	    
	}
	
    }

}