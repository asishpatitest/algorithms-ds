package merge_sort;

public class MergeSort {

    private static void merge(int array[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= high) {
            if(array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            temp[k] = array[i];
            k++;
            i++;
        }
        while(j <= high) {
            temp[k] = array[j];
            k++;
            j++;
        }
        i = low;
        for (int i1 = 0; i1 < temp.length; i1++) {
            array[i] = temp[i1];
            i++;
        }
    }

    private static void sort(int array[], int low, int high) {
        if(low < high) {
            int mid = (high + low)/2;
            sort(array, low, mid);
            sort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    public static void mergeSort(int array[]) {
        if(array.length == 0 || array.length == 1) {
            System.out.println("Array seems empty or already sorted");
            return;
        }
        sort(array, 0, array.length - 1);
    }
}
