package objectMethods;

//Object class --> Parent class java classes
//special methods --> to be used almost everywhere
//1) toString() -->

import java.util.Objects;

//POJO - plain old java objects
class Person{
    private int ssn;
    private String name;

    public Person(int ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString() --> string representation of the object
    /*
    @Override
    public String toString() {
        return "Person{" +
                "ssn=" + ssn +
                ", name='" + name + '\'' +
                '}';
    }*/

    @Override
    public boolean equals(Object o) {
        if (this.getSsn() == ((Person)o).getSsn()){
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

public class TestObjectClassMethods {

    public static void main(String[] args){
        Person p1 = new Person(101,"John");
        Person p2 = new Person(102,"John");

        //System.out.println(p1.equals(p2));

        System.out.println(p1);
        System.out.println(p2);
    }
}
