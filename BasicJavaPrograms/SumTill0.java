package BasicJavaPrograms;

import java.util.*;

public class SumTill0 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int val = sc.nextInt();
            if(val==0){
                break;
            }
            sum+=val;
        }
        System.out.println(sum);
        sc.close();
    }
}
