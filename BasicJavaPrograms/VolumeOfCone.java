package BasicJavaPrograms;

import java.util.*;

public class VolumeOfCone {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        double pi = Math.PI;
        double volume = (pi*r*r*h)/3;
        System.out.println("Volume of Cone is "+ volume);
        sc.close();
    }
}
