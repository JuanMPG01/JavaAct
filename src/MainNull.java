import practice.hol.Book;
import practice.hol.Library;

import javax.swing.*;

public class MainNull {

    public static void main(String[] args) {

        Library library = new Library();
        boolean running = true;
        String check = "";

        while (running) {
            String option = JOptionPane.showInputDialog(null,
                    "GESTIÓN DE LIBROS\n\n" +
                            "1. Agregar libro\n" +
                            "2. Ver libros disponibles\n" +
                            "3. Eliminar libro por ISBN\n" +
                            "4. Pedir prestamos\n\n"+
                            "5. Devolver libro\n\n"+
                            "6. Salir\n\n" +

                            "Elige una opción:");

            if (option == null) continue;

            switch (option) {
                case "1":
                    String title = JOptionPane.showInputDialog("Título del libro:");
                    String author = JOptionPane.showInputDialog("Autor:");
                    String isbn = JOptionPane.showInputDialog("ISBN:");
                    boolean isCheckedOut = false;

                    if (isCheckedOut == true) {
                        check = "No disponible";
                    } else {
                        check = "Disponible";
                    }

                    Book newBook = new Book(title, author, isbn, isCheckedOut);

                    library.addBasicLibrary(newBook, check);
                    break;

                case "2":
                    library.listaAllAvailablebooks();
                    break;

                case "3":
                    String isbnToRemove = JOptionPane.showInputDialog("Introduce el ISBN del libro a eliminar:");
                    library.removeBasicLibrary(isbnToRemove);
                    break;

                case "4":
                    String bookIsbn= JOptionPane.showInputDialog("Ingrese el ISBN del libro que sea pedir");
                    library.returnBooks(bookIsbn);
                    break;

                case "5":
                    String book= JOptionPane.showInputDialog("Ingrese el ISBN del libro que sea pedir");
                    library.prestamoLibro(book);

                    break;

                case "6":
                    running = false;
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;



                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
            }
        }
    }
}

