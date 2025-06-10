package Practical1;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Max number is : " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Max number is : " + num2);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println("Max number is : " + num3);
        }
    }
}
