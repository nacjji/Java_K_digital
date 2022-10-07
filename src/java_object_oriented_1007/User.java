package java_object_oriented_1007;

public class User {
        //user의 아이디, 계좌번호, 잔액을 각각(static을 붙이면 공유가 되니 사용하면 안됨)의
        // 유저가 소유하도록 선언
        // 인스턴스 속성으로 생성

        //Static 속성
        public static String network;


        public String id;
        public String account_number;
        public int balance;

        //static 초기화
        // 스플래시 스크린 등에 사용
        // 생성자를 이용해서 작업하는 것이 일반적임

        static {
                System.out.println("static 처음에 한 번 수행");
        }
        {
                System.out.println("static 인스턴스 생성할 때마다(new를 만날때마다) 수행");
        }
        // 값을 변경할 수 없는 읽기 전용 속성 생성
        // 실제 프로그램에서는 옵션을 설정하거나 보여주기 위한 변수로 사용

        public final String CONTRACTNAME ="Etherium";


}
