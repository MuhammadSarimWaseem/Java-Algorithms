public class Test {
    public static void main(String[] args) {
        new A();
        new B();
    }
}

class  A {
    int i = 7;

    public  A() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B extends A {
    public B() {
        System.out.println("i from B is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
}

// public class Test {
//     public static void main(String[] args) {
//         Object fruit = new Fruit();
//         Object apple = (Apple) fruit;
//     }
// }

// class Apple extends Fruit {
//     void X(){
//         System.out.println("X");

//     }
// }

// class Fruit {
//     void X(){
//         System.out.println("Y");

//     }
// }