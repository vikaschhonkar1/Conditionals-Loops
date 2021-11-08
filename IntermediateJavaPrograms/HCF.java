package IntermediateJavaPrograms;

import java.util.*;

public class HCF {
    public static int hcf(int a, int b){
        if(b==0){
            return a;
        }
        return hcf(b, a%b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = hcf(a,b);
        System.out.println("HCF of Entered Numbers is "+ans);
        sc.close();
    }
}
