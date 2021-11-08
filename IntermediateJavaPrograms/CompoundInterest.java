package IntermediateJavaPrograms;

import java.util.*;

public class CompoundInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        double p = sc.nextDouble();
        System.out.println("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter Time: ");
        double t = sc.nextDouble();
        double ci = p*(Math.pow((1+r/100), t));
        System.out.println("The Compound Interest is: "+ci);
        sc.close();
    }
}
