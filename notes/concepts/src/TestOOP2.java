class Laptop1{

    int price;
    String company;

    Laptop1(int price,String cname){
        System.out.println("Hello from constructor.");
        this.price = price;
        this.company = cname;
    }

    public void playsMusic(){
        System.out.println("Laptop is playing music.");
    }

    public void getConfiguration(){
        System.out.println("This is "+ this.company + " laptop which costs "+ this.price);
    }

}

public class TestOOP2 {

    public static void main(String[] args){
        Laptop1 laptop1 = new Laptop1(5000,"Dell"); //create laptop object
        Laptop1 laptop2 = new Laptop1(7000,"MacBook");

        //laptop1.price = 5000;
        //laptop1.company = "Dell";

        laptop1.getConfiguration();
        laptop1.playsMusic();

        //laptop2.price = 7000;
        //laptop2.company = "MacBook";

        laptop2.getConfiguration();
        laptop2.playsMusic();


    }


}