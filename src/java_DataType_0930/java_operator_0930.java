package java_DataType_0930;

public class java_operator_0930 {
    public static void main(String[] args) {
        int a = 10;
        // 틸드 ~ , 1의 보수 구하는 연산자
        System.out.println(~a);
        //양수 --> 음수 + abs+1
        System.out.println(~-a);
        //음수 --> 양수 - abs+1
        System.out.println();
        System.out.println();
        //증감연산자
        //2씩 증감하는 코드(홀수)
        System.out.println("홀수");
        for(int i = 0; i<11; i++){
            System.out.println(++i);
        }
        System.out.println();
        //2씩 증감하는 코드(짝수)
        System.out.println("짝수");
        for(int i = 2; i<11; i++){
            System.out.println(i++);
        }
    }
}
