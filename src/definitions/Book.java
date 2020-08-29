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
        this.authorOfTheBook = "Abhishek";
        this.ISBNnumberOfTheBook = "123456789";
    }

    public Book(String nameOfTheBook, String authorOfTheBook, String ISBNnumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.authorOfTheBook = authorOfTheBook;
        this.ISBNnumberOfTheBook = ISBNnumberOfTheBook;

    }
}
