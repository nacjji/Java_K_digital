package java_Operator_1004;

public class java_pattern {
    public static void main(String[] args) {
        int idx = 0;
        while(true){
            switch(idx%3){
                case 0:
                    System.out.println("Red");
                    break;
                case 1:
                    System.out.println("Blue");
                    break;
                case 2:
                    System.out.println("Yellow");
                    break;
            }
            try {
                Thread.sleep(500);
            }catch (Exception e){}

            idx++;
            System.out.println(idx);
        }

    }
}
