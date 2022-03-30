class Solution {
    public void reverseString(char[] s) {
        int start = 0,end = s.length-1;
        helper(s,start,end);
    }
    public void helper(char[] s,int start,int end){
        if(start >= end) return;
        
        char tmp = s[start];
        s[start] = s[end];
        s[end] =  tmp;
        
        helper(s,start+1,end-1);
        }
}
// Runtime: 2 ms, faster than 34.00% of Java online submissions for Reverse String.
// Memory Usage: 58.8 MB, less than 5.06% of Java online submissions for Reverse String.
