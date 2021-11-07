package BasicJavaPrograms;

import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double pi = Math.PI;
        double area = pi*radius*radius;
        System.out.println("The area of circle is "+area);
        sc.close();
    }
}
