package BasicJavaPrograms;

import java.util.*;

public class PerimeterOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Side: ");
        int a = sc.nextInt();
        int perimeter = 4*a;
        System.out.println("The Perimetr of Square is: "+ perimeter);
        sc.close();
    }
}
