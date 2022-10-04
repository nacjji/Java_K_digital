package java_Operator_1004;

public class java_ArithmeticOperator {
    public static void main(String[] args) {
        int x = 9;
        int y = 4;
        System.out.println(x+y);
        //정수 나누기 정수는 정수
        System.out.println(x/y);

        byte b1 = 100;
        byte b2 = 40;
        // error /연산자는 정수보다 작은 자료형의 연산일 경우 정수로 변환 후 처리하기 때문에
        // 아래의 연산은 에러다.
        //byte result = b1/b2;
        // 연산한 정수를 byte로 변환해서 출력
        //byte result = (byte) (b1/b2);

        // 더 나은 코드
        int result = (b1+b2);
        System.out.println(result);

        // 정수/정수 시 소수까지 출력하는 법
        // x/y = 소수까지 나오도록
        double d = (double)x/y;
        System.out.println(d);

        System.out.println();
        //위 결과를 소수 첫째자리에서 반올림 하기

        int t = (int)((double)x/y +0.5);
        System.out.println(t);

        System.out.println();
        //10의 자리에서 반올림 --> 32800
        int money = 32770;

        // 1번풀이
        int ten_money = (money/10+5); // 3277 + 5
        System.out.println(ten_money/10*100); //3282 / 10 = 328 * 100 --> 32800

        // 2번풀이
        System.out.println((int)(money/100.0+0.5)*100);


    }
}
