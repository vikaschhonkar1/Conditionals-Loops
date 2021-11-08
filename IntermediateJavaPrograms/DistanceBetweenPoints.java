package IntermediateJavaPrograms;

import java.util.*;

public class DistanceBetweenPoints {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of first point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter coordinates of second point: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance Between points is "+ distance);
        sc.close();
    }
}
