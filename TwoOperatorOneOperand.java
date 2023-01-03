import java.util.Scanner;

public class TwoOperatorOneOperand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.print("Write which operation need to be performed +,-,*,/ : ");
        char c = sc.next().charAt(0);
        float answer = (c=='+') ? (num1 + num2):((c=='-') ? (num1 - num2) : ((c=='*') ? (num1*num2):(((float)num1/num2))));
        System.out.println(answer); 

        sc.close();
    }
}
