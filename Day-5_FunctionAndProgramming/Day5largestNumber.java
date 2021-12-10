import java.util.*;

public class Day5largestNumber  
{  
public static void main(String[] args)   
{  

	int X,Y,Z;
	 Scanner sc = new Scanner(System.in);

     System.out.print("Enter X Number: ");
     X = sc.nextInt();
     System.out.print("Enter Y Number: ");
     Y = sc.nextInt();
     System.out.print("Enter Z Number: ");
     Z = sc.nextInt();
     
     if(X>=Y && X>=Z)  
    	 System.out.println(X+" is the largest Number");  

     else if (Y>=X && Y>=Z)  
    	 System.out.println(Y+" is the largest Number");  
     else  
    	 System.out.println(Z+" is the largest number");  
    }  
} 