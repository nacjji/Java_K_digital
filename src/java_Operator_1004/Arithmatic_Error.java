package java_Operator_1004;

public class Arithmatic_Error {
    public static void main(String[] args) {
        System.out.println(1.0-0.8);

        // 0이 아니라 0.0으로 나누면 Infinity or NaN
        // 무한정 나눌 수 있는 경우(Infinity)나 숫자가 아님(NaN)
        System.out.println(1/0.0); //Infinity
        System.out.println(8<<2);
        System.out.println(8<<34);
    }
}
