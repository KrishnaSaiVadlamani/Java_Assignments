package assignment11;

import java.io.*;
import java.util.*;

public class Assignment11 {
    public static void main(String args[]) throws Exception {

        FileReader fileReader;
        fileReader = new FileReader("src/assignment11/input");
        BufferedReader bufferedReader = new BufferedReader(fileReader); //It is used to read text in character input stream.
        String string = bufferedReader.readLine();
        System.out.println(string);
        countOccurences(string);
    }
        public static void countOccurences(String string) throws Exception{
            Map<Character, Integer> occurences = new HashMap<>();
                for(char char1 : string.toCharArray()){
                occurences.put(char1,occurences.getOrDefault(char1,0)+1);
            }

        System.out.println(occurences);
        FileWriter fileWriter=new FileWriter("src/assignment11/output");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.append(occurences.toString());
        bufferedWriter.close();
        fileWriter.close();
    }
}
