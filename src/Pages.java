import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your age:");
        int age = -1;
        while (age < 0) {
            try {
                int input = Integer.parseInt(scanner.nextLine());

                if (input < 0) {
                    System.out.println("Please enter a non-negative number.");
                } else {
                    age = input;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }
        int pages = 100 - age;
        String output = age + "-year olds should read at least " + pages + " pages before giving up on a book.";
        System.out.println(output);

    }
}
