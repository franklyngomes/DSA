import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FunctionPractice {
//    Enter 3 numbers from the user & make a function to print their average.
    public static int CalculateAverage(int a, int b, int c){
        int avg = (a + b + c) / 3;
        return avg;
    }
//    Write a function to print the sum of all odd numbers from 1 to n.
    public static int SumOfOdd(int a){
        int sum = 0;
        for(int i = 1; i <= a; i ++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return  sum;
    }
//    Write a function which takes in 2 numbers and returns the greater of those two.
    public static int FindGreatest(int a, int b){
       int maxNum = Math.max(a,b);
       return maxNum;
    }
//    Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double Circumference(int a){
        double circum = 2 * Math.PI * a;
        return circum;
    }
    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static String CheckEligibleCandidate(int a){
        if(a > 18){
            return "Eligible to vote";
        }else{
            return "Not eligible to vote!";
        }
    }
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    public static int[] CountNum(List<Integer> a){
        int positive = 0, negative = 0, zero = 0;
        for(int num : a){
            if(num > 0) positive ++;
            else if(num < negative) negative ++;
            else zero ++;
        }
        return new int[]{positive, negative, zero};
    }
    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static double CalculateExponent(int a, int b){
        double power = Math.pow(a, b);
        return power;
    }
    public static int CalculateGCD(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
//    Write a program to print Fibonacci series of n terms where n is input by user :
//            0 1 1 2 3 5 8 13 21 .....
//    In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    public static int[] FindFibonacciSeries(int a){
        if (a <= 0) {
            return new int[0];
        }
        int[] arr = new int[a];
        if(a >= 1){
            arr[0] = 0;
        }
        if(a >= 2){
            arr[1] = 1;
        }
        for (int i = 2; i < a; i ++){
            arr[i] = arr[i - 1] + arr[i -2];
        }
        return arr;
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("Average: " + CalculateAverage(a, b, c));
//        System.out.println("Sum of odds: " + SumOfOdd(a));
//        System.out.println("Greatest: " + FindGreatest(a,b));
//        System.out.println("Circumference of the circle: " + Circumference(a));
//        System.out.println(CheckEligibleCandidate(a));

//        char choice;
//        List<Integer> list = new ArrayList<>();
//        do{
//            System.out.println("Enter a number: ");
//            list.add(sc.nextInt());
//            System.out.println("Do you want to enter another number? (y/n: ");
//            choice = sc.next().charAt(0);
//        }while( choice == 'y' || choice == 'Y');
//        int[] result = CountNum(list);
//        System.out.println("Positive: " + result[0]);
//        System.out.println("Negative: " + result[1]);
//        System.out.println("Zero: " + result[2]);
//        System.out.println(CalculateExponent(a, b));
//        System.out.println(CalculateGCD(a, b));
        int[] fibSeries = FindFibonacciSeries(a);
        System.out.println(Arrays.toString(fibSeries));


    }
}
