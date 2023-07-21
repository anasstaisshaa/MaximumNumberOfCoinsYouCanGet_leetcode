import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length / 3;
        int sum = 0;
        int index = n * 3 - 2;

        for (int i = 0; i < n; i++) {
            sum += piles[index];
            index -= 2;
        }

        return sum;
    }
}

