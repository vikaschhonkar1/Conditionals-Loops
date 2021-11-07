package BasicJavaPrograms;

import java.util.*;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        if(n==1){
            System.out.println(1);
        }
        else if(n==2){
            System.out.println(1+" "+1);
        }
        else{
            System.out.print(1+" "+1+" ");
            n-=2;
            while(n-->0){
                int c = a+b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}
