package csv;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CsvFormatterTest {
    @Test
    public void createArrayPersonFromCsvFile() {
        CsvText csvText = new CsvText();
        CsvFormatter csvFormatter = new CsvFormatter();

        Person[] expected = {
                new Person("Nikita", "Nesterenko"),
                new Person("Arina", "Belinskaya"),
                new Person("Vlad", "Morozov"),
                new Person("Polina", "Obromova"),
        };



        Assert.assertArrayEquals(expected, csvFormatter.getPersonsFromCsvFile(csvText.getTextFromFile()));

    }

}