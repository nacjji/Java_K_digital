package java_Operator_1004;

public class java_if_login {
    public static void main(String[] args) {
        String id = "nacjji";
        String pw = "1234";
        if(id == "nacjji" && pw =="1234"){
            System.out.println("로그인 성공");
        }else if(id == "nacjji"){
            System.out.println("비밀번호 불일치");
        }else{
            System.out.println("없는 아이디");
        }
    }
}
