import java.util.Scanner;

public class Arrays {
    public static void main (String[] args){
//        int marks[] = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 99;
//
//        int marks[] = {97,98,99};
//        for(int i = 0; i < 3; i ++){
//            System.out.println(marks[i]);
//        }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //Null value initialization
//        for int = 0
//        for float = 0.0
//        for string = ""
//        for boolean = false
        //Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        //Output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
        //Take an array as input from the user. Search for a given number x and print the index at which it occurs
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i ++){
            if(numbers[i] == x){
                System.out.println("Item found at index: " + i);
            }
        }
    }
}
