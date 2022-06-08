public class HelloMyWorld3 {

    public static void addition(int a,int b){
        int result = a+b;
        System.out.println(result);
    }

    public static int areaSquare1(int side){
        int result = side * side;
        return result;
    }

    public static void areaSquare2(int side){
        int result = side * side;
        System.out.println(result);
    }


    public static void main(String[] args){

        addition(12,34);

        System.out.println(areaSquare1(5)*5);
    }
}
