class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set =
                Arrays.stream(nums)
                        .mapToObj(value -> (Integer) value)
                        .collect(Collectors.toSet());

        int longest = 0;

        for(int num: set){
            if(!set.contains(num - 1)){
                int current = num;
                int currentLong = 1;

                while(set.contains(current+1)){
                    current++;
                    currentLong++;
                }

                longest = Math.max(currentLong, longest);
            }
        }
        return longest;
    }
}
