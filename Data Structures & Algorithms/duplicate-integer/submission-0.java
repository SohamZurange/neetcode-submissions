class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(stringLongEntry -> stringLongEntry.getValue() > 1);
    }
}