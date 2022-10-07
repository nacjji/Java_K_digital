package java_object_oriented_1007;


import java.util.Locale;
import java.util.Random;

public class Main2 {
    //static 변수 System.currentTimeMillis()
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        System.out.println(now);


        //random 함수 사용 0.0~1.0사이의 난수 생성
        double randDouble = Math.random();
        System.out.println(randDouble);


        //3.4 와 2.7 중 작은 숫자 찾아 출력
        double min_double = Math.min(3.4,2.7);
        System.out.println(min_double);

        String str = "Hamburger";
        //문자열을 대문자로 변경
        String upper_str =  str.toUpperCase(Locale.ROOT);
        System.out.println(upper_str);

        //문자열을 소문자로 변경
        String lower_str = str.toLowerCase();
        System.out.println(lower_str);

        //문자열의 길이
        int str_length = str.length();
        System.out.println(str_length);

        // 문자열 내 인스턴스의 위치를 반환
        int str_indexOf = str.indexOf('a');
        System.out.println(str_indexOf);

        if (str.indexOf("m") == -1){
            System.out.println("없음");
        }else {
            System.out.println(str_indexOf+1+"번째에 있네요");
        }


    }
}


