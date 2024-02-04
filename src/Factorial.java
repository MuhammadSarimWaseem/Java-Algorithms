import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        // Finding Factorial form for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num1 = sc.nextInt();
        long fact1 = 1;
        if (num1 >= 0) {
            for (int i1 = 1; i1 <= num1; i1++) {
                fact1 = fact1 * i1;
            }
            System.out.println("The factorial of " + num1 + " from for loop is: " + fact1);
        }

        // Finding Factorial form while loop loop
        System.out.println("Enter number:");
        int num2 = sc.nextInt();
        sc.close();
        long fact2 = 1;
        int i2 = 1;
        if (num2 >= 0) {
            while (i2 <= num2) {
                fact2 = fact2 * i2;
                i2++;
            }
            System.out.println("The factorial of " + num2 + " from while loop is: " + fact2);

        }
    }
}