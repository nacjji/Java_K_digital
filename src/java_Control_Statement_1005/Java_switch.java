package java_Control_Statement_1005;

public class Java_switch {
    public static void main(String[] args) {
        // menu 가 1번이면 한식, 2번이면 중식, 3번이면 기타
        int lunch_menu = 1;
        switch (lunch_menu){
            case 1:
                System.out.println("한식");
                break;
            case 2:
                System.out.println("중식");
                break;
            case 3:
                System.out.println("기타");
                break;
            default:
                System.out.println("잘못된 번호");

        }
    }
}
