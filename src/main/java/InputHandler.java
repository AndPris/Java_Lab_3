import java.util.Scanner;

public class InputHandler {
    public static int getUserInput(int minimalValue) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        while (userInput < minimalValue) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer");
                scanner.next();
                continue;
            }

            userInput = scanner.nextInt();
            if (userInput < minimalValue)
                System.out.println("Number must be " + minimalValue + " or greater");
        }

        return userInput;
    }
}
