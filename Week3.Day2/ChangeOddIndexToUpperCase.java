package Assignment;

public class ChangeOddIndexToUpperCase {
    public static void main(String[] args) {
        String test = "changename";
        //Convert the string into character array
        char[] ch = test.toCharArray();
        //Access the elements in array using for loop
        for (int i = 0; i < ch.length; i++) {
            //Condition for access odd index
            if (i % 2 != 0){
                //Using character class for changing character to uppercase
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        //Printing the new string
        System.out.print(ch);

    }

}
