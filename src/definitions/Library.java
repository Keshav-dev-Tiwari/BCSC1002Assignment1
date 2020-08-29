/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    Book[]  booksAvailableInLibrary;

    public Library() {
        this.booksAvailableInLibrary = new Book[10];
        for (int i = 0; i < booksAvailableInLibrary.length; i++) {
            booksAvailableInLibrary[i] = new Book("Book Number: " + (i + 1));
        }
    }

    public Library(Book[] booksAvailableInLibrary) {
        this.booksAvailableInLibrary = booksAvailableInLibrary;
    }

    public Book[] getbooksAvailableInLibrary() {
        return booksAvailableInLibrary;
    }

    public void setbooksAvailableInLibrary(Book[] booksAvailableInLibrary) {
        this.booksAvailableInLibrary = booksAvailableInLibrary;
    }

}
