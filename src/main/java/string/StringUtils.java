package string;

public class StringUtils {
    /**
     * Данный метод находит саммую длинную строку в массиве и возвращает объект представленный из
     * размера данной строки и её значении
     * @param strings массив строк
     * @return самая большая строка в верхнем регистре
     */
    public static BigString getTheBiggestStringFromArray(String[] strings) {
        int lenght = 0;
        String line = " ";
        BigString bigString = null;
        for (String string : strings) {
            if (lenght < string.length()) {
                lenght = string.length();
                line = string;
            }
            bigString = new BigString(lenght, line);
        }
        return bigString;
    }
}
