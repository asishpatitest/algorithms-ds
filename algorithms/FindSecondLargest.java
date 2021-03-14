package algorithms;

/*
 * Find second largest element in an array in O(n) time and O(1) space
 */
public class FindSecondLargest {

    public static void main(String[] args) {
        int[] arr = new int[] {10, 10, 10};
        System.out.println(find2ndLargest(arr)); // 21

        // another case
        int[] arr2 = new int[] {10, 5, 10};
        System.out.println(find2ndLargest(arr2)); // 14
    }

    public static int find2ndLargest(int[] arr) {
        int max;
        int second_max;

        second_max = max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                second_max = max;
                max = j;
            } else if (j != max && j > second_max) {
                second_max = j;
            }
        }
        if (second_max == Integer.MIN_VALUE) {
            return -1;
        } else {
            return second_max;
        }
    }
}
