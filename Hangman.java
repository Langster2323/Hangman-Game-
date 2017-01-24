/*Uses instances of the Prompter class
and the Game class*/
public class Hangman {

  public static void main(String[] args) {
    // Your incredible code goes here...
    if (args.length == 0) {
      System.out.println("Usage:  java Hangman <answer>");
      System.err.println("answer is required");
      System.exit(1);
    }
    Game game = new Game(args[0]);
    Prompter prompter = new Prompter(game);
    //While both of these are true keep going...
    while (game.getRemainingTries() > 0 && !game.isWon()) {
          prompter.displayProgress();
          prompter.promptForGuess();
    }
    prompter.displayOutcome();
  }
}
