package BasicJavaPrograms;

import java.util.*;

public class TotalSurfaceAreaOfCube {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of cube: ");
        int a = sc.nextInt();
        int tsa = 6*a*a;
        System.out.println("Total Surface Area Of Cube is "+ tsa);
        sc.close();
    }
}
