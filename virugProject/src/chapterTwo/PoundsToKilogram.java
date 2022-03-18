package chapterTwo;

import java.util.Scanner;
public class PoundsToKilogram{
   public static void main(String[] args){
  Scanner input = new Scanner (System.in);

System.out.print(" Enter a number in pounds : ");
   double poundValue = input.nextDouble();
  double kilogramValue = poundValue * 0.454;

System.out.print( poundValue + " pounds " + kilogramValue + " kilograms ");

}
}