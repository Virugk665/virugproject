package chapterTwo;

import java.util.Scanner;
public class EnergyCalculation{
   public static void main(String[] args){
  Scanner input = new Scanner (System.in);

System.out.print(" Enter Weight in Kilogram : ");
  double kilogramWeight = input.nextDouble();

System.out.print(" Enter Initial Temperature : ");
 double initialTemperature = input.nextDouble();

System.out.print(" Enter Final Temperature : ");
 double finalTemperature = input.nextDouble();

double energyNeeded = kilogramWeight * ( finalTemperature - initialTemperature ) * 4184;

System.out.print( " The energy needed is : " + energyNeeded + " joules " );

}
}
