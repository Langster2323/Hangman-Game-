/* Scanner has a bunch of helper methods that help parse input, parse meaning
read and what it means. */
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
    boolean isHit = false;
    boolean isAcceptable = false;
    //Relying on the game logics implementation by changing guess to guessInput.
    do {
      System.out.print("Enter a letter:  ");
      String guessInput = scanner.nextLine();
      try {
        isHit = game.applyGuess(guessInput);
        isAcceptable = true;
      } catch(IllegalArgumentException iae) {
        System.out.printf("%s. Please try again. %n", iae.getMessage());
      }
    } while(! isAcceptable);
    return isHit;
  }

  public void displayProgress() {
    System.out.printf("You have %d tries left to solve: %s%n", game.getRemainingTries(), game.getCurrentProgress());
  }

  public void displayOutcome() {
    if (game.isWon()) {
      System.out.printf("Congratulations you won with %d tries remaining.%n",
      game.getRemainingTries());
    } else {
      System.out.printf("Bummer the word was %s.   :( %n");
    }
  }
}
