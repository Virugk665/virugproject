package tddClass;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class KataTest {
    @Test
    public void additionTest() {
        Kata user1 = new Kata();
        int result = user1.addition(14000, 1000);
        assertEquals(15000, result);
    }

    @Test
    public void subtractionTest() {
        Kata wale = new Kata();
        int result = wale.subtraction(22, 125);
        assertEquals(103, result);

    }

    @Test
    public void areaCircleTest() {
        Kata joseph = new Kata();
        double result = joseph.circleArea(7);
        assertEquals(154.0, result);
    }

    @Test
    public void bitFlipperTest() {
        Kata joseph = new Kata();
        int result = joseph.flip(9);
        assertEquals(9, result);

    }
@Test
    public void evenNumber() {
        int number = 1;
        while (number<=100) {

            if (number%2==0) {
                System.out.print(number + " ");
            }
        }
    }
    @Test
    public void evenNumbers(){
        int evenNumbers = 2;
        while (evenNumbers<=100){
            System.out.print(evenNumbers+ " ");
            evenNumbers = evenNumbers + 2;
        }
    }
    @Test
    public void evenNumber1(){
        int evenNumber1 = 6;
        if (evenNumber1 % 2==0){
            System.out.println("true");
        }
        else {
            System.out.print ("false");
        }
    }
    @Test
    public void evenNumber2(){
        Kata evenNumber = new Kata();
        evenNumber.isEven(67879);
      assertEquals(false,evenNumber.isEven(3434348));
    }
    @Test
    public void largestNumber(){
        Kata virug = new Kata();
        int number = virug.largestNumber(1,2,4,5,6);
        assertEquals (6,number );
    }
 @Test
    public void factorOfANumber(){
        Kata tobi = new Kata();
            int theNumber = tobi.factorOfANumber(12);
            assertEquals(4,theNumber);
 }

 @Test
    public void primeNumber(){

        Kata gift = new Kata();
        boolean theNumber1 = gift.primeNumber(29);
        assertEquals(true, theNumber1 );

 }
}










