import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Word {
  private String word;

  public Word(String word) {
    this.word = new String(word);
  }

  public Word() {
    this.word = new String("");
  }

  public void setWord(String word) {
    this.word = word;
  }

  public String getWord() {
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
  
  public static boolean verifyLetter(String letter, String word) {
	    String[] splitedWord = word.split("");
	    for (String character : splitedWord) {
	      if (letter.equals(character)) {
	        return true;
	      }
	    }
	    return false;
  }

  public static int[] checkPositionLetter(String word, String letter) {
    //System.out.println(word);
    int index = 0;
    List<Integer> indexList = new ArrayList<Integer>();
    String[] splitedWord = word.split("");

    for (String character : splitedWord) {
      if (letter.equals(character)) {
        indexList.add(index);
      }
      index++;
    }
    int[] letterPositions = new int[indexList.size()];
    letterPositions = indexList.stream().mapToInt(Integer::intValue).toArray();
    //System.out.println(Arrays.toString(letterPositions));
    
    return letterPositions;
  }

  public static String[] replaceLetter(int[] positions, String letter, String[] hiddenWord) {
	//System.out.println(Arrays.toString(positions));
    for (int position : positions) {
      hiddenWord[position] = letter;
    }
    return hiddenWord;
  }
  
  public static void showWord(String[] hiddenWord, int tryNum) {

      String isStringFoundWord = String.join("", hiddenWord);
      System.out.println("le mot caché est : " + isStringFoundWord);
      System.out.println("il reste " + ( 7 - (tryNum)) + " tentative(s)");
  }

  public static boolean setVIctory(String[] hiddenWord, String word, int tryNum) {
      String isStringFoundWord = String.join("", hiddenWord);

      if (isStringFoundWord.equals(word)) {
        return true;
      } else {
        return false;
      }

  }
}
