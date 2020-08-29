/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(booksAvailableInLibrary, library.booksAvailableInLibrary);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(booksAvailableInLibrary);
    }

    @Override
    public String toString() {
        return Arrays.toString(booksAvailableInLibrary);
    }
}
