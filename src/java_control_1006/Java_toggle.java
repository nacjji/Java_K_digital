package java_control_1006;

public class Java_toggle {
    public static void main(String[] args) {
        //10까지의 수를 홀수와 짝수를 번갈아가며 출력
//        for (int i=1; i<10+1; i++){
//            int mod = i%2;
//            switch (mod){
//                case 0:
//                    System.out.println(i +" : 짝수");
//                    break;
//                case 1:
//                    System.out.println(i +" : 홀수");
//                    break;
//            }
//        }

        // 간결한 2가지 상황 제어
        boolean flag = false;
        for (int i=1;i<10;i++){
            flag = !flag;
            if (flag){
                System.out.println(i+1 +"짝수");
            }else {
                System.out.println(i+1+ "홀수");
            }
        }
    }
}
