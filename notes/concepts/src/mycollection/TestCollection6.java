package mycollection;

import java.util.ArrayList;
import java.util.Collections;

class Student4 implements Comparable<Student4>{
    private int id;
    private String name;

    public Student4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student4{" + id +
                " name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this.getId() == ((Student4)o).getId()){
            return true;
        }else {
            return false;
        }
    }

    //for better search performance
    @Override
    public int hashCode() {
        return 5;
    }

    //logic for sorting comparision
    @Override
    public int compareTo(Student4 o) {
        if (this.getId() >= o.getId()){
            return 2;
        }else if(this.getId() <= o.getId()){
            return -2;
        }else {
            return 0;
        }
    }
}
public class TestCollection6 {
    public static void main(String[] args) {
        Student4 st1 = new Student4(101, "Rajesh");
        Student4 st2 = new Student4(122, "Tom");
        Student4 st3 = new Student4(33, "John");
        Student4 st4 = new Student4(104, "Harry");

        ArrayList<Student4> mylist = new ArrayList<>();

        mylist.add(st1);
        mylist.add(st3);
        mylist.add(st4);
        mylist.add(st2);

        System.out.println(mylist);

        Collections.sort(mylist);

        System.out.println(mylist);

    }
}
