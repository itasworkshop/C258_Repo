//interface will only have abstract
//diff between AC and Inter
//1) Ac-- both methods, Inter only abstract
//2) only extends one class but we can implements multiple interfaces

interface CentralBank{

    void getEMI(int rate);
}

interface WorldBank{

    void getWorldEMI(int rate);
}

class HSBC implements CentralBank,WorldBank{

    @Override
    public void getEMI(int rate) {
        System.out.println("so the HSBC EMI will be from central bank "+ rate*2);
    }

    @Override
    public void getWorldEMI(int rate) {
        System.out.println("so the HSBC EMI will be from world bank "+ rate*2);
    }
}

class OCBC implements CentralBank{

    @Override
    public void getEMI(int rate) {
        System.out.println("so the OCBC EMI will be "+ rate*3);
    }
}


public class TestOOP9 {
    public static void main(String[] args) {
        HSBC obj1 = new HSBC();
        OCBC obj2 = new OCBC();

        obj1.getEMI(10);
        obj2.getEMI(10);
    }
}
