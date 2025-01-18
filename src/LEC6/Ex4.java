package LEC6;

import java.util.Scanner;
import java.util.HashSet;

public class Ex4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            HashSet<Integer> uniqueElements = new HashSet<>();
            for (int i = 0; i < size; i++) {
                uniqueElements.add(arr[i]);
            }
            Integer[] result = uniqueElements.toArray(new Integer[0]);
            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            scanner.close();
        }
    }
