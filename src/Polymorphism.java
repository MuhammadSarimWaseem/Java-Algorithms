class Abc {
    void method1() {
        System.out.println("method1 from parent class");
    }
    void method2() {
        System.out.println("method2 from parent class");
    }
}

class Bbc extends Abc {
    void method1() {
        System.out.println("method1 from child class");
    }
    void method3() {
        System.out.println("method3 from child class");
    }
}

 class Polymorphism {
    public static void main(String[] args) {
        Abc a =(Abc) new Bbc();
        a.method1();
        a.method1();
        a.method2();
    }
}
