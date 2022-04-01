package chapterTwo;
import java.util.*;
public class AnotherPasswordGenerator {

    public static void main(String[] args) {



        int length = 12;
            {
                Random generator = new Random();
                StringBuilder password = new StringBuilder(length);

                for (int i = 0; i < length; i++) {
                    password.append(generator.nextInt(10));
                }
                System.out.println(password);


            }
        }
    }

