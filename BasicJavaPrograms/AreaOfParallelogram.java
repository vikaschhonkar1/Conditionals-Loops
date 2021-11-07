package BasicJavaPrograms;

import java.util.*;

public class AreaOfParallelogram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of Parallelogram: ");
        int b = sc.nextInt();
        System.out.println("Enter altitude of Parallelogram: ");
        int h = sc.nextInt();
        int area = b*h;
        System.out.println("The area of parallelogram is: "+ area);
        sc.close();
    }
}
