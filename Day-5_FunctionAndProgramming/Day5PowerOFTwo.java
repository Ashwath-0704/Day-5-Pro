
public class Day5PowerOFTwo {
    public static void main(String[] args) {

        int n = 30;

        int i = 0;          
        int PO2 = 1;       

        if (i<=n && n<=31) {
            PO2 = 2 * PO2;
            System.out.println(" " + PO2); 
            i += 1;
        }
    }
}