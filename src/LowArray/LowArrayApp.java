package LowArray;

import java.util.Scanner;

public class LowArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create lowArray
        System.out.print("Enter maximum size of the array: ");
        int maxSize = sc.nextInt();
        lowArray arr = new lowArray(maxSize);

        int nElems = 0;   // number of elements currently in array

        // Step 2: Input number of elements
        System.out.print("Enter number of elements you want to insert: ");
        nElems = sc.nextInt();

        // Step 3: Insert elements
        System.out.println("Enter " + nElems + " elements:");
        for (int i = 0; i < nElems; i++) {
            int value = sc.nextInt();
            arr.setElem(i, value);
        }

        // Step 4: Display elements
        System.out.println("\nInitial array contents:");
        for (int j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();

        // Step 5: Search for a value
        System.out.print("\nEnter a value to search: ");
        int searchKey = sc.nextInt();
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr.getElem(j) == searchKey) {
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Result: Can't find " + searchKey);
        } else {
            System.out.println("Result: Found " + searchKey + " at index " + j);
        }

        // Step 6: Delete a value
        System.out.print("\nEnter a value to delete: ");
        int deleteValue = sc.nextInt();
        for (j = 0; j < nElems; j++) {
            if (arr.getElem(j) == deleteValue) {
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Value " + deleteValue + " not found. Nothing deleted.");
        } else {
            for (int k = j; k < nElems - 1; k++) { // shift elements
                arr.setElem(k, arr.getElem(k + 1));
            }
            nElems--; // reduce size
            System.out.println("Value " + deleteValue + " deleted.");
        }

        // Step 7: Display final array
        System.out.println("\nFinal array contents:");
        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();

        sc.close();
    }
}