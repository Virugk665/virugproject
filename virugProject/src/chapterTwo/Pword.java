package chapterTwo;
import java.util.Random;
public class Pword {

        public static void main(String... args) {
            char[] pwords = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
                    'Y', 'Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0',
                    '1','2','3','4','5','6','7','8','9'};
            Random pass = new Random();
            char mean = ' ';//create new variable to get the space from the character array

            for (int i = 0; i< 12; i++){
                mean = pwords[pass.nextInt(61)];//the variable should be equated to get the passwords that is housing the random generator object
                System.out.print(mean);
            }

        }
    }


