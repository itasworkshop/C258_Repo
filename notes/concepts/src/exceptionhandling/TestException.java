package exceptionhandling;

//Exception --> scenario which are unusual and break our flow of program abruptly
//Exception handling --> gracefully ending your program with or without exception

public class TestException {
    public static void main(String[] args){

        System.out.println("Before Exception!");
        int a = 10;
        int b = 0; //b = 0 is unwanted and possible
        int result = 0;

        try {
            result = a / b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("The value of result is "+result);
        System.out.println("After Exception!");
    }
}
