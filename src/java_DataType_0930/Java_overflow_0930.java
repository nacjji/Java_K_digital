package java_DataType_0930;

public class Java_overflow_0930 {
    public static void main(String[] args) {
        int before_int_number = 20;
        float int_to_float = (float)before_int_number;
        System.out.println(int_to_float);
        double div_result = (double)int_to_float/4.2;
        System.out.println(div_result);
    }
}
