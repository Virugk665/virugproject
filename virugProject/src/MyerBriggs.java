import java.util.Scanner;

public class MyerBriggs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                1. What is a psychometric test?
                2. Surely personality cannot ever be 'measured'? Can we really reduce a person down to numbers?
                3. Why use psychometric instruments?
                4. Why is an understanding of personality relevant to the workplace?
                5. How can I be convinced that psychometrics are good value for money?
                6. How can an off-the-shelf solution be genuinely relevant to my situation?
                7. Aren't some people just naturally good at tests, whilst others are not?
                8. What are assessment centres and development centres and how do they differ?
                9. What should I expect from one of The Myers-Briggs Company's psychometric questionnaires?
                10. How can I be sure that a personality assessment is fair?
                """);
                System.out.println("enter number from 1-10:  ");
        int numberSelected = scan.nextInt();
        switch (numberSelected){
            case 1:
                System.out.println("Enter answer to question");
                String answer = scan.nextLine();
                System.out.println(answer);
                break;

        }

    }
}
