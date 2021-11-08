// Given an integer U denoting the amount of KWh units of electricity consumed, 
// the task is to calculate the electricity bill with the help of the below charges: 
 

// 1 to 100 units – Rs. 10/unit
// 100 to 200 units – Rs. 15/unit
// 200 to 300 units – Rs. 20/unit
// above 300 units – Rs. 25/unit


package IntermediateJavaPrograms;

import java.util.*;

public class ElectricityBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units: ");
        int n = sc.nextInt();
        int bill = 0;
        if(n<=100){
            bill = n*10;
        }
        else if(n<=200){
            bill = (100*10) + (n-100)*15;
        }
        else if(n<=300){
            bill = (100*10) + (100*15) + (n-200)*20;
        }
        else{
            bill = (100*10) + (100*15) + (100*20) + (n-300)*25;
        }
        System.out.println("Bill is "+ bill);
        sc.close();
    }
}
