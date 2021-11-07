package BasicJavaPrograms;

import java.util.*;

public class AreaOfIsoscelesTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the common side: ");
        double a = sc.nextDouble();
        System.out.print("Enter the base side: ");
        double b = sc.nextDouble();
        double area = (b*(Math.sqrt(4*a*a-b*b)))/4;
        System.out.println("Area of Triangle is: "+ area);
        sc.close();
    }
}
