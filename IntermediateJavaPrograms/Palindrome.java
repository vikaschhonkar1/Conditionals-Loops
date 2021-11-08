package IntermediateJavaPrograms;

import java.util.*;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str = sc.next();
        char arr[] = str.toCharArray();
        boolean flag = true;
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            if(arr[i]!=arr[n-i-1]){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Entered Number is Palindrome.");
        }
        else{
            System.out.println("Entered number is not a Palindrome.");
        }
        sc.close();
    }
}
