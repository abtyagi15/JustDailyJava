
import java.util.Scanner;

public class FibonnaciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of series : ");
    int n = sc.nextInt();
    
    int i= 0, j= 1, k=0;
    for(int l=2;l<n;l++)
    {
      k=i+j;
      i=j;
      j=k;
      
    }
    System.out.print("The fibonnaci series at number " + n + " is : " + k);
  
    
    sc.close();
  }
    
}