package DigitalLibraryManagement;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void addBook(String title, String author) {
        books.add(new Book(nextId++, title, author));
        System.out.println("Book added successfully.");
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.id == id);
        System.out.println("Book removed.");
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        for (Book b : books) System.out.println(b);
    }

    public Book findBook(int id) {
        for (Book b : books) {
            if (b.id == id) return b;
        }
        return null;
    }

    public void issueBook(int id) {
        Book book = findBook(id);
        if (book != null && !book.isIssued) {
            book.isIssued = true;
            System.out.println("Book issued.");
        } else {
            System.out.println("Book not found or already issued.");
        }
    }

    public void returnBook(int id) {
        Book book = findBook(id);
        if (book != null && book.isIssued) {
            book.isIssued = false;
            System.out.println("Book returned.");
        } else {
            System.out.println("Invalid return.");
        }
    }
}
