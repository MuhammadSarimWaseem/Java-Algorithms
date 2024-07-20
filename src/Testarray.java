// public class Testarray {
//     public static void main(String[] args) {
//         int alpha[][] = { { 1, 2 }, { 3, 4 } };
//         int beta[] = { 5, 6, 7 };
//         alpha[0] = beta;
//         System.out.println(alpha[0][1] + alpha[1][1]);
//         // System.out.println(alpha[2][1]);
//     }
// }

// class child1 {
//     int j = 200;

//     public void Method6() {
//         int i = 200;
//         System.out.println(i);
//     }
// }

// class child2 extends child1 {
//     int j = 100;

//     @Override
//     public void Method6() {
//         int i = 100;
//         System.out.println(i);
//     }
// }

// public class Testarray {
//     public static void main(String[] args) {
//         child1 a = new child2();  // 200
//         System.out.println(a.j);  //100
//         a.Method6();

//         child1 b=new child1();  //200
//         System.out.println(b.j);//200
//         b.Method6();

//         child2 c=new child2();
//         System.out.println(c.j); //100
//         c.Method6(); //100
//     }
// }
