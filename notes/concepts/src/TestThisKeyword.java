//this keyword --> current object
class MyClass1{
    int x;  //declared x

    int getValueOfX(){
        return this.x;
    }

}
public class TestThisKeyword {
    public static void main(String[] args){
        MyClass1 obj = new MyClass1();
        obj.x = 50; //assigning value of x

        int x = 20;
        System.out.println(obj.x);
        System.out.println(x);

        System.out.println(obj.getValueOfX());
    }
}
