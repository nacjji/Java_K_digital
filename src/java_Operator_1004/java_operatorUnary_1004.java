package java_Operator_1004;

public class java_operatorUnary_1004 {
    public static void main(String[] args) {
        //정수를 저장하는 변수 생성
        int intNum = 1;
        System.out.println(intNum);

        System.out.println();
        //intNum을 1증가
        intNum++;
        //1 증가된 intNum
        System.out.println(intNum);
        //2 프린트 후 1증가시킨 것이기 때문에 출력은 2가 나오나, 다음 줄 부터는 3이 출력됨
        System.out.println(intNum++);
        System.out.println(intNum);

        //위에서 증가된 intNum에서 다시 1 증가 후 출력(4)
        System.out.println(++intNum);
    }
}
