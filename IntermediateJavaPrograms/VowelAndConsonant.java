package IntermediateJavaPrograms;

import java.util.*;

public class VowelAndConsonant {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        String str = sc.next();
        if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u") || str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")){
            System.out.println("Entered Character is a Vowel");
        }
        else{
            System.out.println("Enteres Character is a Consonant");
        }
        sc.close();
    }
}
