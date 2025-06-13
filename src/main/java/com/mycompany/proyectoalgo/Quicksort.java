/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalgo;

/**
 *
 * @author mayorga
 */
public class Quicksort {
    public static void order(Department[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private static void quicksort(Department[] arr, int left, int right) {
        if (left >= right) return;

        int pivotIndex = medianOfThree(arr, left, right);
        Department pivot = arr[pivotIndex];
        swap(arr, pivotIndex, right); // move pivot to end

        int partitionIndex = partition(arr, left, right, pivot);
        quicksort(arr, left, partitionIndex - 1);
        quicksort(arr, partitionIndex + 1, right);
    }

    private static int partition(Department[] arr, int left, int right, Department pivot) {
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right); // move pivot to its final place
        return i;
    }

    private static int medianOfThree(Department[] arr, int left, int right) {
        int mid = (left + right) / 2;
        Department a = arr[left];
        Department b = arr[mid];
        Department c = arr[right];

        if (a.compareTo(b) > 0) swap(arr, left, mid);
        if (arr[left].compareTo(c) > 0) swap(arr, left, right);
        if (arr[mid].compareTo(c) > 0) swap(arr, mid, right);

        return mid;
    }

    private static void swap(Department[] arr, int i, int j) {
        Department temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

