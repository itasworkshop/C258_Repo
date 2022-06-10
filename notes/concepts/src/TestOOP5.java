class Calculator{
    private int x;
    private int y;

    public Calculator(){}

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //method overloading --> same name method but with different no or type of para
    // automatically decides which addition to call depending on no or type of para
    public int addition(int a,int b){
        System.out.println("hi from two para");
        int sum = a + b;
        return sum;
    }

    public int addition(int a,int b,int c){
        System.out.println("hi from three para");
        int sum = a + b + c;
        return sum;
    }
}

public class TestOOP5 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.addition(20,30));
        System.out.println(calc.addition(20,30,60));
    }
}
