package BasicJavaPrograms;

import java.util.*;

public class AreaOfEquilateralTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side: ");
        int a = sc.nextInt();
        double area = (Math.sqrt(3.0)*a*a)/4;
        System.out.println("The area of Triangle is: "+ area);
        sc.close();
    }
}
