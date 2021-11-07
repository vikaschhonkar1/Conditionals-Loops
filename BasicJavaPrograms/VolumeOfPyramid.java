package BasicJavaPrograms;

import java.util.*;

public class VolumeOfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base area: ");
        int b = sc.nextInt();
        System.out.println("Enter height: ");
        int h = sc.nextInt();
        int volume = b*h;
        System.out.println("Volume of Pyramid is: "+ volume);
        sc.close();
    }
}
