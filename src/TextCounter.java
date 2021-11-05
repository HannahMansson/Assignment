import java.util.Scanner;

public class TextCounter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CharacterCounter count = new CharacterCounter();

        System.out.println("Welcome! Please enter whatever you feel like!");

        String myString = scan.nextLine();
        while (!count.getStop(myString)) {
            count.countCharacters(myString);
            count.countLines();
            count.countNumberOfWords(myString);
            count.findLongestWord(myString);
            myString = scan.nextLine();
            }

        System.out.println("You wrote " + count.getCharacters() + " character(s)," + " on "+ count.getLines() + " lines." );
        System.out.println("I have counted and you wrote " + count.getNumberOfWords() + " words" + " and the longest word you wrote is: " + count.getLongestWord());

        }
    }