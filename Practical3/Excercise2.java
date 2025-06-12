package Practical3;

import Tutorial3.Question4;

import java.util.Scanner;

public class Excercise2 {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Excercise2(int size) {
        maxSize = size;
        stackArray = new char[size];
        top = -1;
    }

    public void push(char value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
        } else {
            stackArray[++top] = value;
        }
    }

    public char pop() {
        if (top == -1) {
            throw new RuntimeException("Stack underflow");
        } else {
            return stackArray[top--];
        }
    }

    public char peek() {
        if (top == -1) {
            throw new RuntimeException("Stack underflow");
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        Excercise2 reverseStack = new Excercise2(s.length());
        for (int i = 0; i < s.length(); i++) {
            reverseStack.push(s.charAt(i));
        }
        System.out.print("Reversed String : ");
        while(!reverseStack.isEmpty()) {
            System.out.print(reverseStack.pop());
        }
    }
}
