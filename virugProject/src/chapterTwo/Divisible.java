package chapterTwo;

import java.util.Scanner;
public class Divisible{
public static void main(String[] arges){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number");
int number = input.nextInt();
int division = number/3;
if (division % 3 == 0){
System.out.print("The number is divisible by 3");
}
else{
System.out.print(" the number is not divisible by 3");
}
}
}
