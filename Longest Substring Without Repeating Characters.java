class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int left = 0,right=0,ans=0;
        while(right<s.length()){
            char c = s.charAt(right);
            chars[c]++;
            
            while(chars[c]>1){
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
// Runtime: 6 ms, faster than 79.40% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 43.6 MB, less than 41.98% of Java online submissions for Longest Substring Without Repeating Characters.
