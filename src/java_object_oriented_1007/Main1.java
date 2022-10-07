package java_object_oriented_1007;

public class Main1 {

    public static void main(String[] args) {

        //Hello Java 를 3번 출력하는 작업 자주수행
        //static 이 없는 메서드를 호출할 땐
        // instance 를 생성한 후
        MethodClass methodClass = new MethodClass();
        /*

        // instance 를 이용해서 호출
        methodClass.helloJava_3();
        //MethodClass.helloJava_3();
        //System.out.println();

        methodClass.printDisp(2);
        System.out.println();


        //매개변수 활용한 메서드
        for (int i=0;i<10;i++){
            methodClass.printDisp(i);
            System.out.println();
            //매개변수 선언한 순서대로 작성
            methodClass.disp("*",i);
        }
*/
        methodClass.returnMethod(false);

        methodClass.noReturn(1,2);
        // 3개의 항의 덧셈을 하고 싶을 땐
//        methodClass.hasRetrun(10,20); // return 이 있는 메서드에선 아무 일도 안함

        int r = methodClass.hasRetrun(10,20);  // return 이 있는 메서드는 값을 반환하기 때문에 추가 연산이나 활용이 가능함
        r= methodClass.hasRetrun(r,30);
        System.out.println(r);
    }

}
