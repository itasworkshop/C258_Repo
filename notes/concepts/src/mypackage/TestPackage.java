package mypackage;

//1) private --> only within class
//2) default --> not outside package
//3) public --> accessible inside, outside package and file


class MyPackageTest{

    public void printMe(){
        System.out.println("Hello from mypackage.");
    }
}

public class TestPackage {

    protected void printMe(){
        System.out.println("Hello from Test package.");
    }

    public static void main(String[] args){
        MyPackageTest obj = new MyPackageTest();
        obj.printMe();
    }
}
