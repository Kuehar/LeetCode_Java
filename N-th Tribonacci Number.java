class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0; 
        }else if(n==1 || n==2){
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        int n3 = 2;
        for(int i=0;i<n-3;i++){
            int temp = n3;
            n3 = n1+n2+n3;
            n1 = n2;
            n2 = temp;
        }
        return n3;
    }
}
