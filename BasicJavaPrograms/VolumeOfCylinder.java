package BasicJavaPrograms;

import java.util.*;

public class VolumeOfCylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        int h = sc.nextInt();
        System.out.println("Enter radius: ");
        int r = sc.nextInt();
        double pi = Math.PI;
        double volume = pi*r*r*h;
        System.out.println("Volume of Cylinder is "+volume);
        sc.close();
    }
}
