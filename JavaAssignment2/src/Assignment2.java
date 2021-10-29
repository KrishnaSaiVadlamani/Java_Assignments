import java.util.*;
public class Assignment2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string");

        String string = scanner.nextLine();

        containsAtoZ(string);
    }

    //Method to check if string contains all alphabets
    public static void containsAtoZ(String string){
        Set<Character> charArray = new HashSet<>();
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z')
                charArray.add(string.charAt(i));
        }
        if(charArray.size()==26){
            System.out.println(string+ " contains all alphabets from a-z");
        }
        else {
            System.out.println(string + " doesn't contain all alphabets from a-z");
        }

    }


}

//time complexity = O(n)