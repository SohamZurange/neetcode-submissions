class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0;
        int left = 0;
        int right = heights.length -1;

        while(left < right){
            int minHeight = Math.min(heights[left], heights[right]);
            int volume = minHeight * (right - left);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
            maxVolume = Math.max(maxVolume, volume);
        }
        return maxVolume;
    }
}
