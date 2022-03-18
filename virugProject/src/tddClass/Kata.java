package tddClass;

public class Kata {
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        if (num1 > num2)
            return num1 - num2;
        if (num2 > num1) return num2 - num1;
        return 0;
    }

    public double circleArea(int radius) {
        return (22 * radius * radius) / 7.0;
    }

    public int flip(int num) {
        if (num == 1) return 0;
        if (num == 0) return 1;
        return num;
    }


    public boolean isEven(int integer) {
        if (integer % 2 == 0) {
            return true;
        } else
            return false;
    }

    public int largestNumber(int firstNumber, int secondNumber, int thirdNumber, int forthNumber, int fifthNumber) {
        int largestNumber = 0;

        if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > forthNumber && firstNumber > fifthNumber) {
            return largestNumber = firstNumber;
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > forthNumber && secondNumber > fifthNumber) {
            return largestNumber = secondNumber;
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > forthNumber && thirdNumber > fifthNumber) {
            return largestNumber = thirdNumber;
        }
        if (forthNumber > firstNumber && forthNumber > secondNumber && forthNumber > thirdNumber && forthNumber > fifthNumber) {
            return largestNumber = forthNumber;
        }
        if (fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > forthNumber) {
            return largestNumber = fifthNumber;
        }
        return largestNumber;
    }

    public int factorOfANumber(int integer) {
        int theNumber = 1;
        //int digit =1;

        for (int number = 1; number < integer; number++ ) {

            if (integer % number == 0) {
                theNumber++;
            }
        }
        return theNumber;
    }
    public boolean primeNumber(int integer) {

        int theNumber = 1;
        //int digit =1;

        for (int number = 1; number < integer; number++ ) {

            if (integer % number == 0) {
                theNumber++;
            }
        }
        if(theNumber <= 2)return true;
        return false;
    }
}



