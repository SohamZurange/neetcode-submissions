class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Array = new int[26];
        for(char c: s1.toCharArray()){
            s1Array[c - 'a']++;
        }

        int[] s2Array = new int[26];
        int k = s1.length();
        int left = 0;
        
        for(int right=0; right<s2.length(); right++){
            s2Array[s2.charAt(right)-'a']++;

            if(right - left + 1 == k){
                if(Arrays.equals(s1Array, s2Array)){
                    return true;
                }
                s2Array[s2.charAt(left)-'a']--;
                left++;
            }
        }
        return false;
    }
}
