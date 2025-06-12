package Practical3;

public class StackArray {
    private int[] arrayStack;
    private int top;
    private int maxSize;

    public StackArray(int size) {
        arrayStack = new int[size];
        top = -1;
        maxSize = size;
    }

    public void push(int item) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
        } else {
            arrayStack[++top] = item;
        }
    }

    public int pop() {
        if (top == -1) {
            return -99;
        } else {
            return arrayStack[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            return -99;
        } else {
            return arrayStack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void display() {
        System.out.print("Stack elements: ");
        for (int i=0; i<=top; i++) {
            System.out.print(arrayStack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(5);
        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        stackArray.display();

        System.out.println("Peek: " + stackArray.peek());
        System.out.println("Popped: " + stackArray.pop());

        stackArray.display();


        System.out.println("Is stack empty? " + stackArray.isEmpty());
        System.out.println("Is stack full? " + stackArray.isFull());
    }
}
