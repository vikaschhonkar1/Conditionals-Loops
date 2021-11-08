package IntermediateJavaPrograms;

import java.util.*;

public class Power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b (a^b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = 1;
        while(b-->0){
            power*=a;
        }
        System.out.println("The answer is "+power);
        sc.close();
    }
}
