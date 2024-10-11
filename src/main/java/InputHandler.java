import java.util.Scanner;

/**
 * Class which takes user input and validates it.
 */
public class InputHandler {
    /**
     * Asks user to enter integer value greater than provided <code>minimalValue</code>.
     * If input is incorrect then prints error and asks user to reenter data.
     * @param minimalValue lower bound of user input
     * @return int
     */
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
