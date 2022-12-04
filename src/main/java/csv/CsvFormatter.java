package csv;

public class CsvFormatter {
    private final String DELIMITER_PERSONS = ";";
    private final String DELIMITER_FIELD = ",";
    private final String DELIMITER_KEY_VALUE = "=";
    private final int LIMIT = 2;

    /**
     * Данный метод принимает строку представленную в формате csv
     * и возвращает массив объектов по параметрам.
     * считается что строка передается в правильном формате.
     * @param csvString строка csv
     */
    public Person[] getPersonsFromCsvFile(String csvString) {
        final String[] items = csvString.split(DELIMITER_PERSONS);

        Person[] person = new Person[items.length];
        String name = null;

        for(int i = 0; i < items.length; i++){
            final String[] firstOperation = items[i].split(DELIMITER_FIELD);

            for(int j = 0; j < firstOperation.length; j++ ){
                final String[] secondOperation = firstOperation[j].split(DELIMITER_KEY_VALUE);

                for(int b = 0; b < secondOperation.length; b++){
                        if( j == 0 && b==1){
                            name = secondOperation[secondOperation.length -1];
                        } else if(j==1 && b == 1){
                            person[i] = new Person(name, secondOperation[b]);
                        }
                }


            }
        }
        return person;
    }
}
