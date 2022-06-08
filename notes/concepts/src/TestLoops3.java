public class TestLoops3 {

    public static void main(String[] args) {
        String[] names = {"Rajesh","John","Tim"};

        //for-each we used to call but java 8 onwards we have another foreach keyword
        //when we don't care about indexing, i care about only item
        for(String name:names){
            System.out.println(name);
        }
    }
}
