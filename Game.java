public class Game {
  // Declared here...
  private String mAnswer;
  private String mHits;
  private String mMisses;
  /* Forcing the creation of the game to provide an answer
  so everytime it's created it provides an answer. */
  public Game(String answer) {
    // Initialized here...
    mAnswer = answer;
    mHits = "";
    mMisses = "";
  }
  /* Adding a method that will allow the user to
  apply a guess towards the puzzle */
  public boolean applyGuess(char letter) {
    boolean isHit = mAnswer.indexOf(letter) >= 0;
    // Updating our state...
    if (isHit) {
      mHits += letter;
    } else {
      mMisses += letter;
    }
    return isHit;
  }
}
