import java.util.*;
public class SeconLargestNumberInArray {
    public static void main(String[] args) {
        //Declare and initialize array 
        int[] number={1,5,9,2,6,3,5,4,8,7};
        //Sort the array
        Arrays.sort(number);
        //print the second largest number
        System.out.println(number[number.length - 2]);
    } 
}