package IntermediateJavaPrograms;

import java.util.*;

public class CommissionPercentage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter Commission Percentage: ");
        double commissionPercentage = sc.nextDouble();
        double commission = (amount*commissionPercentage)/100;
        System.out.println("The commission is "+commission);
        sc.close();
    }
}
