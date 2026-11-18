package array;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 Array Elements:");

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Displaying array elements
        System.out.println("\nArray Elements are:");

        for (int num : arr) {
            System.out.println(num);
        }

        sc.close();
    }
}