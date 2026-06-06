package com.ibm;

import java.util.Arrays;

/**
 * Sorting utility functions used by examples and tests.
 *
 * Input: integer array `arr` to be sorted.
 * Output: `arr` is sorted in-place in ascending order after calling `mergeSort` or `quickSort`.
 * Example: arr = [3,1,2] -> SortingUtils.mergeSort(arr) -> arr becomes [1,2,3].
 * Approach: provide standard in-place `mergeSort` and `quickSort` implementations for demonstration and testing.
 *
 * Visual Illustration (arr=[3,1,2]):
 * 1) mergeSort splits into [3] and [1,2]
 * 2) sort [1,2] -> [1,2]; merge [3] and [1,2] -> [1,2,3]
 */
public class SortingUtils {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        mergeSort(arr, 0, arr.length - 1);
    }
    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    private static void merge(int[] arr, int l, int m, int r) {
        int[] temp = Arrays.copyOfRange(arr, l, r+1);
        int i = 0, j = m - l + 1, k = l;
        while (i <= m - l && j <= r - l) arr[k++] = temp[i] <= temp[j] ? temp[i++] : temp[j++];
        while (i <= m - l) arr[k++] = temp[i++];
        while (j <= r - l) arr[k++] = temp[j++];
    }

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
            }
        }
        int tmp = arr[i+1]; arr[i+1] = arr[high]; arr[high] = tmp;
        return i + 1;
    }
}
