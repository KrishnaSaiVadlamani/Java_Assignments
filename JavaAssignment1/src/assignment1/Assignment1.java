package assignment1;

import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter Regular Expression: ");
            String regularExp = sc.nextLine();
            Assignment1 assignment = new Assignment1();
            assignment.fileSearch("/home/krisv", regularExp);
        }



    }
    public void fileSearch(String filePath,String regularExpression) throws  NullPointerException{
        File directory=new File(filePath);
        File[] files=directory.listFiles();

        if(files!= null){
            for(File f:files){

                if(f.isDirectory()){
                    fileSearch(f.getAbsolutePath(),regularExpression);
                }

                else if(f.getName().matches(regularExpression)){
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}