package BasicJavaPrograms;

import java.util.*;

public class AreaOfRhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of diagonals: ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        double area = (d1*d2)/2.0;
        System.out.println("The area of Rhombus is: "+ area);
        sc.close(); 
    }
}
