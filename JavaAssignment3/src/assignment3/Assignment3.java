package assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;
public class Assignment3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        String ipAddress =scanner.nextLine();
        pingMethod("ping " + ipAddress);


    }
    public static void pingMethod(String command) {

        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String string = "";
            while ((string = inputStream.readLine()) != null) {
                System.out.println(string);
                //break;

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}