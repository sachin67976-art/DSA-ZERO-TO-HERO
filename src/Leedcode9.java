
class Leedcode3 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] stack = new int[n];
        int top = -1;
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (top >= 0 &&
                    heights[stack[top]] > currentHeight) {

                int height = heights[stack[top]];
                top--;

                int width;
                if (top == -1) {
                    width = i;
                } else {
                    width = i - stack[top] - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            if (i < n) {
                stack[++top] = i;
            }
        }

        return maxArea;
    }
}
