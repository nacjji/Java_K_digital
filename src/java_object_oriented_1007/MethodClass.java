package java_object_oriented_1007;

public class MethodClass {
    public void helloJava_3() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello Java");
        }
    }

    //매개변수가 있는 메서드
    // n 번만큼 반복할 수 있게 만들 수 있음
    public void printDisp(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void disp(String str, int n){
        for (int i=0;i<n; i++){
            System.out.print(str);
        }
    }

    //boolean 1개를 받아서 수행하는 메서드
    // b 가 false 면 작업을 수행하지 않고 종료
    public void returnMethod(boolean b){
        if (b == false){
            return;
        }
        System.out.println("수행");
    }

    //2개의 정수를 더하고, 리턴하지 않고 출력하는 메서드
    public void noReturn(int a, int b){

        int result = a+b;
        System.out.println(result);
    }

    public int hasRetrun(int a, int b){
        int result =a+b;
        return result;
        //메서드가 데이터를 가지고 리턴할 때는
        //리턴하는 데이터의 자료형을 메서드 이름 앞에 기재해야 함
    }


}
