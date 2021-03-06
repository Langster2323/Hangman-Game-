// Has the answer to the puzzle...
class Game {
  // Declared but no intialized
  public static final int MAX_MISSES = 7;
  private String answer;
  private String hits;
  private String misses;
  //Forcing the creation of the game by creating a constructor
  public Game(String answer) {
    //Now these variable names are initialized...
    this.answer = answer.toLowerCase();
    hits = "";
    misses = "";
  }

  public String getAnswer() {
    return answer;
  }
  //To group common functionality...
  private char normalizeGuess(char letter) {
    if (! Character.isLetter(letter)) {
      throw new IllegalArgumentException("A letter is required");
    }
    letter = Character.toLowerCase(letter);
     if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1) {
      throw new IllegalArgumentException(letter + " has already been guessed");
    }
    return letter;
  }
// Method signature...
  public boolean applyGuess(String letters) {
    if (letters.length() == 0) {
      throw new IllegalArgumentException("No letter found");
    }
    return applyGuess(letters.charAt(0));
  }

  public boolean applyGuess(char letter) {
   letter = normalizeGuess(letter);
    boolean isHit = answer.indexOf(letter) != -1;
    if (isHit) {
      hits += letter;
    } else {
      misses += letter;
    }
    return isHit;
  }

  public int getRemainingTries() {
    return MAX_MISSES - misses.length();
  }

  public String getCurrentProgress() {
    String progress = "";
    for (char letter : answer.toCharArray()) {
      char display = '-';
      if (hits.indexOf(letter) != -1) {
        display = letter;
      }
      progress += display;
    }
    return progress;
  }

  public boolean isWon() {
    //This is method chaining...
    return getCurrentProgress().indexOf('-') == -1;
  }
}
