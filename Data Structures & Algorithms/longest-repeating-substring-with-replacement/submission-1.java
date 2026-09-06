class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFrequency = 0;
        int windowLength = 0;
        int maxLength = 0;
        int[] arr = new int[26];

        for(int right=0; right<s.length(); right++){
            Character temp = s.charAt(right);
            int index = temp-'A';
            windowLength++;
            arr[index]++;
            maxFrequency = Math.max(maxFrequency, arr[index]);

            int requiredRep = windowLength - maxFrequency;


            while(requiredRep>k){
                int leftCharIndex = s.charAt(left)-'A';
                arr[leftCharIndex]--;
                left++;

                windowLength = right - left + 1;
                requiredRep = windowLength - maxFrequency;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
