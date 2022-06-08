import java.util.Scanner;

public class TestIfElseFull {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age if you want to join party --- ");
        int age = sc.nextInt();
        char gender  = 'M';

        if (age<21){
            System.out.println("Sorry!, Not allowed in Party.");
        }else if (gender == 'M'){
            System.out.println("Sorry!, Not allowed in Party for one more reason.");
        }else{
            System.out.println("Welcome to Party.");
        }
    }
}
