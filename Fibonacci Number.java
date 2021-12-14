class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
                  
        int[] cache = new int[N + 1];
        cache[1] = 1;
        for (int i = 2; i <= N; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
    
        return cache[N];
    }
}
// Runtime: 21 ms, faster than 59.52% of Java online submissions for First Unique Character in a String.
// Memory Usage: 39.7 MB, less than 43.02% of Java online submissions for First Unique Character in a String.

public class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }
}
// Runtime: 7 ms, faster than 27.50% of Java online submissions for Fibonacci Number.O(N)
// Memory Usage: 35.4 MB, less than 98.02% of Java online submissions for Fibonacci Number. 
