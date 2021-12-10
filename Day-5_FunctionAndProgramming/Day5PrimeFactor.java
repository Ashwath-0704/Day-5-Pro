import java.util.*;

class Primefactor{
public static void main(String args[]){
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter the number "); 

        int number=s1.nextInt();
        System.out.print("The prime factors is : " );

        for (int i = 2; i*i <= number; i++) {
            while (number % i == 0) 
                System.out.print(i + " ");
                number = number / i;
        }
 
        if (number <2) System.out.println(number);
    }
 
}