import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void TestGetCharacters() {

        //Arrange

        CharacterCounter count = new CharacterCounter();


        //Act
        count.getCharacters();
        int actual = count.getCharacters();


        //Assert
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void TestCountCharacters() {

        //Arrange

        CharacterCounter count = new CharacterCounter();


        //Act
        count.countCharacters("Hejsan");
        int actual = count.getCharacters();


        //Assert
        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    public void TestGetLines() {

        //Arrange

        CharacterCounter count = new CharacterCounter();


        //Act
        count.getLines();
        int actual = count.getLines();


        //Assert
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void TestCountLines() {

        //Arrange

        CharacterCounter count = new CharacterCounter();


        //Act
        count.countLines();
        int actual = count.getLines();


        //Assert
        int expected = 1;

        assertEquals(expected, actual);

    }


    @Test
    public void TestStopTheProgram() {

        //Arrange

        CharacterCounter count = new CharacterCounter();

        //Act
        boolean actual = count.getStop("stop");


        //Assert
        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test
    public void TestGetWords() {

        //Arrange

        CharacterCounter count = new CharacterCounter();


        //Act
        count.getNumberOfWords();
        int actual = count.getNumberOfWords();


        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void TestHowManyWords() {

        //Arrange

        CharacterCounter count = new CharacterCounter();


        //Act
        count.countNumberOfWords("Hej på dig");
        int actual = count.getNumberOfWords();


        //Assert
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void TestLongestWord() {

        //Arrange

        CharacterCounter count = new CharacterCounter();


        //Act
        count.findLongestWord("hallå hej");
        String actual = count.getLongestWord();



        //Assert
        String expected ="hallå";

        assertEquals(expected, actual);
    }
}
