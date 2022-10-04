package java_Operator_1004;

public class java_Swap {
    public static void main(String[] args) {
        //x와 y의 값을 swap
        int x = 20, y=30;
        // temp 임시 변수 선언
        int temp = x;
        //x 에 y를 담고
        x = y;
        //y 에 x를 담음
        y = temp;
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println();
    }
}
