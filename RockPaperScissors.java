import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter your choice: Rock, Paper, Scissors");
            String userChoice = scanner.nextLine();

            int compChoiceIndex = random.nextInt(3);
            String compChoice = choices[compChoiceIndex];

            System.out.println("Computer chose: " + compChoice);

            if (userChoice.equalsIgnoreCase(compChoice)) {
                System.out.println("It's a draw!");
            } else if (

            )
        }

        
    }
}