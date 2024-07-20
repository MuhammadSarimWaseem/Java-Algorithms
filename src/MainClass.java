class X {
    void calculate(int a, int b) {
        System.out.println("class x");
    }
}

class Y extends X{
    void calculate(int a, int b) {
        System.out.println("class y");
    }
}

class Z extends Y {
    void calculate(int a, int b) {
        System.out.println("class z");
    }
}

public class MainClass {
    public static void main(String[] args) {
        X x = new Y();
        x.calculate(10, 20);

        X y = (X) x;
        y.calculate(50, 100);
        
        Y s = (Y) y;
        s.calculate(50, 100);

        Z z = (Z) y;
        z.calculate(100, 200);
    }
}