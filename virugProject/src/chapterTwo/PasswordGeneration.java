package chapterTwo;
import java.util.*;
public class PasswordGeneration {

    public static void main(String[] args) {
        int length = 12;
        System.out.println(Password(length));
    }

    static char[] Password(int pin){
            String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String Small_chars = "abcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";
            String symbols = "!@#$%^&*_=+-/.?<>)";
            String values = Capital_chars + Small_chars +
                    numbers + symbols;
            Random random = new Random();
            char[] password = new char[pin];
            for (int i = 0; i < pin; i++) {
                password[i] = values.charAt(random.nextInt(values.length()));


            }
            return password;
        }
    }

