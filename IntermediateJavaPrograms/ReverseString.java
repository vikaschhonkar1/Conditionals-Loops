package IntermediateJavaPrograms;

import java.util.*;

public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        int n = str.length();
        char arr[] = str.toCharArray();
        for(int i=0; i<n/2; i++){
            char ch = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = ch;
        }
        System.out.println("Reversed String: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
