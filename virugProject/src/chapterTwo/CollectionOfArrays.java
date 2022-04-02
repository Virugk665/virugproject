package chapterTwo;

public class CollectionOfArrays {
    public static void main(String[] args) {
        int [] arraysOfNumbers = new int[10];
        arraysOfNumbers[0] = 20 ;
        arraysOfNumbers[1] = 200;
        arraysOfNumbers[2] = 340;
        arraysOfNumbers[3] = 2412;
        arraysOfNumbers[4] = 5000;
        arraysOfNumbers[5] = 667;
        arraysOfNumbers[6] = 90;
        arraysOfNumbers[7] = 81;
        arraysOfNumbers[8] = 9;
        arraysOfNumbers[9] = 100;
        for(int i = 0; i < arraysOfNumbers.length; i++){
            System.out.print(arraysOfNumbers[i] + " ");
        }
        System.out.println(" ");
        int groupOne = arraysOfNumbers[0] + arraysOfNumbers[1] + arraysOfNumbers[2] + arraysOfNumbers[3] + arraysOfNumbers[4];
        int groupTwo= arraysOfNumbers[5] + arraysOfNumbers[6] + arraysOfNumbers[7] + arraysOfNumbers[8] + arraysOfNumbers[9];
        int  sum = groupOne + groupTwo;
        int size = arraysOfNumbers[0];
        for(int num :arraysOfNumbers){
            if(size < num)
                size = num;
        }
        int average = (groupOne + groupTwo) / arraysOfNumbers.length;
        System.out.println("sum of numbers in array is : " + sum);
        System.out.println("the maximum number in array is : " + size);
        System.out.println("the average of numbers in array is : " + average);




    }
}
