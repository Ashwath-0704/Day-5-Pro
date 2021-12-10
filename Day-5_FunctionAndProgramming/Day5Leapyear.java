
import java.util.*;

public class Day5Leapyear {

	public static void main(String args[])
	{
		int Y;
		System.out.println("Enter the year");
		Scanner s1 =new Scanner(System.in);
		Y = s1.nextInt();
		
		if((Y % 4==0) && (Y % 100!=0) || (Y % 400 ==0)){
			System.out.println(Y+"is Leap year");
		}
		else
			System.out.println(Y+"is Not leap year");
		
	}

	
}