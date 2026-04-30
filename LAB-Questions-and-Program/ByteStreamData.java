// Write a program using ByteStream where we will take input from user and saved into the text file until While(input != “stop”)
import java.io.*;
import java.util.Scanner;

public class ByteStreamData {
    public static void main(String[] args) {
        String data = "";
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            do {
                System.out.println("Enter The Text");
                data = sc.nextLine();
                fos.write((data + " \n").getBytes());
            } while (!data.equals("stop"));
        } catch (IOException e) {
            System.out.println("Error " + e);
        } 

    }

}