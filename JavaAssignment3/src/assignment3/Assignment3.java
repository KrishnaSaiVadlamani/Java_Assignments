package assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;
public class Assignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        String ip =sc.nextLine();
        runSystemCommand("ping " + ip);


    }
    public static void runSystemCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                break;

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}