// interface df {
//     void m1f();
//     }
//     class Bss implements df {
//     public void m1f() {
//      System.out.println("m1f");
//      }
//     }

// public class MainClass {
//     public static void main(String[] args) {
//         int i = 15;
//         int j = 30;
//         int z = i++ + --j;
//         System.out.println(z);
//     }
// }

public class M {
    int i;

    public M(int i) {
        this.i = ++i;
    }
}

class N extends M {
    public N(int i) {
        super(i--);
        System.out.println(i + " " + this.i + " " + super.i);
    }
}

class MainClass {
    public static void main(String[] args) {
        N n = new N(20);
    }
}