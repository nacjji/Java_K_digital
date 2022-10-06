package java_control_1006;

public class Java_array {
    public static void main(String[] args) {
        //배열 선언, 메모리할당
        //실수 3개 저장할 수 있는 배열
        double [] br = new double[3];

        //지젤 선언과 동시에 초기화, 데이터설정
        String [] foods = {"chicken","pizza","pasta"};
        //배열의 개수 반환
//        System.out.println(foods.length);
//        for (int i=0;i<foods.length;i+=1){
//            System.out.println(foods[i]);
//        }
        //빠른 열거
//        for (임시변수 : 컬렉션)을 이용하면 컬렉션의 모든 데이터를 순차적으로 임시변수에 대입
        for (String fastfoods : foods){
            System.out.println(fastfoods);
        }

    }
}
