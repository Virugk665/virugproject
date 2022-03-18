package chapterTwo;

import java.util.Scanner;
public class TheLargestNumber{
public static void main(String[] arges){
Scanner input = new Scanner(System.in);
System.out.print("Enter first number");
int firstnumber = input.nextInt();
System.out.print("Enter second number");
int secondnumber = input.nextInt();
System.out.print("Enter third number");
int thirdnumber = input.nextInt();
System.out.print("Enter forth number");
int forthnumber = input.nextInt();
System.out.print("Enter fifth number");
int fifthnumber = input.nextInt();
if (firstnumber > secondnumber && firstnumber > thirdnumber && firstnumber > forthnumber && firstnumber > fifthnumber){
System.out.printf(" %s %d %s %n ", "the number" , firstnumber, "is the largest");
}
if (secondnumber > firstnumber && secondnumber > thirdnumber && secondnumber > forthnumber && secondnumber > fifthnumber){
System.out.printf(" %s %d %s %n ", "the number" , secondnumber, "is the largest");
}
if (thirdnumber > firstnumber && thirdnumber > secondnumber && thirdnumber > forthnumber && thirdnumber > fifthnumber){
System.out.printf(" %s %d %s %n ", "the number" , thirdnumber, "is the largest");
}
if (forthnumber > firstnumber && forthnumber > secondnumber && forthnumber > thirdnumber && forthnumber > fifthnumber){
System.out.printf(" %s %d %s %n ", "the number" , forthnumber, "is the largest");
}
if (fifthnumber > firstnumber && fifthnumber > secondnumber && fifthnumber > thirdnumber && fifthnumber > forthnumber){
System.out.printf(" %s %d %s %n ", "the number" , fifthnumber, "is the largest");
}
if (firstnumber < secondnumber && firstnumber < thirdnumber && firstnumber < forthnumber && firstnumber < fifthnumber){
System.out.printf(" %s %d %s %n ", "the number" , firstnumber, "is the smallest");
}
if (secondnumber < firstnumber && secondnumber < thirdnumber && secondnumber < forthnumber && secondnumber < fifthnumber){
System.out.printf(" %s %d %s %n ", "the number" , secondnumber, "is the smallest");
}
if (thirdnumber < firstnumber && thirdnumber < secondnumber && thirdnumber < forthnumber && thirdnumber < fifthnumber){
System.out.printf(" %s %d %s %n ", "the number" , thirdnumber, "is the smallest");
}
if (forthnumber < firstnumber && forthnumber < secondnumber && forthnumber < thirdnumber && forthnumber < fifthnumber){
System.out.printf(" %s %d %s %n ", "the number" , forthnumber, "is the smallest");
}
if (fifthnumber < firstnumber && fifthnumber < secondnumber && fifthnumber < thirdnumber && fifthnumber < forthnumber){
System.out.printf(" %s %d %s %n ", "the number" , fifthnumber, "is the smallest");
}
}
}