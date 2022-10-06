package java_control_1006;

public class Java_Input_Star {
    public static void main(String[] args) {
        /*
         * 5개씩 줄 출력
           주어진 명령어 System.out.print("*")
           System.out.println()
         */

        //내반복문에서 * 5개 찍고
        //외반복문에서 내반복문을 5번 반복
//        for(int j=0;j<5;j++){
//            for(int i=0; i<5; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println();

//        // 1,2,3,4,5 순서로 출력
//        for (int pyr = 0; pyr < 5; pyr++) {
//            for (int star = 0; star < pyr + 1; star += 1) {
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}

        // 5,4,3,2,1 형태로 출력
//        for (int pyr = 0; pyr < 5; pyr++) {
//            for (int star = 0; star < 5-1 * pyr; star += 1) {
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }

        //9,7,5,3,1 형태로 출력
//        for (int pyr=0;pyr<5;pyr++){
//            for (int star=0;star<9-2*pyr; star++){
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//

        // 1,2,3,2,1 형태로 출력
        /*
        *
        * *
        * * *
        * *
        *

        */


//        for (int i=0; i<8;i++){
//            if (i<5){
//                for (int j=0; j<i+1;j++){
//                    System.out.print("*");
//                    System.out.print(" ");
//                }
//            }else{
//                for (int j=0; j<-1*i+8;j++){
//                    System.out.print("*");
//                    System.out.print(" ");
//                }
//            }System.out.println();
//        }

        /*
          *
         ***
        *****
         ***
          *
         */

    }

}
