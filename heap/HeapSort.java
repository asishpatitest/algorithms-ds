package heap;

public class HeapSort {

    private static void heapify(int array[], int index, int high) {
        int largest = index;
        int left = 2*index + 1;
        int right = 2*index + 2;

        if(left <= high && array[largest] < array[left]) {
            largest = left;
        }

        if(right <= high && array[largest] < array[right]) {
            largest = right;
        }

        if(largest != index) {
            swap(array, largest, index);
            heapify(array, largest, high);
        }
    }

    private static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void sort(int array[], int low, int high) {
        for (int i = (high/2); i >= 0; i--) {
            heapify(array, i, high);
        }

        for(int i = high; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, 0, i - 1);
        }
    }

    public static void headSort(int array[]) {
        if(array.length == 0 || array.length == 1) {
            System.out.println("Array seems empty or already sorted");
            return;
        }
        sort(array, 0, array.length - 1);
    }
}
