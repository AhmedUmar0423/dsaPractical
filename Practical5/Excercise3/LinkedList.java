
package Practical5.Excercise3;

public class LinkedList {
    private Link1 first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int bookId, String bookTitle, int copies) {
        Link1 newLink = new Link1(bookId, bookTitle, copies);
        newLink.next = first;
        first = newLink;
    }

    public void insertAfter(int key, int bookId, String bookTitle, int copies) {
        Link1 current = first;
        while (current != null && current.bookId != key) {
            current = current.next;
        }
        if (current != null) {
            Link1 newLink = new Link1(bookId, bookTitle, copies);
            newLink.next = current.next;
            current.next = newLink;
        } else {
            System.out.println("Link not found");
        }
    }

    public Link1 find(int key){
        Link1 current = first;
        while (current != null) {
            if (current.bookId == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link1 deleteFirst(){
        if (first == null) {
            return null;
        }
        Link1 temp = first;
        first = first.next;
        return temp;
    }

    public Link1 delete(int key){
        if (first == null) {
            return null;
        }
        if (first.bookId == key) {
            Link1 temp = first;
            first = first.next;
            return temp;
        }

        Link1 previous = first;
        Link1 current = first.next;

        while (current != null && current.bookId != key) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
            return current;
        } else {
            System.out.println("Link not found");
            return null;
        }
    }

    public void displayList() {
        Link1 current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1, "Hello", 15);
        list.insertAfter(1,2, "World", 10);
        list.insertAfter(2, 3, "Welcome", 20);

        System.out.println();

        System.out.println("List after insertions:");
        list.displayList();

        System.out.println();

        list.delete(2);
        System.out.println("List after deleting ID 2:");
        list.displayList();

        System.out.println();

        list.deleteFirst();
        System.out.println("List after deleting first element:");
        list.displayList();
    }
}
