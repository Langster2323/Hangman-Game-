/* This prompter object will do all of the IO or
input and output */
public class Prompter {
  private Game mGame;
  // Constructor...
  public Prompter(Game game) {
    mGame = game;
  }
  public boolean promptForGuess() {
    Console console = System.console();
    String guessAsString = console.readLine("Enter a letter:  ");
    char guess = guessAsString.charAt(0);
    return mGame.applyGuess(guess);
  }
}
