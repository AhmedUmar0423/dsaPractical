package Practical4;

import java.util.Scanner;

public class CicrcularQue {
    private int maxSize;
    private int[] qArray;
    private int front;
    private int rear;
    private int count;

    public CicrcularQue(int maxSize) {
        this.maxSize = maxSize;
        qArray = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            qArray[++rear] = item;
            count++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int temp = qArray[front++];
            if (front == maxSize - 1) {
                front = 0;
            }
            count--;
            return temp;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return qArray[front];
        }
    }

    public int getCount() {
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements : ");
            for (int i = 0; i < count; i++) {
                System.out.print(qArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue : ");
        int qSize = sc.nextInt();
        CicrcularQue cQ = new CicrcularQue(qSize);
        while (!cQ.isFull()) {
            System.out.print("Enter element to insert : ");
            int item = sc.nextInt();
            cQ.insert(item);
        }
        System.out.print("Enter new element to insert : ");
        int nitem = sc.nextInt();
        cQ.insert(nitem);
        System.out.println("Removing : " + cQ.remove());
        System.out.print("Enter new element to insert : ");
        int nitem1 = sc.nextInt();
        cQ.insert(nitem1);
        System.out.print("Enter another element to insert : ");
        int nitem2 = sc.nextInt();
        cQ.insert(nitem2);
    }
}

