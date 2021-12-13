class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            if(count.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
// Runtime: 21 ms, faster than 59.52% of Java online submissions for First Unique Character in a String.
// Memory Usage: 39.7 MB, less than 43.02% of Java online submissions for First Unique Character in a String.
