package chapterTwo;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int Number1 = input.nextInt();
        for (int Number = 1; Number <= 12; Number++) {
            System.out.println(Number1 + " x " + Number+ " = " + (Number1 * Number));
        }
    }
}
