public class CharacterCounter {

    private int words;
    private int lines;
    private int nbrWords;
    private String longestWord = "";

    public CharacterCounter() {
    }

    public int getCharacters() {
        return words;
    }

    public void countCharacters(String myString) {
        words = words + myString.length();
    }

    public int getLines() {
        return lines;
    }

    public void countLines() {
        lines = lines + 1;
    }

    public boolean getStop(String myString) {
        if (myString.contains("stop") || myString.contains("Stop")) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumberOfWords() {
        return nbrWords;
    }

    public void countNumberOfWords(String myString) {
        String[] words = myString.split(" ");
        for (int i = 0; i < words.length; i++) {
            nbrWords++;
        }
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void findLongestWord(String myString) {
        String[] lWord = myString.split(" ");
        for (int i = 0; i < lWord.length; i++) {
            if (lWord[i].length() > longestWord.length()) {
                longestWord = lWord[i];
            }
        }
    }
}