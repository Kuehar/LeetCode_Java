class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int result[] = new int[length];
        int maxVal = -1;
        for(int i = length-1; i >=0; i--) {
            result[i] = maxVal;
            maxVal = Math.max(arr[i],maxVal);
                }
        return result;
    }
}
