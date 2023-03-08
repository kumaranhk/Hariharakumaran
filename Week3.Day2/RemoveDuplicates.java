package Assignment;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String text = "We learn java basics as part of java sessions in java week1";
        int count = 0;
        //Splitting the string
        String string[] = text.split(" ");
        for (int i = 0; i < string.length ; i++) {
           // System.out.print(string[i] + " ");
            count = 1;
            for (int j = i + 1 ; j < string.length ; j++) {
                // Comparing string, if it is available then increase and count by 1
                if (string[i].equals(string[j])){
                    count ++;
                }
                //if the count > 1 then replace the word as ""
                if (count > 1){
                    string[i]="";
                }
            }
        }
        // Printing the output without duplicate
        for (int i = 0; i < string.length ; i++) {
            System.out.print(string[i] + " ");}

    }

}
