//Inheritance --> parent-child relationship
//Is-A relationship and Has-A relationship

class Calculator1 {
    private int x;
    private int y;

    public Calculator1() {
    }

    public Calculator1(int x, int y) {
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

    public int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtraction(int a, int b) {
        int sum = a - b;
        return sum;
    }

}

class ScientificCalc extends Calculator1{

    private int z;

    ScientificCalc(){}

    ScientificCalc(int x,int y,int z){
        super(x,y); //super keyword represents parent object
        this.z = z;
    }

    public void areaCalc(){
        System.out.println("Advanced area calc.");
    }
}


public class TestOOP6 {
    public static void main(String[] args){
        //Calculator1 calc = new Calculator1();

        ScientificCalc calc = new ScientificCalc();
        System.out.println(calc.addition(20,30));
        calc.areaCalc();
    }
}
