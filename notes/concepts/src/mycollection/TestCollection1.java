package mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//ArrayList --> powerful array with no predefined size
//good for faster iteration

public class TestCollection1 {
    public static void main(String[] args){
        List<String> mylist = new ArrayList<String>();

        mylist.add("Rajesh");
        mylist.add("John");
        mylist.add("Tom");
        mylist.add("Harry");

        System.out.println(mylist);

        Collections.sort(mylist);

        System.out.println(mylist);

        for (String name: mylist) {
            System.out.println(name);
        }

        Iterator<String> itr = mylist.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        mylist.remove("Rajesh");

        System.out.println(mylist);





    }
}
