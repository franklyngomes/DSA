public class PatternsPractice {
    public static void main(String[] args) {
//        *****
//        *   *
//        *   *
//        *   *
//        *   *
//        *****
//        int n = 6;
//        for (int i = 1; i <= n; i ++){
//            for(int j = 1; j <=n; j ++){
//                if(i == 1 || j == 1 || i == n || j == n){
//                    System.out.print("*" + " ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        1
//       22
//       333
//      4444
//        int n = 4;
//        for(int i = 1; i <= n; i ++){
//            for (int j = n; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j ++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//        1
//        12
//        123
//        1234
//        int n = 4;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 1; j <= i; j ++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        1234
//        123
//        12
//        1
//        int n = 4;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 1; j <= n - i + 1; j ++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        1
//        23
//        456
//        78910
//        int n = 4;
//        int count = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }
//        1
//        01
//        101
//        0101
//        int n = 4;
//        for(int i = 1; i <= n; i ++){
//            for (int j = 1; j <= i; j ++){
//                if((i + j) % 2 == 0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//        1
//       212
//      32123
//     4321234
//    5432122345
//        int n = 5;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 4; j >= i; j--){
//                System.out.print(" " + " ");
//            }
//            for(int j = i; j >= 1; j --){
//                System.out.print(j + " ");
//            }
//            for(int j = 2; j <= i; j ++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//  ******
//   ******
//    ******
//     ******
//      ******
//       ******
//        int n = 6;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 1; j <= i; j ++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= n; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        *
//       * *
//      * * *
//     * * * *
//      * * *
//       * *
//        *
//        int n = 4;
//        for(int i = 1; i <= n; i ++){
//            for(int j = n; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j ++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        for(int i = 3; i >= 1; i --){
//            for(int j = n; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j ++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        *      *
//        **    **
//        ***  ***
//        ********
//        ***  ***
//        **    **
//        *      *
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" " + " ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println(" ");
//        }
//        for (int i = 3; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" " + " ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println(" ");
//        }
//        ******
//        ******
//        ******
//        ******
//        ******
//        ******
//        int n = 6;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 1; j <= 6; j ++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        *
//        **
//        ***
//        ****
//        int n = 5;
//        for(int i = 1; i <=5; i ++){
//            for(int j = 1; j <= i; j ++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        ****
//        ***
//        **
//        *
//        int n = 5;
//        for(int i = n; i >= 1; i --){
//            for(int j = 1; j <= i ; j ++){
//                System.out.print("*" + " ");
//            }
//            for(int j = 1; j <= i; j ++){
//                System.out.print(" ");
//            }
//        System.out.println();
//        }
//           *
//          **
//         ***
//        ****
//        int n = 5;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 5; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i ; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//         ****
//          ***
//           **
//            *
//        int n = 5;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 1; j <= i ; j ++){
//                System.out.print(" ");
//            }
//            for(int j = n; j >= i; j --){
//                System.out.print("*");
//            }
//        System.out.println();
//        }
//        ****
//        ***
//        **
//        *
//        **
//        ***
//        ****
//        int n = 4;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        *
//       * *
//      * * *
//     * * * *
//        int n = 4;
//        for(int i = 1; i <= n; i ++){
//            for(int j = n; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j ++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        1 2 3 4
//         2 3 4
//          3 4
//           4
//        int n = 4;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 1; j < i; j ++){
//                System.out.print(" ");
//            }
//            for(int j = i; j <= n; j ++){
//                System.out.print(j + " ");
//            }
//
//            System.out.println();
//        }

//        1 2 3 4
//         2 3 4
//          3 4
//           4
//          3 4
//         2 3 4
//        1 2 3 4
//        int n = 4;
//        for(int i = 1; i <= n; i ++){
//            for(int j = 1; j < i; j ++){
//                System.out.print(" ");
//            }
//            for(int j = i; j <= n; j ++){
//                System.out.print(j + " ");
//            }
//
//            System.out.println();
//        }
//        for(int i = 3; i >= 1; i --){
//            for(int j = 1; j < i; j ++){
//                System.out.print(" ");
//            }
//            for(int j = i; j <= n; j ++){
//                System.out.print(j + " ");
//            }
//
//            System.out.println();
//        }
//        *
//       * *
//      *   *
//     *     *
//    * * * * *
//        int n = 5;
//        for(int i = 1; i <= n; i ++){
//            for(int j = n; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= (2*i-1); j ++){
//                if(i == n || j == 1 || j == (2*i-1)){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//           }
//            System.out.println();
//        }
//    * * * * *
//     *     *
//      *   *
//       * *
//        *
//        int n = 5;
//        for(int i = n; i >= 1; i --){
//            for(int j = n; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= (2*i-1); j ++){
//                if(i == n || j == 1 || j == (2*i-1)){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//           }
//            System.out.println();
//        }

//        *
//       * *
//      *   *
//     *     *
//    *       *
//     *     *
//      *   *
//       * *
//        *
//        int n = 5;
//        for(int i = 1; i <= n; i ++){
//            for(int j = n; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= (2 * i - 1); j ++){
//                if(i == 1 || j == 1 || j == ( 2 * i - 1)){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i = n; i >= 1; i --){
//            for(int j = n; j >= i; j --){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= (2 * i - 1); j ++){
//                if(i == 1 || j == 1 || j == ( 2 * i - 1)){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    * * * * *
//     *     *
//      *   *
//       * *
//        *
//        int n = 5;
//        for (int i = n; i >= 1; i--) {
//            for (int j = n; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                if (i == n || j == 1 || j == (2 * i - 1)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                if (i == n || j == 1 || j == (2 * i - 1)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        1
//       1 1
//      1 2 1
//     1 3 3 1
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            int x = 1;
            for(int k = 1; k <= i; k ++){
                System.out.print(x + " ");
                x = x * (i - k)/ k;
            }

            System.out.println();
        }
    }
}
