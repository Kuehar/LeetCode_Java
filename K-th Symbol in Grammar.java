class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1) {
            return 0;
        }
        int parent = kthGrammar(n-1, (k+1)/2);
        if(k%2 == 0) {
            return parent == 1? 0 : 1;
        } else {
            return parent;
        }
    }
}

public int kthGrammar(int N, int K) {
	
	// base case
	if(N==1) {
		return 0;
	}
    
	if(K%2==1) {
		return kthGrammar(N-1, (K+1)/2);
	} else {
		return flip(kthGrammar(N-1, K/2));
	}
}

public int flip(int val) {
	return val==0? 1 : 0;
}
