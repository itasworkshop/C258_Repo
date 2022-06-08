import java.util.Scanner;

public class TestIfElse {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age if you want to join party --- ");
        int age = sc.nextInt();

        if (age<21){
            System.out.println("Sorry!, Not allowed in Party.");
        }else{
            System.out.println("Welcome to Party.");
        }
    }
}
