package Practical5.Excercise2;

public class Link1 {
    int bookId;
    String bookTitle;
    int copies;
    Link1 next;

    public Link1(int bookId, String bookTitle, int copies) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.copies = copies;
        this.next = null;
    }

    public void displayLink() {
        System.out.print("Book ID: " + this.bookId + ", Book Title: " + this.bookTitle + ", Copies: " + this.copies + "\n");
    }
}
