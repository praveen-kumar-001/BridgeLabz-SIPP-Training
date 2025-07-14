package com.DSA.SortingAlgorithms;
import java.util.Scanner;
public class HeapSort {
    public static void heapify(int[] arr, int n, int i) {
        int largest = i, l = 2 * i + 1, r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            int swap = arr[i]; arr[i] = arr[largest]; arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0]; arr[0] = arr[i]; arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();
        int[] salaries = new int[n];
        System.out.println("Enter expected salaries:");
        for (int i = 0; i < n; i++) salaries[i] = sc.nextInt();
        heapSort(salaries);
        System.out.println("Sorted Salaries:");
        for (int salary : salaries) System.out.print(salary + " ");
    }
}
