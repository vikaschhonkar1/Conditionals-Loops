package BasicJavaPrograms;

import java.util.*;

public class PerimeterOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int r = sc.nextInt();
        double pi = Math.PI;
        double perimeter = 2 * pi * r;
        System.out.println("The Perimeter of Circle is: "+ perimeter);
        sc.close();
    }
}
