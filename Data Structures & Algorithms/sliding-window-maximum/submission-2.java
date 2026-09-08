class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> arrayList = new ArrayList<>();

        int windowMax = Integer.MIN_VALUE;
        int left = 0;
        for(int right=0; right<nums.length; right++){
            int value = nums[right];
            windowMax = Math.max(windowMax, value);

            if(right - left + 1 == k){
                arrayList.add(windowMax);

                int leftValue = nums[left];
                left++;
                if(leftValue == windowMax){
                    windowMax = Integer.MIN_VALUE;
                    for(int i=left; i<= right; i++){
                        windowMax = Math.max(windowMax, nums[i]);
                    }
                }
            }

        } 
        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
