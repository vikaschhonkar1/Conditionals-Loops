package BasicJavaPrograms;

import java.util.*;

public class PerimeterOfParallelogram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of adjacent sides of parallelogram: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int perimeter = 2*(a+b);
        System.out.println("The perimeter of parallelogram is: "+ perimeter);
        sc.close();
    }
}
