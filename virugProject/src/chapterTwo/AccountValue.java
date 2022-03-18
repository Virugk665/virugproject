package chapterTwo;

import java.util.Scanner;
public class AccountValue{
public static void main(String[] args){
Scanner input = new Scanner (System.in);
System.out.print("Enter monthly saving amount");
double monthlyAmount = input.nextDouble();
double monthlyInterestRate= 0.00417;
double addedMonthlyInterestRate= 1 + monthlyInterestRate;
double firstMonth = monthlyAmount * addedMonthlyInterestRate;
double secondMonth = (100 + firstMonth) * addedMonthlyInterestRate;
double thirdMonth = (100 + secondMonth) * addedMonthlyInterestRate;
double forthMonth = (100 + thirdMonth) * addedMonthlyInterestRate;
double fifthMonth = (100 + forthMonth) * addedMonthlyInterestRate;
double sixthMonth = (100 + fifthMonth) * addedMonthlyInterestRate;
System.out.print(" Sixth Month Value is : " + sixthMonth);

}
}
