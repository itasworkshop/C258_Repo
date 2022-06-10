class Student{
    private int rollno; //private means only accessible within the class
    private String name;
    private int marks;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    //Overloading --> diff number of parameters and type of parameters
    Student(){

    }

    //parameterised constructor
    Student(int rollno,String name,int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }

    public void myIntro(){
        System.out.println("Hey this is "+this.name+" my id is "+ this.rollno+" and i scored "+this.marks);
    }
}

public class TestOOP4 {
    public static void main(String[] args){
        Student st1 = new Student(101,"Rajesh",83);
        Student st12 = new Student();
        Student st3 = new Student(103,"Raj");


        //st1.rollno = 202; //dangerous -->it might break others code/implementation
        st1.setRollno(202);
        System.out.println(st1.getMarks());
        st1.myIntro();
    }

}
