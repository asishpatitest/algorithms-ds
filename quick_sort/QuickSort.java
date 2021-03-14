package quick_sort;

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

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
