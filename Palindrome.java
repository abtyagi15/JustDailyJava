import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.next();
        char [] c = s.toCharArray();
        char p;

        for( int i=0;i<=(c.length- 1)/2;i++)
        {
            p = c[i];
            c[i] = c[c.length -1-i];
            c[c.length -1-i] = p;

        }
        String new_s = String.copyValueOf(c);
        System.out.println(new_s);

        boolean bool = (s.equals(new_s)) ? true : false;
        
        if(bool == true)
        {
            System.out.println("The given string " + s + " is palindrome");

        }
        else
        {
            System.out.println("The given string " + s + " is not a palindrome");
        }
       
      

        sc.close();
    }
}
