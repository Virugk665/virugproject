package chapterTwo;

import java.util.Scanner;
public class MinimumLength{
   public static void main(String[] args){
  Scanner input = new Scanner (System.in);

System.out.print(" Enter Velocity Value and Accelaration Value : ");
      double velocityValue = input.nextDouble();
   double accelerationValue = input.nextDouble();
double minimumLength = ( velocityValue * velocityValue ) / ( 2*accelerationValue ) ;

System.out.print(" The minimum runway length for this airplane is : " + minimumLength );

}
}

