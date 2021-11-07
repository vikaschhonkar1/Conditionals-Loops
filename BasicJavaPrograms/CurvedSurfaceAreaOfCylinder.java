package BasicJavaPrograms;

import java.util.*;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int r = sc.nextInt();
        System.out.println("Enter height: ");
        int h = sc.nextInt();
        double pi = Math.PI;
        double csa = 2*pi*r*h;
        System.out.println("Curved Surface Area of Cylinder is "+csa);
        sc.close();
    }
}
