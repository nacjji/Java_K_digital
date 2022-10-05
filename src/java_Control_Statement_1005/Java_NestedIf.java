package java_Control_Statement_1005;

import java.util.Scanner;

public class Java_NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input your ID");
		String id = sc.nextLine();
		System.out.println("input your PW");
		String pw = sc.nextLine();
		if(id.equals("nacjji")){
			if (pw.equals("1234")){
				System.out.println("Log in Successed");
			}else{
				System.out.println("Wrong PW");
			}
		}else{
			System.out.println("Wrong ID");
		}
	}
}
