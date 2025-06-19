package Practical5.Excercise2;

import java.util.Scanner;

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

        public void deleteAllLinks() {
            while(first.next != null) {
                Link1 deleted = deleteFirst();
                if (deleted != null) {
                    System.out.println("Deleted Book ID: " + deleted.bookId);
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedList list = new LinkedList();
            System.out.print("Enter number of books to insert using insertFirst: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 0; i < n; i++) {
                System.out.println("\nBook " + (i + 1) + ":");
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Number of Copies: ");
                int copies = sc.nextInt();
                sc.nextLine(); // consume newline
                list.insertFirst(id, title, copies);
            }

            System.out.println("\nList after insertions:");
            list.displayList();

            System.out.print("\nEnter an ID to insert a new book after: ");
            int afterId = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter New Book ID: ");
            int newId = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter New Book Title: ");
            String newTitle = sc.nextLine();
            System.out.print("Enter Number of Copies: ");
            int newCopies = sc.nextInt();
            list.insertAfter(afterId, newId, newTitle, newCopies);

            System.out.println("\nList after insertAfter:");
            list.displayList();

            System.out.print("\nEnter a Book ID to delete: ");
            int delId = sc.nextInt();
            list.delete(delId);

            System.out.println("\nList after deletion:");
            list.displayList();

            System.out.println("\nDeleting all books:");
            list.deleteAllLinks();
            System.out.println("Final list:");
            list.displayList();

        }
    }
