package Practical5.DoublyList;

public class DoublyLinkedList {
    private DoublyLink first;
    private DoublyLink last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    // Check if empty
    public boolean isEmpty() {
        return first == null;
    }

    // Insert at the beginning
    public void insertFirst(int data) {
        DoublyLink newLink = new DoublyLink(data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.prev = newLink;
            newLink.next = first;
        }
        first = newLink;
    }

    // Insert at the end
    public void insertLast(int data) {
        DoublyLink newLink = new DoublyLink(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.prev = last;
        }
        last = newLink;
    }

    // Delete a specific node (i)
    public void deleteNode(DoublyLink p0) {
        if (p0 == null) return;

        if (p0.prev != null) {
            p0.prev.next = p0.next;
        } else {
            // p0 is the first node
            first = p0.next;
        }

        if (p0.next != null) {
            p0.next.prev = p0.prev;
        } else {
            // p0 is the last node
            last = p0.prev;
        }

        System.out.println("Deleted node with data: " + p0.data);
    }

    // Delete the first node (ii)
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Deleted first node: " + first.data);
        if (first.next == null) {
            // Only one element
            first = null;
            last = null;
        } else {
            first = first.next;
            first.prev = null;
        }
    }

    // Display forward
    public void displayForward() {
        System.out.print("List (first --> last): ");
        DoublyLink current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    // Find a node by value (for use in deleteNode)
    public DoublyLink find(int value) {
        DoublyLink current = first;
        while (current != null && current.data != value) {
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert nodes as per example: 45 <-> 65 <-> 11 <-> 87
        list.insertLast(45);
        list.insertLast(65);
        list.insertLast(11); // P0
        list.insertLast(87);

        System.out.println("Original List:");
        list.displayForward();

        // (i) Delete node P0 (with value 11)
        DoublyLink p0 = list.find(11);
        list.deleteNode(p0);
        System.out.println("After deleting node 11 (P0):");
        list.displayForward();

        // (ii) Delete the first node
        list.deleteFirst();
        System.out.println("After deleting first node:");
        list.displayForward();

        // (iii) Insert new node at the beginning
        list.insertFirst(99);
        System.out.println("After inserting 99 at the beginning:");
        list.displayForward();
    }
}
