package ArrayProblems;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 2, 1, 3, 4, 2};
        int[] temp = new int[a.length];
        int j = 0;

// Sort the array
        Arrays.sort(a);

// Compare each element with the next element to find duplicates
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

// Add the last element to the temporary array
        temp[j++] = a[a.length - 1];

// Copy the elements from the temporary array back to the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

// Print the array without duplicates
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
