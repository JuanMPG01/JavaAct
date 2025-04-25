package practice.hol;

import javax.swing.*;

public class Book {
String title;
String author;
String isbn;
Boolean isCheckedOut;

    public Book(String title, String author, String isbn, Boolean isCheckedOut) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
    }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public Boolean getCheckedOut() {
            return isCheckedOut;
        }

        public void setCheckedOut(Boolean checkedOut) {
            isCheckedOut = checkedOut;
        }

        public void checkout() {
            if (!isCheckedOut) {
                isCheckedOut = true;
                JOptionPane.showMessageDialog(null, "You have been checked out");

            } else {
                isCheckedOut = false;
                JOptionPane.showMessageDialog(null, "You have been checked out");
            }
        }
        //get
        public String getDetails(){
            return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nISBN: " + getIsbn()+"\nChecked Out: " + getCheckedOut();
        }

        public void returnBook() {
            if (isCheckedOut) {
                this.isCheckedOut = true;
                JOptionPane.showMessageDialog(null, "Book with ISBN " + isbn + " has been returned.");

            } else{
                JOptionPane.showMessageDialog(null, "This book is in the library");
            }

        }



}


