package Practical5.Excercise1;

public class Link {
    int id;
    int marks;
    Link next;

    public Link(int id, int marks) {
        this.id = id;
        this.marks = marks;
        this.next = null;
    }

    public void displayLink() {
        System.out.println("ID: " + id + "  , Marks: " + marks);
    }
}
