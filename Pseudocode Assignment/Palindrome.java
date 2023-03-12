public class Palindrome {
    public static void main(String[] args) {
	//Declare and initialize a new string
        String str = "madam";
        //Initialization of empty string to store reversed characters
        String rev = "";
	//Access the characters in string using for loop
        for (int i = str.length() - 1; i >=0; i--) {
            //Adding character to rev
            rev = rev + str.charAt(i);
        }
        //comparing strings
        if (str.equals(rev))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");
    }
}