package Books;

public class Store {
    public static void main(String[] args) {
        Book b1 = new Book(1,"Dance With Dragons","George R.R. Martin");
        System.out.println(b1.toString());
        b1.setBookReview(1,"The future of the Seven Kingdoms hangs in the balance",5);
        b1.setBookReview(2,"Nice book",4);
        System.out.println(b1.getBookReviews());
    }
}
