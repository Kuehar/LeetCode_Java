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

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(),ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int j=0,i=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
            i = Math.max(map.get(s.charAt(j)),i);
            }
        ans = Math.max(ans,j-i+1);
        map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
// Runtime: 7 ms, faster than 73.62% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 45 MB, less than 29.72% of Java online submissions for Longest Substring Without Repeating Characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(checkRepitition(s,i,j)){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    
    private boolean checkRepitition(String s,int start,int end){
        int[] chars = new int[128];
        for(int i = start;i<=end;i++){
            char c = s.charAt(i);
            chars[c]++;
            if(chars[c] > 1){
                return false;
            }
        }
        return true;
    }
}
// Time Limit Exceeded O(N^3)
