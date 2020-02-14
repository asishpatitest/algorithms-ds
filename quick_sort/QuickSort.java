package quick_sort;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class QuickSort {

    public static void quickSort(int arr[]) {
        if(arr.length == 0 || arr.length == 1) {
            System.out.println("Array is either empty or already sorted");
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int arr[], int low, int high) {
        if(low < high) {
            int partition = partition(arr, low, high);
            sort(arr, low, partition - 1);
            sort(arr, partition + 1, high);
        }
    }

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return (i + 1);
    }
}
