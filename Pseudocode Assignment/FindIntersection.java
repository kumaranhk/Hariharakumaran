public class FindIntersection {
    public static void main(String[] args) {
	//Declare and intialize arrays 
        int[] arr1 = {3,2,11,4,6,7};
        int[] arr2 = {1,2,8,4,9,7};
	//Access the elements and compare it using nested for loop
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                //Comparing arrays
                if (arr1[i] == arr2[j]){
		    // print the elements
                    System.out.print(arr1[i]+" ");

                }
            }
        }
    }
}
