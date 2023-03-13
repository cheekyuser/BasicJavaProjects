import java.util.Scanner;

public class userChoice {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getUserChoice(){


        System.out.println("Let's Play! Rock, Paper or Scissor?");
        String userChoice=scanner.nextLine();
        return userChoice.toLowerCase();

    }
    public static String validateChoice(String input) {
        while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")) {
            System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors:");
            input = scanner.nextLine().toLowerCase();
        }
        return input;
    }
}
