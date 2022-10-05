package java_Control_Statement_1005;

public class Java_final_var {
    public static void main(String[] args) {
        int lunch_menu = 1;
        final int korea_foods = 1;
        final int chinese_foods = 2;
        final int etc = 3;

        switch (lunch_menu) {
            case korea_foods:
                System.out.println("한식");
                break;
            case chinese_foods:
                System.out.println("중식");
                break;
            case etc:
                System.out.println("기타");
                break;
            default:
                System.out.println("잘못된 선택");

        }

    }
}
