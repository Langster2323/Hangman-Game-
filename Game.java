public class Game {
  private String mAnswer;
  private String mHits;
  pritvate String mMisses;
  /* Forcing the creation of the game to provide an answer
  so everytime it's created it provides an answer. */
  public Game(String answer) {
    mAnswer = answer;
    mHits = "";
    mMisses = "";
  }
  public boolean applyGuess(char letter) {
    boolean isHit = mAnswer.indexOf(letter) >= 0;
    
  }
}
