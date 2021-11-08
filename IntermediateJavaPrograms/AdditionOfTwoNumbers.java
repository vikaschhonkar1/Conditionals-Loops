package IntermediateJavaPrograms;

import java.util.*;

public class AdditionOfTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        int sum = a+ b;
        System.out.println("Sum of entered Numbers is "+sum);
        sc.close();
    }
}
