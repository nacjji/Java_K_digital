package java_control_1006;

import java.util.Scanner;

public class Java_equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("id:");
        String id = sc.nextLine();
        if (id.equals("nacjji")){
            System.out.println("login successed");
        }else{
            System.out.println("Failed");
        }
    }
}
