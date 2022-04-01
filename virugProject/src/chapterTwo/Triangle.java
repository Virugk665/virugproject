package chapterTwo;


import java.util.Scanner;

public class Triangle {

    public void printTriangle(int number, String somethingToPrint) {
        for (int i = 0; i < number; i++) {
            System.out.println(somethingToPrint);
        }


    }


    public static void main(String[] args) {
        int numberOfloopTriangle = 4;
        Triangle triangle = new Triangle();
        triangle.printTriangle(4, "*");
        for (int i = 0; i < numberOfloopTriangle; i++) {
        }

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int row = 5; row >= 0; row--) {
            for (int column = 0; column <= row; column++) {
                System.out.print( "* ");
            }
            System.out.println();
        }



        }
    }


