package java_DataType_0930;

public class java_var_0930 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        //따라서 x와 y의 HashCode 는 같다.
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        //primitive type 이 아님
        System.out.println(x);
        //int x =30;
        //같은블록 내 두 번의 변수를 선언해서 Error
        //System.out.println(y);
        //선언되지 않은 변수를 사용하면 Error

        //문자열 class
        String my_name = "나지원";
        int my_age =  28;
        double my_height = 181.0;

        System.out.println("이름 : " + my_name);
        System.out.println("나이 : " + my_age);
        System.out.println("키 : " + my_height +"cm");
    }
}
