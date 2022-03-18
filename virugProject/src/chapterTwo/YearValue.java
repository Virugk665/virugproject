package chapterTwo;

import java.util.Scanner;
public class YearValue{
   public static void main(String[] args){
  Scanner input = new Scanner (System.in);

System.out.print("Enter Minute Value");
    int minute = input.nextInt();
   int hours = minute/60;
  int days = hours / 24;
 int years = ( days / 365);
System.out.print((int) minute + " minutes " + " is approximately " + years + " years " + days + " days ");
}
}