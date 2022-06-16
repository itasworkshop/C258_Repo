package mycollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//LinkedList --> good for insertion and deletion

public class TestCollection2 {

    public static void main(String[] args) {
        //List<String> mylist = new LinkedList<String>();
        List<String> mylist = new Vector<>();

        mylist.add("Rajesh");
        mylist.add("John");
        mylist.add("Tom");
        mylist.add("Harry");

        System.out.println(mylist);
    }
}
