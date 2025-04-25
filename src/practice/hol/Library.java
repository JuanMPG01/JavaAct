package practice.hol;

import java.util.ArrayList;
import javax.swing.*;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBasicLibrary(Book b, String check) {
        books.add(b);
        JOptionPane.showMessageDialog(null, "Added BasicLibrary: \nTitle: " + b.getTitle()+"\nAuthor: "+b.getAuthor()+"\nISBN: "+b.isbn+"\nisCheckedOut: "+ check);
    }

//reeplantear el metodo.... mostrar directamente con el vector books
    public void listaAllAvailablebooks(){

        String listBooks = "";

        for (int i = 0; i < books.size(); i++) {

            if(!books.get(i).isCheckedOut){
               listBooks += books.get(i).getDetails()+"\n\n";
            }
        }
        if (listBooks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "There are no available books.");
        } else {
            JOptionPane.showMessageDialog(null,"Lqist of available books \n"+listBooks, "Available Books", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public void prestamoLibro(String isbn) {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getIsbn().equals(isbn)) {

                if (book.isCheckedOut) {
                    JOptionPane.showMessageDialog(null, "Book with ISBN " + isbn + " Not available.");
                    break;
                }else {
                    book.isCheckedOut = true;
                    JOptionPane.showMessageDialog(null, "Book with ISBN " + isbn + " has been borrowed.");
                    break;
                }

            }else {
                JOptionPane.showMessageDialog(null, "Book with ISBN " + isbn + " It does not exist.");
                break;

            }
        }
    }

    public void returnBooks(String isbn) {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getIsbn().equals(isbn)) {

                book.returnBook();

            }else {
                JOptionPane.showMessageDialog(null, "Book with ISBN " + isbn + " It does not exist.");
                break;

            }
        }
    }


    public void removeBasicLibrary(String isbn) {
        boolean removed = false;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getIsbn().equals(isbn)) {
                books.remove(i);
                JOptionPane.showMessageDialog(null, "Book with ISBN " + isbn + " has been removed.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            JOptionPane.showMessageDialog(null, "No book found with ISBN " + isbn + ".");
        }
    }




}