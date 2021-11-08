package IntermediateJavaPrograms;

import java.util.*;

public class PerfectNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(Math.ceil(Math.sqrt((double)n))== Math.floor(Math.sqrt((double)n))){
            System.out.println("Entered Number is Perfect Square.");
        }
        else{
            System.out.println("Entered Number is not a perfect square");
        }
        sc.close();
    }
}
