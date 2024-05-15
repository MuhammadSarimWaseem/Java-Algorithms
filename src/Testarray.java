// public class Testarray {
//     public static void main(String[] args) {
//         int alpha[][] = { { 1, 2 }, { 3, 4 } };
//         int beta[] = { 5, 6, 7 };
//         alpha[0] = beta; // this line replace the index of 0 alpha with beta and the values of the 0
//                          // alpha will be vanish
//         System.out.println(alpha[0][1] + alpha[1][1]);

//     }

// }

class child1 {
    int j = 200;

    public void Method6() {
        int i = 200;
        System.out.println(i);
    }
}

class child2 extends child1 {
    int j = 100;

    public void Method6() {
        int i = 100;
        System.out.println(i);
    }
}

public class Testarray {
    public static void main(String[] args) {
        child1 a = new child2();
        System.out.println(a.j);
        a.Method6();
    }
}