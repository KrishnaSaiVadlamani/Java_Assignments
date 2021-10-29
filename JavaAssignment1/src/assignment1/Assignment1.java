package assignment1;

import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Enter Regular Expression: ");
            String regularExp = scanner.nextLine();
            Assignment1 assignment = new Assignment1();
            assignment.fileSearch("/home/krisv", regularExp);
        }



    }
    public void fileSearch(String filePath,String regularExpression) throws  NullPointerException{
        File directory=new File(filePath);
        File[] files=directory.listFiles();

        if(files!= null){
            for(File file:files){

                if(file.isDirectory()){
                    fileSearch(file.getAbsolutePath(),regularExpression);
                }

                else if(file.getName().matches(regularExpression)){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
