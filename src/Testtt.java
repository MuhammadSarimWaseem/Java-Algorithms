// public class Testtt {
//     public static void main(String[] args) {
//         Number x = 3;
//         System.out.println(x.intValue());
//         System.out.println(x.doubleValue());
//     }
// }

// public class Testtt {
//     public static void main(String[] args) {
//         int max = 0;
//         max(1, 2, max);
//         System.out.println(max);
//     }

//     public static void max(
//             int value1, int value2, int max) {
//         if (value1 > value2)
//             max = value1;
//         else
//             max = value2;
//     }
// }

// public class Testtt {
//     public static void main(String[] args) {
//     int i = 1;
//     while (i <= 6) {
//      method1(i, 2);
//      i++;
//      }
//      }
//     public static void method1(
//     int i, int num) {
//     for (int j = 1; j <= i; j++) {
//      System.out.print(num + " ");
//      num *= 2;
//      }
//      System.out.println();
//      }
//     }

// public class Testtt {
//     public static void main(String[] args) {
//         // Initialize times
//         int times = 3;
//         System.out.println("Before the call,"
//                 + " variable times is " + times);
//         // Invoke nPrintln and display times
//         nPrintln("Welcome to Java!", times);
//         System.out.println("After the call,"
//                 + " variable times is " + times);
//     }

//     // Print the message n times
//     public static void nPrintln(String message, int n) {
//         while (n > 0) {
//             System.out.println("n = " + n);
//             System.out.println(message);
//             n--;
//         }
//     }
// }

// public class Testtt {
//     private static int i = 0;
//     private static int j = 0;

//     public static void main(String[] args) {
//         int i = 2;
//         int k = 3;
//         {
//             int j = 3;
//             System.out.println( i + j);
//         }
//         k = i + j;
//         System.out.println("k is " + k);
//         System.out.println("j is " + j);
//     }
// }

// public class Testtt {
// public static void main(String[] args) {
// int max = 0;
// max(1, 2, max);
// System.out.println(max);
// }

// public static void max(int value1, int value2, int max) {
// if (value1 > value2)
// max = value1;
// else
// max = value2;
// }
// }

// public class Testtt {
//     public static void main(String[] args) {
//         int i = 0;
//         while (i <= 4) {
//             method1(i);
//             i++;
//         }
//         System.out.println("i is " + i);
//     }

//     public static void method1(int i) {
//         do {
//             if (i % 3 != 0)
//                 System.out.print(i + " ");
//             i--;
//         } while (i >= 1);

//         System.out.println();
//     }
// }

class Testtt {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        swap1(circle1, circle2);
        System.out.println("After swap1: circle1 = " +
                circle1.radius + " circle2 = " + circle2.radius);
        swap2(circle1, circle2);
        System.out.println("After swap2: circle1 = " +
                circle1.radius + " circle2 = " + circle2.radius);
    }

    public static void swap1(Circle x, Circle y) {
        Circle temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(Circle x, Circle y) {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }
}

class Circle {
    double radius;

    Circle(double newRadius) {
        radius = newRadius;
    }
}