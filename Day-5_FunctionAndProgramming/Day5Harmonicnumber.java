import java.io.*;
//class init
class Day5Harmonicnumber {
// method init
    static double NthHarmonic(int number){
        double num = 1;
        for (int i = 2; i <= number; i++) {
            num = num + (float)1 / i;
        }
        return num;}

        public static void main (String[] args) 
        {
            int n = 50;
            // caling method
            System.out.println(NthHarmonic(n));

    }
}