package chapterTwo;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A Score: ");
        int Number1 = input.nextInt();
        System.out.println("Enter Student Name: ");
        String StudentName = input.nextLine();
        switch (Number1) {
            case 1: {
                System.out.println(StudentName + "has grade");
                switch (StudentName) {
                    case "grade": {
                        System.out.println("A");
                        break;
                    }
                }


            }

        }

    }
}
