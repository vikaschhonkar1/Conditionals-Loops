package IntermediateJavaPrograms;

import java.util.*;

public class nCrAndnPr {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter value of r: ");
        int r = sc.nextInt();
        int npr = fact(n)/fact(n-r);
        System.out.println("Value of npr is "+npr);
        int ncr = (fact(n))/(fact(r)*fact(n-r));
        System.out.println("Value of ncr is "+ncr);
        sc.close();
    }
}
