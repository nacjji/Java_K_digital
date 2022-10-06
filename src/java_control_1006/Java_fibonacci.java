package java_control_1006;

import java.util.Scanner;

public class Java_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 정수 입력받기
        System.out.print("정수 입력 : ");
        int fib = sc.nextInt();
        int fibSum = 2;
        int f1 = 1; //현재 이전
        int f2 = 1; // 현재 이전의 이전
        int n = 3;

        while(n <=fib){
            int f = f1+f2; //현재 항 계산
            fibSum+=f; // 현재 항을 합에 추가

            f2 = f1;
            f1 = f;
            System.out.println(fib+"번까지의 피보나치 수열 : " + f);
            n+=1;
        }

    }


}

// 2,3 이 들어있는 list1 와 빈 list2를 만들고
// sum(list1)--> list2[0] append
// list1[1] --> list2[1] append
// list2[0] = sum(list1)
// list2[1] = list1[1]
// list1[0] = sum(list2)