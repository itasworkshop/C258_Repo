// final keyword --> 1) with class --> no more child, you can not inherit final class
//                      2) with methods --> it won't allow overriding
//                      3) with varibales --> once you assign final variable no more reassignment

class Student2{
    final int id;
    String name;

    Student2(int id,String name){
        this.id = id;
        this.name = name;
    }

    public final void myIntro(){
        System.out.println("Hey this is "+this.name+" and my id is "+ this.id);
    }
}

public class TestFinalKeyword extends Student2{
    TestFinalKeyword(int id, String name) {
        super(id, name);
    }

    /*
    public void myIntro(){
        System.out.println("Hey this is "+this.name+" and my id is "+ this.id);
    }
    */

    public static void main(String[] args){
        Student2 st = new Student2(101,"Rajesh");
        //st.id = 202; //once you assign final variable no more reassignment
        st.myIntro();
    }
}
