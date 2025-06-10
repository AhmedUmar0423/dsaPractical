package Tutorial2;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int Key, i;
        int count = 0;
        int desCount = 0;
        int[] A = {3, 4, 1, 2};
        for (int j = 1; j < A.length; j++) {
            Key = A[j];
            i = j -1;
            while (i >= 0 && A[i] > Key) {
                A[i+1] = A[i];
                i = i - 1;
                count++;
            }
            A[i+1] = Key;
        }
        System.out.println("\nSorted Array : ");
        System.out.print("[");
        for(i=0; i<A.length; i++){
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(A[i]);
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Number of shifts : " + count);

        //Descending order
        for (int j = 1; j < A.length; j++) {
            Key = A[j];
            i = j -1;
            while (i >= 0 && A[i] < Key) {
                A[i+1] = A[i];
                i = i - 1;
                desCount++;
            }
            A[i+1] = Key;
        }
        System.out.println("\nSorted Array : ");
        System.out.print("[");
        for(i=0; i<A.length; i++){
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(A[i]);
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Number of shifts : " + desCount);
    }
}
