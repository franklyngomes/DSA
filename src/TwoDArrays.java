import java.util.Scanner;

public class TwoDArrays {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] TwoDArray = new int[rows][cols];
        //Input

        //rows
        for(int i = 0; i < rows; i ++){
            //cols
            for(int j = 0; j < cols; j ++){
                TwoDArray[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        //Output
        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j ++){
                if(TwoDArray[i][j] == x){
                    System.out.println(i+","+j);
                }
//                System.out.println(TwoDArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}
