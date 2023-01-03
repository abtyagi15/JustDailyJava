import java.util.Scanner;

public class InputNameOutputGreetingWithName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello everyone, I am " + name + " . It is nice to meet you all");

        sc.close();
    }
}
