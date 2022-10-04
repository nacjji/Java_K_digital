package java_Operator_1004;


public class java_if_test {
    public static void main(String[] args) {
        int score = 60;
        // 80~100 우수
        // 60~79 보통
        // 0~59 노력

        if(80<=score && score <=100){
            System.out.println("우수");
        }else if(60<=score && score <80){
            System.out.println("보통");
        }else if(0<=score && score < 60){
            System.out.println("노력");
        }else{
            System.out.println("0~100까지의 점수를 입력하세요");
        }

    }
}
