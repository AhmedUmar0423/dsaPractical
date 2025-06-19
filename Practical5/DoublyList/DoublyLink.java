package Practical5.DoublyList;

public class DoublyLink {
    int data;
    DoublyLink next;
    DoublyLink prev;

    public DoublyLink(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void displayLink() {
        System.out.print(data + " ");
    }
}
