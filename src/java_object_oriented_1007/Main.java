package java_object_oriented_1007;

public class Main {
    public static void main(String[] args) {
        //User class 의 인스턴스 만들기
        User user1 = new User();
        user1.id = "nacjji";
        user1.account_number = "110408923748";
        user1.balance = 4000000;

        User user2 = new User();
        user2.id = "nacjji1";
        user2.account_number = "74890200039599";
        user2.balance = 200000000;
        System.out.println(user2.balance);


        //network 는 static 속성이라 공유함

        User.network = "bitcoin";
        //가장 최근 바꾼 데이터가 유효함
        user1.network = "etherium";
        System.out.println(User.network);
        System.out.println(user1.network);
        System.out.println(user2.network);

        //지역변수 : 메서드 안에서 만든 변수
        // 자동초기화가 안되므로 데이터를 대입하지 않고 사용하는 것은 에러
//        int x;
//        System.out.println(x);

        User user3 = new User();
        // static 초기화, 기본값 출력
        System.out.println(user3.id);
        System.out.println(user3.balance);
    }
}
