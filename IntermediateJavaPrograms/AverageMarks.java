package IntermediateJavaPrograms;

import java.util.*;

public class AverageMarks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Subjects: ");
        int n = sc.nextInt();

        int sum = 0;
        int marks[] = new int[n];
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
            sum+=marks[i];
        }

        double average = sum/n;

        System.out.println("The Average Marks are "+ average);
        sc.close();
    }
}
