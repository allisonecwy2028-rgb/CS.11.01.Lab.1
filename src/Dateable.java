import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
                System.out.println("Enter your age:");
        int age = -1;
        while (age < 0) {
            try {
                age = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }
        int dateAge = 7 + (age / 2);
        String output = age + "-year olds should date somebody who is at least " + dateAge + " years old.";
        System.out.println(output);

    }
}
