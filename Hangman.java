/*Uses instances of the Prompter class
and the Game class*/
public class Hangman {

  public static void main(String[] args) {
    // Your incredible code goes here...
    Game game = new Game("treehouse");
    Prompter prompter = new Prompter(game);
    //While both of these are true keep going...
    while (game.getRemainingTries() > 0 && !game.isWon()) {
          prompter.displayProgress();
          prompter.promptForGuess();
    }
    prompter.displayOutcome();
  }
}
