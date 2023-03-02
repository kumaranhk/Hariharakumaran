public class Calculator {
    public long additionTwoNumber(int a , int b){
        return a + b;
    }
    public int subtractionTwoNumbers(int e , int f){
        return e - f;
    }
    public double multipleTwoNumbers(double i ,double j){
        return i * j;
    }
    public double divideTwoNumbers(float x , float y){
        return x / y;
    }

    public static void main(String[] args) {
        Calculator operation = new Calculator();
        System.out.println(operation.additionTwoNumber(5555 , 9999));
        System.out.println(operation.subtractionTwoNumbers(5555 , 9999));
        System.out.println(operation.multipleTwoNumbers(55.55 , 99.99));
        System.out.println(operation.divideTwoNumbers(555.456f, 5.55f));
    }
}
