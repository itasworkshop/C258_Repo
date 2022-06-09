import java.util.Scanner;

class Person{
    int age;
    String name;

    Person(int age,String name){
        this.name = name;
        this.age = age;
    }

    public void getIntro(){
        System.out.println("Hey this is "+this.name+" , I am "+ this.age+" years old.");
    }

}

public class TestOOP3 {

    /*
    public void canOrCanNotVote(int age){
        if(age > 18){
            System.out.println("Yes You can vote!");
        }else{
            System.out.println("Sorry You can not vote!");
        }
    }*/

    public void canOrCanNotVote(Person person){
        if(person.age > 18){
            System.out.println("Yes"+" Mr/Mss " + person.name+ " You can vote!");
        }else{
            System.out.println("Sorry +\" Mr/Mss \" + person.name+ \" You can not vote!");
        }
    }

    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please Enter your age. ");
        //int age = sc.nextInt();

        TestOOP3 obj = new TestOOP3();
        Person person = new Person(25,"Rajesh");
        //obj.canOrCanNotVote(age);
        obj.canOrCanNotVote(person);

    }
}
