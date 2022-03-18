package chapterTwo;

import java.util.Scanner;
public class FeetToMeters{
   public static void main(String[] args){
  Scanner input = new Scanner (System.in);

System.out.print(" Enter Feet Value : " );
   double feetValue = input.nextDouble();
double meterValue = feetValue * 0.305;

System.out.print( feetValue + " feet is " + meterValue + " meters " );

}
}
