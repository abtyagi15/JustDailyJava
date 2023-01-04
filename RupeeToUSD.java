import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in rupees : ");
        float rupees = sc.nextFloat();
        System.out.println("value of " + rupees + " rupees in USD is " + rupees*0.012);
        sc.close();
    }
    
}
