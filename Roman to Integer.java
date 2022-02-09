class Solution {
    // 文字と数値の対応表を作る
    static Map<String,Integer> map = new HashMap<>();
    static{
    map.put("I",1);
    map.put("V",5);
    map.put("X",10);
    map.put("L",50);
    map.put("C",100);
    map.put("D",500);
    map.put("M",1000);   
    }
    
    public int romanToInt(String s) {  
        int sum=0,i=0;
        while(i<s.length()){
            String currentSymbol = s.substring(i,i+1);
            int currentValue = map.get(currentSymbol),nextValue=0;
            if(i+1 < s.length()){
                String nextSymbol = s.substring(i+1,i+2);
                nextValue = map.get(nextSymbol);
            }
            if(currentValue<nextValue){
                sum += (nextValue-currentValue);
                i+=2;
            }else{
                sum += currentValue;
                i += 1;
            }
        }
        return sum;
    }
}
// Runtime: 10 ms, faster than 41.38% of Java online submissions for Roman to Integer.
// Memory Usage: 47.4 MB, less than 7.58% of Java online submissions for Roman to Integer.
