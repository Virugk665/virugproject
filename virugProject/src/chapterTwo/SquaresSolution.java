package chapterTwo;

import java.util.Scanner;
public class SquaresSolution{
public static void main(String[] arges){
Scanner input = new Scanner(System.in);
System.out.print("Enter first integer");
int firstinteger = input.nextInt();
System.out.print("Enter second integer");
int secondinteger = input.nextInt();
int firstsquares = firstinteger * firstinteger;
int secondsquares = secondinteger * secondinteger;
int sum = firstsquares + secondsquares;
int difference = firstsquares - secondsquares;
System.out.println("The Square of first number = " + firstsquares);
System.out.println("The Square of second number = " + secondsquares);
System.out.println("The Sum of Squares = " + sum);
System.out.print("The Difference of Squares = " + difference);
}
}
