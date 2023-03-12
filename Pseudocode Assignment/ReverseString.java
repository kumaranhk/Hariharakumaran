public class ReverseString{
    public static void main(String[] args){
        //Declare and initialize string need to reverse
        String str = "Kumaran";
        //Change the string into an array
        char[] ch = str.toCharArray();
        //Access and print elements in array using for loop
        for( int i = ch.length - 1 ; i >= 0 ; i--){
            System.out.print(ch[i]);
        }
    }
}