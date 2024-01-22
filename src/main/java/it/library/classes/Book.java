package main.java.it.library.classes;

import main.java.it.library.superClass.LibraryItem;

public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(String title, int publicationYear, int numPages, String author, String genre) {
        super(title, publicationYear, numPages);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + getIsbnCode() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", year='" + getPublicationYear() + '\'' +
                ", pages='" + getNumPages() + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}' + "\n";
    }
}
