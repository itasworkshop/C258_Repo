package mycollection;

import java.util.Hashtable;
import java.util.Map;

public class TestCollection9 {
    public static void main(String[] args) {
        Map<Integer,String> mymap = new Hashtable<Integer,String>();

        mymap.put(101,"Rajesh");
        mymap.put(102,"John");
        mymap.put(103,"Tom");

        System.out.println(mymap);

        System.out.println(mymap.get(102));

        for (Integer i : mymap.keySet()) {
            System.out.println(mymap.get(i));
        }
    }
}
