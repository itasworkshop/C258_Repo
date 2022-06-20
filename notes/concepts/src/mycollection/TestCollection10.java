package mycollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestCollection10 {

    public static void main(String[] args) {
        //HashMap --> Map which is unsorted and unordered
        //Only one null key is allowed ,if we try to give more than one null key the latest value will be taken
        //Map<Integer,String> mymap = new HashMap<Integer,String>();
        //Hashtable doesn't allowe anything null, neither key nor value, thread safe method
        Map<Integer,String> mymap = new Hashtable<>();

        mymap.put(101,"Rajesh");
        mymap.put(102,"John");
        mymap.put(103,"Tom");
        //mymap.put(104,null);
        //mymap.put(105,null);
        mymap.put(null,"Harry1");
        //mymap.put(null,"Harry2");


        System.out.println(mymap);

        System.out.println(mymap.get(102));

        for (Integer i : mymap.keySet()) {
            System.out.println(mymap.get(i));
        }
    }
}
