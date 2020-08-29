/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {

    Book[] nameOfTheBookIssueByTheStudent;

    public Student() {
        this.nameOfTheBookIssueByTheStudent = new Book[5];
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Arrays.equals(nameOfTheBookIssueByTheStudent, student.nameOfTheBookIssueByTheStudent);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(nameOfTheBookIssueByTheStudent);
    }

    @Override
    public String toString() {
        return  Arrays.toString(nameOfTheBookIssueByTheStudent);
    }

    public void nameOfTheStudent(String firstName, String middleName, String lastName) {
        System.out.println("Name of the student " + firstName + " " + middleName + " " + lastName);
    }

    public void universityRollNumber(long number) {
        System.out.println("University Roll NUmber: " + number);
    }

    public void numberOfBooksIssuedByStudent(int number) {
        System.out.println("Number Of Books Issued By Student" + number);
    }

    public void booksAvailable() {
        for (Book books : nameOfTheBookIssueByTheStudent) {
            System.out.println(books);
        }
    }
}
