package BasicJavaPrograms;

import java.util.*;

public class PerimeterOfEquilateralTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sise of Equilateral Triangle: ");
        int a = sc.nextInt();
        int perimeter = 3*a;
        System.out.println("The perimeter of triangle is: "+ perimeter);
        sc.close();
    }
}
