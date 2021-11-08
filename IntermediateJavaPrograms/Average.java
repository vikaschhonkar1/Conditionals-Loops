package IntermediateJavaPrograms;

import java.util.*;

public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Enter values: ");
        int sum = 0;
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            sum+=temp;
        }
        double average = sum/n;
        System.out.println(average);
        sc.close();
    }
}
