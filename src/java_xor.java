public class java_xor {
    public static void main(String[] args) {
        int a = 11;
        //정수를 이진수(문자열)로 나타내는 함수 Integer.toBinaryString
        //System.out.println(Integer.toBinaryString(-2));
        int b = 14;
        System.out.println(Integer.toBinaryString(a)); //1011
        System.out.println(Integer.toBinaryString(b)); //1110
        System.out.println(a&b); //1010
        System.out.println(a|b); //1111
        System.out.println(a^b); //0101
    }
}
