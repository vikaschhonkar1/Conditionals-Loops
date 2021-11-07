package BasicJavaPrograms;

import java.util.*;

public class VolumeOfPrism {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base area of prism: ");
        int b = sc.nextInt();
        System.out.println("Enter height of prism: ");
        int h = sc.nextInt();
        int volume = b*h;
        System.out.println("Volume of prism is "+volume);
        sc.close();
    }
}
