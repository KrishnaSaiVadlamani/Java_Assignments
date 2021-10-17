package assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s=sc.nextLine();
        Boolean matches= Pattern.matches("^[A-z].*[.]",s);
        if(matches){
            System.out.println("It is Matching the criteria");
        }else{
            System.out.println("It is Not Matching");
        }
    }
}
