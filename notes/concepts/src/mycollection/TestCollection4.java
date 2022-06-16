package mycollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestCollection4 {
    public static void main(String[] args) {
        Set<String> myset = new LinkedHashSet<>();

        myset.add("Harry");
        myset.add("Rajesh");
        myset.add("john");
        myset.add("Tom");
        myset.add("Tom");

        System.out.println(myset);
    }
}
