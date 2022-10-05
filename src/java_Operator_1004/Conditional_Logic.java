package java_Operator_1004;

public class Conditional_Logic {
    public static void main(String[] args) {
        int year = 2024;
        // 윤년, 4의 배수, 100의 배수x , 400의 배수
        if(year%4==0 && year%100 != 0 || year%400 ==0){
            System.out.println("윤년");
        }else {
            System.out.println("윤년 아님");
        }


        for(int idx = 1; idx <=100; idx++){
            //뒤 연산을 33번 확인
            if(idx%3 ==0 && idx%4 ==0){
                System.out.println(idx);
            }
            //뒤 연산을 25번 확인
            // 이게 연산이 더 빠름
            if(idx%4 ==0 && idx%3 ==0){
                System.out.println(idx);
                //true 일 확률이 높은 걸 앞에 배치해야 뒤 연산을 많이 안함
            }
        }
    }
}
