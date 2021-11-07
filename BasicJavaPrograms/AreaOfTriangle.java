package BasicJavaPrograms;

import java.util.*;

public class AreaOfTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle: ");
        int a = sc.nextInt();       //side1
        int b = sc.nextInt();       //side2
        int c = sc.nextInt();       //side3
        double s = (a+b+c)/2;       //semi-perimeter
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));  //heron's formula
        System.out.println("The Area of triangle is "+ area);
        sc.close();
    }
}
