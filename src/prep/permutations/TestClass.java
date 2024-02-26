package prep.permutations;

class TestClass {
    public static void main(String[] args) {
        permutation(10, 3);
//        permutation(8, 3);
//        permutation(2, 1);
//        permutation(3, 1);
//        permutation(4, 5);
//        permutation(750, 466);
    }

    static void permutation(int n, int m)
    {
        int dp[][]=new int[n+2][n+2];

        dp[0][n + 1] = 1;

        // Filling the table. k is for numbers
        // greater than or equal that are allowed.
        for (int k = n; k >= m; k--) {

            // i is for sum
            for (int i = 0; i <= n; i++) {

                // initializing dp[i][k] to number
                // ways to get sum using numbers
                // greater than or equal k+1
                dp[i][k] = dp[i][k + 1];

                // if i > k
                if (i - k >= 0)
                    dp[i][k] = (dp[i][k] + dp[i - k][k]);
            }
        }

        System.out.println(dp[n][m]);
    }

}
