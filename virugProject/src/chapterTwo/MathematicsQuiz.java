package chapterTwo;

import java.util.Random;
import java.util.Scanner;

public class MathematicsQuiz {
        public static void main(String[] args) {
            Random randomNumber = new Random();
            Scanner keyboard = new Scanner(System.in);
            int correctAnswer = 0;
            int wrongAnswer = 0;
            int counter = 1;

            while (counter <= 10) {
                char randomOperator = ' ';
                int firstRandomNumber = randomNumber.nextInt(100);
                int secondRandomNumber = randomNumber.nextInt(100);
                int result = 0;
                switch (randomNumber.nextInt(4)) {
                    case 0:
                        randomOperator = '+';
                        result = firstRandomNumber + secondRandomNumber;
                        break;

                        case 1:
                            randomOperator = '-';
                            result = firstRandomNumber - secondRandomNumber;
                            break;

                        case 2:
                            randomOperator = '*';
                            result = firstRandomNumber * secondRandomNumber;
                            break;
                        case 3:
                            randomOperator = '/';
                            result = firstRandomNumber / secondRandomNumber;
                        default:
                            System.out.println("doesn't apply");
                    }
                    System.out.println(" ");
                    System.out.println(firstRandomNumber + " " + randomOperator + " " + secondRandomNumber + " = ");
                    System.out.println("Enter answer: ");
                    int answer = keyboard.nextInt();
                    if (result == answer) {
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }

                    counter++;

                }
                System.out.println(" Number of correct answer = " + correctAnswer);
                System.out.println(" Number of wrong answer = " +wrongAnswer);
                int totalAnswer = correctAnswer - wrongAnswer;
                System.out.println(" Total answer = " + totalAnswer);

            }

        }

