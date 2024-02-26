package prep.sumofnums;

import java.io.IOException;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Calculate the super digit of n
        long digitSum = sumOfDigits(n) * k;
        return recursiveSuperDigit(digitSum);
    }

    private static long sumOfDigits(String n) {
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }
        return sum;
    }

    private static int recursiveSuperDigit(long num) {
        if (num < 10) {
            return (int) num;
        }
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return recursiveSuperDigit(sum);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(superDigit("9875", 4));
    }
}
