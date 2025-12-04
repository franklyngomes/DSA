public class Patterns {
    public static void main(String[] args) {
//        ****
//        ****
//        ****
//        ****
//        for(int i = 0; i < 4; i ++ ){
//            for (int j = 0 ; j < 5; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        *****
//        *   *
//        *   *
//        *****
//        for(int i = 1; i <=4; i ++){
//            for(int j = 1; j <= 5; j ++){
//                if(i == 1 || j == 1 || i == 4 || j == 5){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        *
//        **
//        ***
//        ****
//        for(int i = 1; i <= 4; i ++){
//            for(int j = 1; j <= i ; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        ****
//        ***
//        **
//        *
//        for(int i = 4; i >= 1; i --){
//            for(int j = 1; j <= i ; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//         *
//        **
//       ***
//      ****
//        for(int i = 1; i <=4; i ++){
////            Spaces
//            for(int j = 1; j <= 4-i; j ++){
//                System.out.print(" ");
//            }
////            Stars
//            for(int j = 1; j <= i; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        1
//        12
//        123
//        1234
//        12345
//        for(int i = 1; i <= 5; i ++){
//            for(int j = 1; j <= i ; j ++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        12345
//        1234
//        123
//        12
//        1
//        for(int i = 5; i >= 1; i --){
//            for(int j = 1; j <= i ; j ++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15
//        int number = 1;
//        for(int i = 1; i <= 5; i ++){
//            for (int j = 1; j <= i; j ++){
//                System.out.print(number + " ");
//                number ++;
//            }
//            System.out.println();
//        }
//        1
//        01
//        101
//        0101
//        10101
//        for(int i = 1; i <= 5; i ++){
//            for(int j = 1; j <=i; j ++){
//                int sum = i + j;
//                if(sum % 2 == 0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//        *****
//       *****
//      *****
//     *****
//    *****
//        for(int i = 5; i >=1 ; i --){
//            for(int j = 1; j <= i; j ++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= 5; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        1
//        22
//       333
//      44444
//     555555
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//        1
//       212
//      32123
//     4321234
//    5432122345
//        for(int i = 1; i <= 5; i ++){
//            for(int j = 1; j <= 5 - i; j ++){
//                System.out.print(" ");
//            }
//            for(int j = i; j >= 1; j --){
//                System.out.print(j);
//            }
//            for(int j = 2; j <= i; j ++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        *      *
//        **    **
//        ***  ***
//        ********
//        ********
//        ***  ***
//        **    **
//        *      *
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j <= 2 * (4 - i); j++) {
//                System.out.print(" " + " ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 4; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j <= 2 * (4 - i); j++) {
//                System.out.print(" " + " ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

//        *
//       ***
//      *****
//     *******
//     *******
//      *****
//       ***
//        *
        for(int i = 1; i <= 4; i ++){
            for(int j = 3; j >= i; j --){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            for(int j = 2; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i --){
            for(int j = 3; j >= i; j --){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            for(int j = 2; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
