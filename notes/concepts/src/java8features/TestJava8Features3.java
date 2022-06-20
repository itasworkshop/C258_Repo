package java8features;

interface MyInterface1{

    static void myStaticPrintMe(){
        System.out.println("Hello from static method interface. 1");
    }

    default void myDefaultPrintMe(){
        System.out.println("Hello from default method interface. 1");
    }

}

interface MyInterface2{

    static void myStaticPrintMe(){
        System.out.println("Hello from static method interface. 2");
    }

    default void myDefaultPrintMe(){
        System.out.println("Hello from default method interface. 2");
    }

}

public class TestJava8Features3 implements MyInterface1,MyInterface2{

    /*
    public void myDefaultPrintMe(){
        System.out.println("Hello from new impl of default method interface.");
    }
    */

    public static void main(String[] args) {
        TestJava8Features3 obj = new TestJava8Features3();
        //MyInterface.myStaticPrintMe();

        obj.myDefaultPrintMe();
    }

    @Override
    public void myDefaultPrintMe() {
        MyInterface2.super.myDefaultPrintMe();
    }
}
