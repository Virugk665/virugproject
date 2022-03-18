package chapterTwo;

import java.util.Scanner;
public class OneAndZero {
        public static void main(String[] arges) {
            
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            if (number == 1) {
                System.out.print("0");
            }
            if (number == 0) {
                System.out.print("1");
            }

        }
        }