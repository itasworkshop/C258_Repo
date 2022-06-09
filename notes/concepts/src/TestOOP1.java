//Object --> Any real World entity
//1) state/properties
//2) Behaviour/Functionality
//
//Class --> Template/Blueprint for creating objects

class Laptop{

    int price;
    String company;

    public void playsMusic(){
        System.out.println("Laptop is playing music.");
    }

    public void getConfiguration(){
        System.out.println("This is "+ this.company + " laptop which costs "+ this.price);
    }

}

public class TestOOP1 {

    public static void main(String[] args){
        Laptop laptop = new Laptop(); //create laptop object

        laptop.price = 5000;
        laptop.company = "Dell";

        laptop.getConfiguration();
        laptop.playsMusic();
    }


}
