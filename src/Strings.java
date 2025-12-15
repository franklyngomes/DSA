import java.util.Scanner;

public class Strings {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String name2 = sc.nextLine();
//        System.out.println("Your name is: "+ name);
//        System.out.println(name.length());
//        System.out.println(name.charAt(2));
        //compare
//        System.out.println(name.compareTo(name2));
        String sentence = "My name is TONY";
        String newName = sentence.substring(11, sentence.length());
        System.out.println(newName);

    }
}
