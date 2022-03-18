package chapterTwo;
import java.util.Scanner;
public class palindrome {

        public static void main (String [] arg){
            Scanner input= new Scanner (System.in);

            System.out.print("Enter the first number:");
            int number1= input.nextInt();

            System.out.print("Enter the second number:");
            int number2= input.nextInt();

            System.out.print("Enter the third number:");
            int number3= input.nextInt();


            if(number1==number3 && number3==number1){
                System.out.println("number is a palindrome");
            }
            else
                System.out.println("number is not a palindrome");
        }


    }

