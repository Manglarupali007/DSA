import java.util.*;

class Solution {

    public int maximalRectangle(char[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[] height = new int[n];
        int ans = 0;

        for (int i = 0; i < m; i++) {

            // height array banao
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            // LC 84
            ans = Math.max(ans, largestRectangle(height));
        }

        return ans;
    }


    public int largestRectangle(int[] height) {

        Stack<Integer> st = new Stack<>();

        int max = 0;

        for (int i = 0; i <= height.length; i++) {

            int curr;

            if (i == height.length)
                curr = 0;
            else
                curr = height[i];

            while (!st.isEmpty() && curr < height[st.peek()]) {

                int h = height[st.pop()];

                int width;

                if (st.isEmpty())
                    width = i;
                else
                    width = i - st.peek() - 1;

                max = Math.max(max, h * width);
            }

            st.push(i);
        }

        return max;
    }
}