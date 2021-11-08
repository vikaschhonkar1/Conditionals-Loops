package IntermediateJavaPrograms;

import java.util.*;

public class SumUptoN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println("Sum upto n is "+sum);
        sc.close();
    }
}
