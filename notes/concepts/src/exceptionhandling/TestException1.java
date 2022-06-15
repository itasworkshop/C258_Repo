package exceptionhandling;

public class TestException1 {

    public static void division(int a,int b){
        int result = 0;
        result = a/b;
        System.out.println(result);
    }

    public static void myCalc(int a,int b){
        division(a,b);
    }

    public static void main(String[] args){


        System.out.println("Before Exception!");

        myCalc(10,0);
        System.out.println("After Exception!");
    }
}
