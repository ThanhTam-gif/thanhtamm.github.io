package LEC6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    public static class ReverseArray {

        public static void reverseArray(int[] array) {
            int left = 0;
            int right = array.length - 1;
            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(array);
        ReverseArray.reverseArray(array);

        System.out.println("Reversed array:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}