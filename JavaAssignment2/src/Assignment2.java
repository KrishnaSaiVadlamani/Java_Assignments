import java.util.*;
public class Assignment2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");

        String str = sc.nextLine();

        containsAtoZ(str);
    }

    //Method to check if string contains all alphabets
    public static void containsAtoZ(String str){
        Set<Character> charArray = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                charArray.add(str.charAt(i));
        }
        if(charArray.size()==26){
            System.out.println(str+ " contains all alphabets from a-z");
        }
        else {
            System.out.println(str + " doesn't contain all alphabets from a-z");
        }

    }


}

//time complexity = O(n)