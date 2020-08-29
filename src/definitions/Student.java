/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {

    Book[] nameOfTheBookIssueByTheStudent;

    public Student() {
        this.nameOfTheBookIssueByTheStudent = new Book[1];
        for (int i = 0; i < nameOfTheBookIssueByTheStudent.length; i++) {
            nameOfTheBookIssueByTheStudent[i] = new Book("Book Number: " + (i + 1));
        }
    }

    public Student(Book[] nameOfTheBookIssueByTheStudent) {
        this.nameOfTheBookIssueByTheStudent = nameOfTheBookIssueByTheStudent;
    }

    public Book[] getNameOfTheBookIssueByTheStudent() {
        return nameOfTheBookIssueByTheStudent.clone();
    }

    public void setNameOfTheBookIssueByTheStudent(Book[] nameOfTheBookIssueByTheStudent) {
        this.nameOfTheBookIssueByTheStudent = nameOfTheBookIssueByTheStudent;
    }

}
