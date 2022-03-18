package chapterTwo;

import java.util.Scanner;
public class EqualitiesSolution{
public static void main(String[] arges){
Scanner input = new Scanner(System.in);
System.out.print("Enter integer");
int integer = input.nextInt();
int squares = integer * integer;
if (integer > 100){
System.out.printf(" %d > %d%n", integer, 100);
}
if (integer == 100){
System.out.printf(" %d == %d%n", integer, 100);
}
if (integer != 100){
System.out.printf(" %d != %d%n", integer, 100);
}
if (integer < 100){
System.out.printf(" %d < %d%n", integer, 100);
}
if (squares > 100){
System.out.printf(" %d > %d%n", squares, 100);
}
if (squares == 100){
System.out.printf(" %d == %d%n", squares, 100);
}
if (squares != 100){
System.out.printf(" %d != %d%n", squares, 100);
}
if (squares < 100){
System.out.printf(" %d < %d%n", squares, 100);
}
}
}