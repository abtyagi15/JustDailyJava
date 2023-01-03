import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        int principal = sc.nextInt();
        System.out.print("Enter the time duration(in years) : ");
        int time = sc.nextInt();
        System.out.print("Enter the rate : ");
        float rate = sc.nextFloat();
        float simple_interest = principal*time*rate/100;
        System.out.println(simple_interest);
        sc.close();
    }
}
