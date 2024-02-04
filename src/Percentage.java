import java.util.*;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks:");
        int total_marks = sc.nextInt();
        System.out.println("Enter obtained marks:");
        int obtained_marks = sc.nextInt();
        sc.close();
        float Percentage = ((float) obtained_marks / total_marks) * 100;
        System.out.println("Your percentage is " + Percentage + " ! ");
    }

}