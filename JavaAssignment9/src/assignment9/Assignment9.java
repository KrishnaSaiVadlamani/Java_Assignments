package assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String string = scanner.nextLine();
        Check(string);
    }
        public static void Check(String string){
        Boolean matches= Pattern.matches("^[A-z].*[.]",string);
        if(matches){
            System.out.println("It is Matching the criteria");
        }else{
            System.out.println("It is Not Matching");
        }
    }
}
