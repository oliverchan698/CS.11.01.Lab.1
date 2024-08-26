import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = input.nextInt();
        System.out.println("You should read at least " + (100-age) + " pages before giving up on a book.");

    }
}
