package chapterTwo;

public class ArrayOf300 {
    public static void main(String[] args) {
        int []Array= new int[300];

        for (int i = 0; i < 300; i++) {
            Array[i] = i + 1;

        }
        for (int i = 0; i < 300; i++) {
            System.out.print(Array[i] + " ");

        }
    }
}
