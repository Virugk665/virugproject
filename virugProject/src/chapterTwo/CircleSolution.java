package chapterTwo;

import java.util.Scanner;
import java.lang.Math.*;
public class CircleSolution {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter radius");
int radius = input.nextInt();
double diameter = 2 * radius;
double circumference = 2 * radius * Math.PI;
double area = radius * radius * Math.PI;
System.out.println("Diameter of a Circle is :" + diameter);
System.out.println("Circumference of a Circle is :" + circumference);
System.out.print("Area of a Circle is :" + area);
}
}