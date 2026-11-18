import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int date = 100-age;

        System.out.print(age + "-year olds should read at least " + date + " pages before giving up on a book.");
    }
}
