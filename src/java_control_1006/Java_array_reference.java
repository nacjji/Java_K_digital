package java_control_1006;

public class Java_array_reference {
    public static void main(String[] args) {
        String[] subjects ={
          "Java","Database",
                "Web FrontEnd","Spring Framework"
                ,"Nodejs","React","React-native",
                "블록체인 기반기술","스마트 컨트랙트",
                "DApp"
        };
        String [] copy = subjects; // 배열이 참조하고 있는 곳을 copy 도 참조하도록 한것
                                    //데이터를 복사한게 아닌 참조를 복사한거임
        System.out.println(subjects[0]);
        copy[0] = "자바";
        //copy를 이용해서 바꾼 데이터를 수정하면 subjects 데이터도 수정됨
        // 참조복사 지양
        System.out.println(subjects[0]);
    }
}
