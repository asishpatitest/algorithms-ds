package algorithms;

import java.util.Stack;

/*
 * Find next greater element for every element in a circular array
 * in O(n) time and O(n) space
 */
public class NextGreaterElement {

    private static int[] printNGE(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        int i = 0;

        while(i < 2*n) {
            while(!stack.empty() && arr[stack.peek()] < arr[i%n]) {
                res[stack.peek()] = arr[i%n];
                stack.pop();
            }
            stack.push(i%n);
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 10, -2, 5, 8 };
        int N = arr.length;

        int[] x = printNGE(arr, N);
        for (int j : x) {
            System.out.println(j);
        }
    }
}
