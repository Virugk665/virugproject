package chapterTwo;

import java.util.Scanner;
  public class LargestNumber{
       public static void main(String[] args){
      Scanner input= new Scanner(System.in);
      
     System.out.print("Enter First Number");
       int FirstNumber= input.nextInt();
     
        System.out.print("Enter Second Number");
           int SecondNumber= input.nextInt();
    
    System.out.print("Enter Third Number");
      int ThirdNumber= input.nextInt();

    int sum= FirstNumber + SecondNumber + ThirdNumber;
      System.out.println(" The Sum of All is :" + sum);

    int average= sum/3;
       System.out.println(" The Average is :" + average);

    int product= FirstNumber * SecondNumber * ThirdNumber;
        System.out.println(" The Product is :" + product);

      if (FirstNumber >= SecondNumber && FirstNumber >= ThirdNumber){
    System.out.println(" The First Number is Largest : " + FirstNumber);
}

    if (SecondNumber >= FirstNumber && SecondNumber >= ThirdNumber){
         System.out.println(" The Second Number is Largest : " + SecondNumber);
}
 if (ThirdNumber >= FirstNumber && ThirdNumber >= SecondNumber) {
System.out.println(" The Third Number is the Largest : " + ThirdNumber);
}
   if (FirstNumber <= SecondNumber && FirstNumber <= ThirdNumber){
      System.out.println(" The First Number is Smallest : " + FirstNumber);
}
  if (SecondNumber <= FirstNumber && SecondNumber <= ThirdNumber){
      System.out.println(" The Second Number is Smallest : " + SecondNumber);
}
  if (ThirdNumber <= FirstNumber && ThirdNumber <= SecondNumber){
      System.out.print(" The Third Number is Smallest : " + ThirdNumber);
}
}
}