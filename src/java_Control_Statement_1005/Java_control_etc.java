package java_Control_Statement_1005;

public class Java_control_etc {
    public static void main(String[] args) {
        //제어문의 실행문이 한 문장이면 {} 생략

        int score =90;
        if(score >= 60)
            System.out.println("합격");
        else
            System.out.println("불합격");

        //break 레이블
        escape : for (int i=0;i<3;i++){
            System.out.println("외부 반복문 시작");
            for (int j=0;j<3;j++){
                System.out.println("내부 반복문");
                break escape;
            }
            System.out.println("외부 반복문 종료");
        }
    }
}
