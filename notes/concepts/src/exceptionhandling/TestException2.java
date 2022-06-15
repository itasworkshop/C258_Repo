package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {

    //throws keyword says throw this exception as of now lets handle later
    public static void readMyFile() {
        try {
            FileReader reader = new FileReader("resources/myfile1.txt");
            System.out.println(reader.read());
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){

        System.out.println("Before Exception!");


            readMyFile();

        System.out.println("After Exception!");
    }
}
