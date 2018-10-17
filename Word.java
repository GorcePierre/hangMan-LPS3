public class Word {
  private String word;

  public Word(String word){
    this.word = new String (word);
  }

  public Word(){
    this.word = new String("");
  }

  public void setWord(String word){
    this.word = word;
  }

  public String getWord(){
    return this.word;
  }

  public static String[] hideWord(String word) {
    String[] hiddenWord = new String[word.length()];
    int i = 0;
    for (String letter : hiddenWord) {
      hiddenWord[i] = new String("_ ");
      i++;
    }
    return hiddenWord;
  }
}
