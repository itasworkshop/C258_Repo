//abstraction --> some details can be provided later we can only decide body of method// contract
//1) Abstract class --> concrete as well as abstract method
//2) Interface

abstract class MyAbstractClass{

    //methods -->   1) concrete method -- both body and definition,
    //              2) abstract method --> definition part
    abstract public void myGreeting(String name);

    public void printMe(){
        System.out.println("Hello from abstract class.");
    }

}

class EnglishCommunity extends MyAbstractClass{

        @Override
        public void myGreeting(String name) {
            System.out.println("Good morning Mr/Mrs "+ name);
        }
}

class GermanCommunity extends MyAbstractClass{

    @Override
    public void myGreeting(String name) {
        System.out.println("Gluten Morgun Mr/Mrs "+ name);
    }
}

public class TestOOP8 {

    public static void main(String[] args){
        EnglishCommunity obj1 = new EnglishCommunity();
        GermanCommunity obj2 = new GermanCommunity();

        obj1.myGreeting("John");
        obj1.printMe();
        obj2.myGreeting("John");
        obj2.printMe();
    }

}
