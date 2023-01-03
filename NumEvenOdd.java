import java.util.Scanner;

public class NumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String s = (num%2==0) ? "Even" : "odd" ;
        System.out.println("The given number " + num + " is : " +s);
        sc.close();

    }
}
