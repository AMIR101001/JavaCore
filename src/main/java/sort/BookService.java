package sort;

public class BookService {
    /**
     * Используя алгоритм сортировки выбором отсортируйте книги по их году.
     * Алгоритм можно найти тут - https://favtutor.com/blogs/sorting-algorithms-java
     * В данной задаче ЗАПРЕЩЕНО использовать Comparator.
     * @param books неупорядоченные книги
     * @return отсортированные книги по году.
     */
    Book book;
    public Book[] sortBookByYear(Book[] books) {
        for(int i = 0; i < books.length; i++){
            if(books[i].getCreatedYear() > books[i+1].getCreatedYear()){
                book = books[i];
                books[i] = books[i+1];
                books[i+1] = book;
                i = 0;
            }
        }
        return books;
    }
}
