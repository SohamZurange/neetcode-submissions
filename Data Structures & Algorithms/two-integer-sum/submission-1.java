class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0;
        int j = 1;

        while (i != j){
            int a = nums[i];
            int b = nums[j];

            if(a+b == target){
                return new int[]{i, j};
            }

            if (j != nums.length-1){
                j++;
            }
            else{
                i++;
                j=i+1;
            }
        }
    return new int[]{i, j};
    }
}
