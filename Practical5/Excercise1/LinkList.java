package Practical5.Excercise1;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, int marks){
        Link newLink = new Link(id, marks);
        newLink.next = first;
        first = newLink;
    }

    public void insertAfter(int key, int id, int marks){
        Link current = first;
        while (current != null && current.id != key) {
            current = current.next;
        }
        if (current != null) {
            Link newLink = new Link(id, marks);
            newLink.next = current.next;
            current.next = newLink;
        } else {
            System.out.println("Link not found");
        }
    }

    public Link find(int key){
        Link current = first;
        while (current != null) {
            if (current.id == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link deleteFirst(){
        if (first == null) {
            return null;
        }
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link deleteAfter(int key){
        if (first == null) {
            return null;
        }
        if (first.id == key) {
            Link temp = first;
            first = first.next;
            return temp;
        }

        Link previous = first;
        Link current = first.next;

        while (current != null && current.id != key) {
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
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(101, 90);
        list.insertAfter(101, 102, 85);
        list.insertAfter(102, 103, 75);

        System.out.println();

        System.out.println("List after insertions:");
        list.displayList();

        System.out.println();

        list.deleteAfter(102);
        System.out.println("List after deleting ID 102:");
        list.displayList();

        System.out.println();

        list.deleteFirst();
        System.out.println("List after deleting first element:");
        list.displayList();
    }
}
