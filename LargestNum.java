import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        int number = (num1>num2) ?  num1 : num2;
        System.out.println("The greater number is : " + number);
        sc.close();
    }
    
}
