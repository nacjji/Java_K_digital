package java_Control_Statement_1005;



public class Java_for {
    public static void main(String[] args) {
        for(int idx=2;idx<10;idx++){
            System.out.println(idx+"단");
            for(int jdx=1;jdx<10; jdx++){
                System.out.println(idx+"*"+jdx+"="+idx*jdx);
            }
            System.out.println("============");
        }

        int sum = 0;
//        for(int i=1; i<11;i++){
//            sum+=i;
//            System.out.println(sum);
//        }
        System.out.println();
        int i = 0;
        while (i<10){
            i+=1;
            sum+=i;
            System.out.println(sum);

        }
    }
}
