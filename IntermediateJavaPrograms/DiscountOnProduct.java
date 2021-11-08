package IntermediateJavaPrograms;

import java.util.*;

public class DiscountOnProduct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marked Price: ");
        int markedPrice = sc.nextInt();
        System.out.println("Enter Selling Price: ");
        int sellingPrice = sc.nextInt();
        int discount = markedPrice - sellingPrice;
        System.out.println("Discount offered is "+discount);
        sc.close();
    }
}
