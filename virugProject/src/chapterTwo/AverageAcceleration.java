package chapterTwo;

import java.util.Scanner;
public class AverageAcceleration{
   public static void main(String[] args){
  Scanner input = new Scanner (System.in);

System.out.print(" Enter Starting Velocity, Ending Velocity and Time : ");
     double startingVelocity = input.nextDouble();
   double endingVelocity = input.nextDouble();
  double time = input.nextDouble();
 double averageAcceleration = ( endingVelocity - startingVelocity ) / time;

System.out.print(" The average acceleration is : " + averageAcceleration);
}
}