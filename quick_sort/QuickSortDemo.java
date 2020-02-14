package quick_sort;

public class QuickSortDemo {

    public static void main(String args[]) {
        int array[] = {12, 11, 13, 5, 6, 7, 1, 3, 7};
        // int array[] = {12};
        // int array[] = {};
        // int array[] = {12, 12, 12, 12, 12};
        QuickSort.quickSort(array);
        printArray(array);
    }

    private static void printArray(int array[]) {
        System.out.println("Array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
