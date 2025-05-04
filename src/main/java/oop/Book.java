package oop;

class BookData {
    String title;
    String author;

    BookData(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "Title: " + title + "| Author: " + author;
    }
}

public class Book {
    public static BookData create(String title, String author) {
        return new BookData(title, author);
    }

    public static void main(String [] args) {
        System.out.println(create("The Fifth Season", "N. K. Jemisin"));
        System.out.println(create("A Sorcerer of The Wildeeps", "K. Ashante Williams"));
        System.out.println(create("A Master of Djinn", "P. Djelli Clark"));
    }
}
