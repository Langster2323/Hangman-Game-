/* Scanner has a bunch of helper methods that help parse input, parse meaning read and what it means. */
import java.util.Scanner;
//This class will handle all of the IO, Input and Output...
class Prompter {
  // A private variable that's a instances of the game.
  private Game game;

  public Prompter(Game game) {
    this.game = game;
  }

  public boolean promptForGuess() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a letter:  ");
    String guessInput = scanner.nextLine();
    char guess = guessInput.charAt(0);
    return game.applyGuess(guess);
  }
  public void displayProgress() {
    System.out.printf("Try to solve: %s%n", game.getCurrentProgress());
  }
}
