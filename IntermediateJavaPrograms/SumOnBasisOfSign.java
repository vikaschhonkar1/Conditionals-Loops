// Write a program to print the sum of negative numbers, 
// sum of positive even numbers and the sum of positive 
// odd numbers from a list of numbers (N) entered by the 
// user. The list terminates when the user enters a zero.

package IntermediateJavaPrograms;

import java.util.*;

public class SumOnBasisOfSign {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int negative = 0;
        int pos_even = 0;
        int pos_odd = 0;
        while(true){
            int val = sc.nextInt();
            if(val==0){
                break;
            }
            else if(val<0){
                negative+=val;
            }
            else{
                if(val%2==0){
                    pos_even+=val;
                }
                else{
                    pos_odd+=val;
                }
            }
        }
        System.out.println("Sum of all Negative Numbers: "+negative);
        System.out.println("Sum of all positive Odd Numbers: "+pos_odd);
        System.out.println("Sum of all positive Even Numbers "+pos_even);
        sc.close();
    }
}
