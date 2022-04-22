/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=1,high=n;
        while(low<=high){
            int mid = low+(high-low)/2;
            int res = guess(mid);
            if(res == 0){
                return mid;
            }else if(res < 0){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return  -1;
        
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
// Memory Usage: 40.9 MB, less than 45.10% of Java online submissions for Guess Number Higher or Lower.
