package mycollection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Student3{
    private int id;
    private String name;

    public Student3(int id, String name) {
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
        return "Student3{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this.getId() == ((Student3)o).getId()){
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



}
public class TestStudentCollection {

    public static void main(String[] args) {
        Student4 st1 = new Student4(101,"Rajesh");
        Student4 st2 = new Student4(102,"Tom");
        Student4 st3 = new Student4(102,"Tom");
        Student4 st4 = new Student4(104,"Harry");


        //Set<Student3> myset = new LinkedHashSet<>();
        Set<Student4> myset = new TreeSet<>(); //unique as well as sorted based on logic given in comparable

        myset.add(st1);
        myset.add(st2);
        myset.add(st4);
        myset.add(st3);
        //myset.add(st2);

        System.out.println(myset);
    }
}
