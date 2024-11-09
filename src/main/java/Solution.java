public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int guess = guess(mid);

            if (guess == 0) return mid;
            if (guess > 0) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}