class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int mid = stack.pop();
                if (stack.isEmpty()) break;
                int left = stack.peek();
                int right = i;
                int h = Math.min(height[left], height[right]) - height[mid];
                int w = right - left - 1;
                sum += h * w;
            }
            stack.push(i);
        }
        return sum;
    }
}
