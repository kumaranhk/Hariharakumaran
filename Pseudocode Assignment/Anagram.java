import java.util.Arrays;

public class Anagram
{
    
    public static void main(String[] args) {
        
	//Declare a variable and initialize values need to check	    
	String str1 = "care";
	    
	String str2 = "race";

	//Compare the string length 	    
	if (str1.length() == str2.length()){

	        //Convert the strings into arrays
		char[] ch = str1.toCharArray();
	        
		char[] ch1 = str2.toCharArray();

		//sort the arrays	        
		Arrays.sort(ch);
	        
		Arrays.sort(ch1);

	        //Compare the arrays 
		if (Arrays.equals(ch,ch1)){
	            
			System.out.println("Given strings are anagram");
	        
		}
	        
		else{
	            
			System.out.println("Given strings are not anagram");
	        
		}
	    
	}

	//if the string length is not equal then it won't be an anagram   
	else{
	            
		System.out.println("Given strings are not anagram");
	        
	}
	    
    
   }

}