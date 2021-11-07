package BasicJavaPrograms;

import java.util.*;

public class VolumeOfSphere {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int r = sc.nextInt();
        double pi = Math.PI;
        double volume = (4*pi*r*r*r)/3;
        System.out.println("The Volume of Sphere is "+ volume);
        sc.close();
    }
}
