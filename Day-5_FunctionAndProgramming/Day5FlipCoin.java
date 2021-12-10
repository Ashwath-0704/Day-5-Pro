
import java.util.*;

public class Day5FlipCoin {
	
       public static void main(String[] args)
       {
		
		int h = 0, t = 0;
		double head1, tail1;

		System.out.print("Enter the number of time filpcoin : ");
		Scanner s1 =  new Scanner(System.in);
		int num = s1.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			double random = Math.random();
			if (random < 0.5)
				t++;
			else
				h++;
			}
		head1 = h / (double) num * 100;
		tail1= t / (double) num * 100;
		
		System.out.println("Percentage of heads: " + head1 + "%");
		System.out.println("Percentage of tails: " + tail1 + "%");

       }
}