package org.ies.tierno.objects.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private String libraryName;
    private Book[] books;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(libraryName, library.libraryName) && Objects.deepEquals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libraryName, Arrays.hashCode(books));
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
