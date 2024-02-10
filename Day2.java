import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Hi, " + name + "\nI came to know that you are " + age + " years old. Take a good care of yourself.\nHave a nice day!");
    }
}
