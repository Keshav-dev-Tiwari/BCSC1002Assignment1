/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
}
