package BasicJavaPrograms;

import java.util.*;

public class PerimeterOfRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rectangle: ");
        int b = sc.nextInt();
        int perimeter = 2*(l+b);
        System.out.println("The perimeter of Rectangle is: "+ perimeter);
        sc.close();
    }    
}
