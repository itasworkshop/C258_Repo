class MyClass{
    //static int x = 10; //yu don't need object to call static
    int x; //private, protected and public
    float y;
    boolean p;
    String q;

    public int getValueOfX(){
        return x;
    }

}
public class TestStatic {
    public static void main(String[] args){
        //creating objects
        MyClass obj = new MyClass();

        //System.out.println(MyClass.x);
        System.out.println(obj.x); //0
        System.out.println(obj.y); //0.0
        System.out.println(obj.p); //false
        System.out.println(obj.q); //null
        System.out.println(obj.getValueOfX());
    }

    /*
    static int x = 20; //private, protected and public

    public int getValueOfX(){
        return x;
    }
    */



}
