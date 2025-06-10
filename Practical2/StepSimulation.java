package Tutorial2;

import java.util.Scanner;

public class StepSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Key, i;

        System.out.print("Enter the number of elements : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the elements : ");
        for (i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Initial list : ");
        System.out.print("[");
        for(i=0; i<arr.length; i++){
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
        System.out.println();

        // arranging in ascending order using insertion sort
        for (int j = 1; j < arr.length; j++) {
            Key = arr[j];
            i = j -1;
            while (i >= 0 && arr[i] > Key) {
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i+1] = Key;

            // printing step by step
            System.out.print("Step " + j + " : ");
            System.out.print("[");
            for(i=0; i<arr.length; i++){
                if(i > 0){
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
