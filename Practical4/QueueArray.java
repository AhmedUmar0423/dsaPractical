package Practical4;

public class QueueArray {
    private int maxSize;
    private int[] qArray;
    private int front;
    private int rear;
    private int count;

    public QueueArray(int maxSize) {
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
        return rear == maxSize - 1;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            qArray[++rear] = item;
            count++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            count--;
            return qArray[front++];
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
        QueueArray qa = new QueueArray(3);
        qa.insert(10);
        qa.insert(20);
        qa.insert(30);
        qa.display();
        System.out.println("Removed : " + qa.remove());
        qa.display();
        System.out.println("Front element : " + qa.peek());
        System.out.println("Queue Count : " + qa.getCount());
    }
}
