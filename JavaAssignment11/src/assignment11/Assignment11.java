package assignment11;

import java.io.*;
import java.util.*;

public class Assignment11 {
    public static void main(String args[]) throws Exception {
        Map<Character,Integer> occurences=new HashMap<>();
        FileReader fileReader;
        fileReader = new FileReader("src/assignment11/input");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String str=bufferedReader.readLine();
        while(str!=null){
            for(char c : str.toCharArray()){
                occurences.put(c,occurences.getOrDefault(c,0)+1);
            }
            str=bufferedReader.readLine();
        }
        System.out.println(occurences);
        FileWriter fileWriter=new FileWriter("src/assignment11/output");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.append(occurences.toString());
        bufferedWriter.close();
        fileWriter.close();
    }
}
