import java.util.*;

public class Day5EvenandOdd {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int number = s1.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is even");
        } else{
        System.out.println(number + " is odd");
        }
    }
}