import java.util.Scanner;

public class SumTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println(num1+num2);
        sc.close();
    }
}
