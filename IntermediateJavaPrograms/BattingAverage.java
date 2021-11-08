package IntermediateJavaPrograms;

import java.util.*;

public class BattingAverage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matches: ");
        int matches = sc.nextInt();
        System.out.println("Enter Total Runs Scored: ");
        int runs = sc.nextInt();
        System.out.println("Enter number of times Not Out: ");
        int notOut = sc.nextInt();
        int out = matches - notOut;
        if(out==0){
            System.out.println("NA");
        }
        else{
            double average = runs/out;
            System.out.println("The Batting Average is: "+average);
        }
        sc.close();
    }
}
