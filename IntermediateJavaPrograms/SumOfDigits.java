package IntermediateJavaPrograms;

import java.util.*;

public class SumOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum+=temp;
            n/=10;
        }
        System.out.println("The sum of digits of entered Number is "+sum);
        sc.close();
    }
}
