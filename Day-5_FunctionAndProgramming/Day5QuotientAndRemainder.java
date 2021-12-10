import java.util.Scanner;

public class Day5QuotientAndRemainder {
	  
    public static void main(String[] args)
    {
  
        
        System.out.println("Enter the A number :");
        Scanner s1 = new Scanner(System.in);
        int A = s1.nextInt();
        
        System.out.println("Enter the B value");
        int B = s1.nextInt();
        
        Double quotient = (double) (A / B);
        Double remainder = (double) (A % B);
  
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}