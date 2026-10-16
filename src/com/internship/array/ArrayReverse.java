package com.internship.array;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than zero.");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        scanner.close();
    }
}
