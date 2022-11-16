package task.pair;

import java.math.BigInteger;

public class KeyService {
    private final char[] numbers = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /*
    В данной задаче нужно разобраться
    1. Как объединить две строки в одну.
    2. Как работает класс StringBuilder , он понадобиться для решения.
    3. Для чего понадобиться метод contains, его нужно переиспользовать.
    4. Как создать значение внутри BigInteger.
     */

    /**
     * Метод берет два ключа, отбирает из этих ключей только цифры, образуя из них значение
     * объединяет 1-ый ключ с 2-ым в огромное число и возвращает его.
     *
     * @param pair пара ключей
     * @return значение
     */
    public BigInteger getHash(Pair pair) {
            StringBuilder builder = new StringBuilder();
            builder.append(pair.getFirstKey().replaceAll("[^0-9]", "")).append(pair.getSecondKey().replaceAll("[^0-9]", ""));

            int characters = builder.length();
            char[] symbols = new char[characters];

            for(int i = 0; i < characters; i++){
                symbols[i] = builder.charAt(i);
            }

            if(contains(symbols)) {
            BigInteger doubleKey = new BigInteger(builder.toString());
            return doubleKey;
        }
        return null;
    }

    private boolean contains(char[] element) {

        for (int i = 0; i < element.length; i++ ){
            if(numbers[i] != element[i])
                return false;
        }
        return true;
    }
}

