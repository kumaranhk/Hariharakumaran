package Assignment.Week3.Day2;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] number =  {1,2,3,4,7,6,8};
        Arrays.sort(number);

        //Method 1: We compare the digits with their +1 number.
        for (int i = 0; i < number.length; i++) {
                if(number[i] != i + 1){
                    System.out.println("Missing element = "+(i+1));
                    break;
                }
        }
       
    }
}
