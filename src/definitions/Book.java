/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private String authorOfTheBook;
    private String ISBNnumberOfTheBook;

    public  Book(){
        nameOfTheBook = "theunlovedtales";
        authorOfTheBook = "kaka";
        ISBNnumberOfTheBook = "05042001";
    }

    public Book(String nameOfTheBook){
        this.nameOfTheBook = nameOfTheBook;
        this.authorOfTheBook = "Keshav";
        this.ISBNnumberOfTheBook = "4567890123";
    }

    public Book(String nameOfTheBook, String authorOfTheBook, String ISBNnumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.authorOfTheBook = authorOfTheBook;
        this.ISBNnumberOfTheBook = ISBNnumberOfTheBook;

    }
    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {

        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthorOfTheBook() {

        return authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getISBNnumberOfTheBook() {

        return ISBNnumberOfTheBook;
    }

    public void setISBNnumberOfTheBook(String ISBNnumberOfTheBook) {

        this.ISBNnumberOfTheBook = ISBNnumberOfTheBook;
    }

    @Override
    public String toString() {
        return String.format(
                "book name: %s, Author of the Book:%s, ISBN number of book:%s",
                getNameOfTheBook(), getAuthorOfTheBook(), getISBNnumberOfTheBook()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameOfTheBook.equals(book.nameOfTheBook) &&
                authorOfTheBook.equals(book.authorOfTheBook) &&
                ISBNnumberOfTheBook.equals(book.ISBNnumberOfTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, authorOfTheBook, ISBNnumberOfTheBook);
    }
}
