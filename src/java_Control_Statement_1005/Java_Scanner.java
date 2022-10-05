package java_Control_Statement_1005;

import java.util.Scanner;
import java.io.BufferedReader;

public class Java_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name? : ");
        try{
            String name = sc.nextLine();
            Thread.sleep(1000);
            System.out.println("Hi," + name);
            Thread.sleep(1000);
            System.out.print("How old are you? : ");
            Thread.sleep(1000);
            int your_age = sc.nextInt();
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("Oh, you are old. bye.");
            sc.close();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
