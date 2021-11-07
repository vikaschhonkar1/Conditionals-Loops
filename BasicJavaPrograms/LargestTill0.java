package BasicJavaPrograms;

import java.util.*;

public class LargestTill0 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(true){
            int val = sc.nextInt();
            if(val==0){
                break;
            }
            max = Math.max(max, val);
        }
        System.out.println(max);
        sc.close();
    }
}
