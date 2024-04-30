package ESTUDOS.interviews;

import java.util.*;
public class HistogramArea {

    public static int HistogramArea(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty() || arr[i] >= arr[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = arr[top] * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? arr.length : arr.length - stack.peek() - 1;
            int area = arr[top] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{6, 3, 1, 4, 12, 4};
        int[] arr2 = new int[]{5, 6, 7, 4, 1};
        System.out.println(HistogramArea(arr1)); // Output: 12
        System.out.println(HistogramArea(arr2)); // Output: 16
    }
}
