package IntermediateJavaPrograms;

import java.util.*;

public class LCM {
    public static int hcf(int a, int b){
        if(b==0){
            return 0;
        }
        return hcf(b, a%b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = (a*b)/hcf(a, b);
        System.out.println("LCM of Entered numbers: "+ans);
        sc.close();
    }
}
