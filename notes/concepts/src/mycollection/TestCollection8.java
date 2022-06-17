package mycollection;

//Map --> key-value pair

//wrapper classes --> int --> primitive integer
//                  Integer --> wrapper class

public class TestCollection8 {

    public static void main(String[] args) {
        int x = 10;

        System.out.println(x);

        //Integer obj = new Integer(10);
        Integer obj = 10;

        obj++; //no we increasing int value of wrapper obj --> autoboxing

        //Boxing and Unboxing

        System.out.println(obj.intValue());
    }
}
