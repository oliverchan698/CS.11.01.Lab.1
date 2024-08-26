// Calculates the minimum age of a partner you can date at your age.
import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println(age + "-year-olds should date somebody who is at least " + (7+(age/2)) + " years old.");

    }
}