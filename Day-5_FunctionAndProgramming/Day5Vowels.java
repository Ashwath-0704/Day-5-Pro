
public class Day5Vowels {

    public static void main(String[] args) {

        char char1 = 'i';

        switch (char1)
        {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
             System.out.println(" The  Entered is vowel "+char1);
                break;
            default:
                System.out.println(" It is consonant"+char1);
        }
    }
}