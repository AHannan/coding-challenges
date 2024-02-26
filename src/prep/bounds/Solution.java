package prep.bounds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



class Result {

    /*
     * Complete the 'countAnalogousArrays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY consecutiveDifference
     *  2. INTEGER lowerBound
     *  3. INTEGER upperBound
     */
    public static int countAnalogousArrays(List<Integer> consecutiveDifference, int lowerBound, int upperBound) {
        // Implement the counting of analogous arrays here
        int n = consecutiveDifference.size();
        int[][] dp = new int[n + 1][upperBound - lowerBound + 2];
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= upperBound - lowerBound + 1; j++) {
                for (int k = Math.max(0, j - consecutiveDifference.get(i - 1)); k <= Math.min(upperBound - lowerBound, j + consecutiveDifference.get(i - 1)); k++) {
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }

        int totalCount = 0;
        for (int j = 0; j <= upperBound - lowerBound + 1; j++) {
            totalCount += dp[n][j];
        }

        return totalCount;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(countAnalogousArrays(List.of(-2,-1,-2,5), -2, 1));
    }
}
