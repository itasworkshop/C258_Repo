//import mypackage.MyPackageTest;
import mypackage.TestPackage;

public class TestPackageOutside extends TestPackage{

    public static void main(String[] args){
        //MyPackageTest obj = new MyPackageTest(); //not available because its default
        TestPackage obj1 = new TestPackage();
        TestPackageOutside obj2 = new TestPackageOutside();
        obj2.printMe(); //protected but available outside package due to inheritance
    }
}
