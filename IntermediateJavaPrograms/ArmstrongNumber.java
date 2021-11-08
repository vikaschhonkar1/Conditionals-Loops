package IntermediateJavaPrograms;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int val = 0;
        int n_ = n;
        while(n>0){
            int temp = n%10;
            n/=10;
            val+=(temp*temp*temp);
        }
        if(val==n_){
            System.out.println("Entered Number is an Armstrong Number");
        }
        else{
            System.out.println("Entered Number is not an Armstrong Number");
        }
        sc.close();
    }
}
