package Books;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String name;
    private String author;
    private final ArrayList<Review> bookReview = new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return String.format("Book id-[%d], Book Name-[%s],Author-[%s]", id, name, author);
    }

    public void setBookReview(int id, String description, int rating) {
        bookReview.add(new Review(id, description, rating));
    }

    public String getBookReviews() {
        return bookReview.toString();
    }
}
