package chapterTwo;

import java.util.Scanner;
public class VolumeConversion{
public static void main(String[] arges){
Scanner input = new Scanner(System.in);
System.out.print("Enter radius:");
int radius= input.nextInt();
float pie = 22/7;


System.out.print("Enter length:");
int length= input.nextInt();
double area = radius * radius * pie;
 double volume = area * length;
System.out.println("Area is: " + area);
System.out.print("Volume is: " + volume);
}
}
