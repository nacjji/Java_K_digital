package java_Control_Statement_1005;

public class Java_do_While {
    public static void main(String[] args) {
    // 10 -> 8 -> 6 -> -> 4 -> 2 -> 0
        int idx = 0;
        do{
            System.out.println(-2*idx+10);
            idx ++;
        }while(idx < 6);
        }
}
