package exceptionhandling;

public class TestException3 {

    public static void division(int a,int b){
        int result = 0;
        result = a/b;
        System.out.println(result);
    }

    public static void main(String[] args){
        System.out.println("Before Exception!");
        try {
            division(10, 5);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally { //used for resource de-allocation
            System.out.println("Always gets executed.");
        }
        System.out.println("After Exception!");
    }
}
