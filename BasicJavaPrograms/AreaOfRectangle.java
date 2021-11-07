package BasicJavaPrograms;

import java.util.*;

public class AreaOfRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("The area of Rectangle is "+ area);
        sc.close();
    }
}
