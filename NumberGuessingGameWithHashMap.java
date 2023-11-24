import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameWithHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> difficultyLevels = new HashMap<>();
        difficultyLevels.put("easy", 10);
        difficultyLevels.put("medium", 50);
        difficultyLevels.put("hard", 100);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Choose a difficulty level: easy, medium, or hard");
        System.out.print("Enter the difficulty level: ");
        String difficulty = scanner.nextLine().toLowerCase();

        if (!difficultyLevels.containsKey(difficulty)) {
            System.out.println("Invalid difficulty level. Please choose from: easy, medium, or hard.");
            return;
        }

        int upperBound = difficultyLevels.get(difficulty);
        Random random = new Random();
        int randomNumber = random.nextInt(upperBound) + 1;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("I have chosen a number between 1 and " + upperBound + ". Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try guessing a higher number.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try guessing a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
