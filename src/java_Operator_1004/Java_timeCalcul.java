package java_Operator_1004;

public class Java_timeCalcul {
    // 99980초
    public static void main(String[] args) {
        int sec = 99980;
        int hour = sec/3600;
        int min = (sec - (hour*3600))/60;
        int secnd = sec%60;
        System.out.println(hour+"시간" + min+"분" + secnd + "초");
    }
}

