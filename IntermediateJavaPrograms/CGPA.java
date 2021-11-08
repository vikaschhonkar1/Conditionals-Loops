package IntermediateJavaPrograms;

import java.util.*;

public class CGPA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Subjects: ");
        int n = sc.nextInt();

        double marks[] = new double[n];
        System.out.println("Enter Marks In Subjects: ");
        for(int i=0; i<n; i++){
            marks[i] = sc.nextDouble();
        }

        int sum = 0;
        double grade[] = new double[n];
        for(int i=0; i<n; i++){
            grade[i] = marks[i]/10;
            sum+=grade[i];
        }

        double cgpa = sum/n;
        System.out.println("The CGPA is "+ cgpa);
        sc.close();

    }
}
