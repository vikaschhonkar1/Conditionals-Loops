package BasicJavaPrograms;

import java.util.*;

public class SubtractProductAndSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        int sum = 0;
        while(n>0){
            int temp = n%10;
            n/=10;
            sum+=temp;
            product*=temp;
        }
        int ans = product - sum;
        System.out.println(ans);
        sc.close();
    }
}
