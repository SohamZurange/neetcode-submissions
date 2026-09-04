class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int right=0; right < s.length(); right++){
            char temp = s.charAt(right);

            while(set.contains(temp)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(temp);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
