class Solution {
    public int countPrimes(int n) {
        int primes = 0;
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n+1,true));
        isPrime.set(0,false);
        isPrime.set(1,false); 
        for(int i=2;i<=n;++i){
            if(isPrime.get(i)){
                primes++;
                for(int j=i;j<=n;j+=i){
                    isPrime.set(j,false);
                }
            }
        }
        return primes;
    }
}

/*
WARNING: A command line option has enabled the Security Manager
WARNING: The Security Manager is deprecated and will be removed in a future release
java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
  at line 64, java.base/jdk.internal.util.Preconditions.outOfBounds
  at line 70, java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex
  at line 266, java.base/jdk.internal.util.Preconditions.checkIndex
  at line 359, java.base/java.util.Objects.checkIndex
  at line 441, java.base/java.util.ArrayList.set
  at line 6, Solution.countPrimes
  at line 54, __DriverSolution__.__helper__
  at line 84, __Driver__.main
*/
