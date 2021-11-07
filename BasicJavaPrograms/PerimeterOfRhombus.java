package BasicJavaPrograms;

import java.util.*;

public class PerimeterOfRhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side: ");
        int a = sc.nextInt();
        int perimeter = 4*a;
        System.out.println("The Perimeter of Rhombus is "+ perimeter);
        sc.close();
    }
}
