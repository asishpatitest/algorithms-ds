package algorithms;

/*
 * Question: https://leetcode.com/problems/trapping-rain-water/
 * This is a O(n) time and O(n) space solution, we can
 * optimise it to O(n) time and O(1) space as well.
 */
public class TrappingRainWater {

    private static int getTrappedWater(int[] height, int length) {
        if (length == 0 || length == 1) {
            return 0;
        }

        int[] left_max = new int[length];
        int[] right_max = new int[length];

        left_max[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        right_max[length-1] = height[length-1];
        for (int i = length-2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }

        int output = 0;

        for (int i = 0; i < length; i++) {
            output = output + Math.min(left_max[i], right_max[i]) - height[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] height_1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getTrappedWater(height_1, height_1.length));

        int[] height_2 = {4,2,0,3,2,5};
        System.out.println(getTrappedWater(height_2, height_2.length));
    }
}
