
import java.util.*;  
class Day5SwapNumber
{  
    public static void main(String[] args) 
    {  
       int X,Y,temp;  
       
       Scanner s1 = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       X = s1.nextInt();  
       Y = s1.nextInt();  
       System.out.println("before swapping numbers: "+X +"  "+ Y); 

       temp = X;  
       X = Y;  
       Y = temp;  
       
       System.out.println("After swapping: "+X +"   " + Y);  
    }    
}  