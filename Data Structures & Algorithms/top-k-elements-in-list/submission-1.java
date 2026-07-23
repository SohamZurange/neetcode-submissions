class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
        .entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .map(Map.Entry::getKey)
        .mapToInt(Integer::intValue)
        .limit(k)
        .toArray();
    }
}
