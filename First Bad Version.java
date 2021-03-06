/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1,right=n;
        while(left<right){
            int mid = left+ (right-left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}

// Runtime: 27 ms, faster than 23.49% of Java online submissions for First Bad Version.
// Memory Usage: 40.5 MB, less than 28.24% of Java online submissions for First Bad Version.
