package java_Control_Statement_1005;

public class Java_break {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            System.out.println(i);
            if(i % 3==0){
                System.out.println("break");
                break;
            }
        }
    }
}
