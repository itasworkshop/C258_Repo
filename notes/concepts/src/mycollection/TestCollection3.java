package mycollection;

import java.util.HashSet;
import java.util.Set;

public class TestCollection3 {
    public static void main(String[] args) {
        Set<String> myset = new HashSet<>(); //general purpose unordered, unsorted, takes only unique items

        myset.add("Rajesh");
        myset.add("john");
        myset.add("Tom");
        myset.add("Tom");

        System.out.println(myset);
    }
}
