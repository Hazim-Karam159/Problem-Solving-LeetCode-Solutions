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
        int left = 0, right = n;

        while(left <= right){
            int mid = left + (right - left) / 2;   // because max value for 2,147,483,647  (وهي قيمة Integer.MAX_VALUE)

            int g = guess(mid);
            if(g == 0) return mid;
            else if (g < 0 ) right = mid - 1;
            else left = mid + 1;
        }
        return -1;


    }
}