package java_control_1006;

public class Java_array_matrix {
    public static void main(String[] args) {
        String [][]foods = {
                {"chicken","pizza","ramen"},
                {"coke","fanta"},
                {"burger","cheese"},
                {"beer","wine"}
        };
        System.out.println(foods[0][2]);
        int [][] colRow = {
                {1,2},
                {3,4},
                {5,6},
                {7,8},
                {9,10},
                {11,12}
        };
        System.out.println(colRow[1][1] +"*"+colRow[0][1] +"="+ colRow[1][1]*colRow[0][1]);

        //전체데이터 접근
        //for (임시변수 : 컬렉션)을 이용하면 컬렉션의 모든 데이터를 순차적으로 임시변수에 대입

        for (int [] imsi : colRow){
            for (int temp : imsi){
                System.out.print(temp + "\t");
            }
            System.out.println();
        }
    }
}
