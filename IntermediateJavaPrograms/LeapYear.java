package IntermediateJavaPrograms;

import java.util.*;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int n = sc.nextInt();
        if((n%400==0) || (n%4==0 && n%100!=0)){
            System.out.println("Entered year is Leap Year");
        }
        else{
            System.out.println("Entered year is not a Leap Year");
        }
        sc.close();
    }
}
