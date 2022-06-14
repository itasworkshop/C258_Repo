//Overridding --> using latest version of method implementation in parent child hirearchy

class Parent{

    public void myIntro(){
        System.out.println("Hello from parent.");
    }
}

class Child extends Parent{

    public void myIntro(){
        System.out.println("Hello from child.");
    }

}

public class TestOOP7 {

    public static void main(String[] args){
        Child obj = new Child();
        //Parent obj = new Child();
        //Parent obj = new Parent();
        obj.myIntro();
    }
}
