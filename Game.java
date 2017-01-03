// Has the answer to the puzzle...
class Game {
  // Declared but no intialized
  private String answer;
  private String hits;
  private String misses;
  //Forcing the creation of the game by creating a constructor
  public Game(String answer) {
    //Now these variable names are initialized...
    this.answer = answer;
    hits = "";
    misses = "";
  }

  public boolean applyGuess(char letter) {
    boolean isHit = answer.indexOf(letter) != -1;
    if (isHit) {
      hits += letter;
    } else {
      misses += letter;
    }
    return isHit;
  }

}
