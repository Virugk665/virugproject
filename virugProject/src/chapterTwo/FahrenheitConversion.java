package chapterTwo;

import java.util.Scanner;
public class FahrenheitConversion{
public static void main(String[] arges){
Scanner input = new Scanner(System.in);
System.out.print("Enter celsuis:");
double celsuis= input.nextDouble();
double FahrenheitConversion = 9/5 * celsuis + 32;
System.out.print("FahrenheitConversion is" + FahrenheitConversion);
}
}
