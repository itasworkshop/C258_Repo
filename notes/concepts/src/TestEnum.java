import java.util.Locale;

enum Mydays{

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

enum CoffeSize{

    SMALL(100),
    MEDIUM(200),
    LARGE(300);

    private final int quantity;

    CoffeSize(int quantity){
        this.quantity = quantity;
    }

}

class StarBucksCoffee{

    int price;
    String name;
    //String coffee_size;
    CoffeSize size;
}

public class TestEnum {
    public static void main(String[] args) {
        Mydays day1 = Mydays.SUNDAY;
        Mydays day12 = Mydays.FRIDAY;


        System.out.println(day1);

        StarBucksCoffee pumpkinLatte = new StarBucksCoffee();
        pumpkinLatte.price =20;
        pumpkinLatte.name ="Pumpkin Latte";
        pumpkinLatte.size = CoffeSize.MEDIUM;


        System.out.println(pumpkinLatte.size);
    }

}
