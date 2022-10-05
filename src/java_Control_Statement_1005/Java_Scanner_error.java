package java_Control_Statement_1005;

import java.util.Scanner;

public class Java_Scanner_error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("age : ");
        int age = sc.nextInt();
        //정수를 먼저 입력받으면 버퍼에 남아있는 Enter 가 입력받아지기 때문에
        sc.nextLine();

        System.out.print("name : ");
        String name = sc.nextLine();
        //기존 버퍼의 내용 비우기 위해 nextLine을 해줘야 함
    }
}
