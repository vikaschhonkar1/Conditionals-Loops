package IntermediateJavaPrograms;

import java.util.*;

public class DepriciationOfValue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        long amount = sc.nextLong();
        System.out.println("Enter Depreciation Percentage");
        long deppercent = sc.nextLong();
        System.out.println("Enter Number of Years");
        long year = sc.nextLong();
        long ans = amount;
        while(year-->0){
            ans = ((100-deppercent)*ans)/100;
        }
        System.out.println("After Depreciation: "+ans);
        sc.close();
 
    }
}
