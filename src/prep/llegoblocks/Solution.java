package prep.llegoblocks;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'legoBlocks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */


    public static int legoBlocks(int height, int width) {
        final int MOD = 1000000007;

        // Step 1: Calculate single row combinations
        long[] rowCombinations = new long[width + 1];
        rowCombinations[0] = 1;
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= 4 && i - j >= 0; j++) {
                rowCombinations[i] += rowCombinations[i - j];
            }
            rowCombinations[i] %= MOD;
        }

        // Step 2: Calculate multiple rows by raising each to the power of height
        for (int i = 0; i <= width; i++) {
            rowCombinations[i] = modularExponentiation(rowCombinations[i], height, MOD);
        }

        // Step 3: Identify and subtract invalid layouts
        long[] solidWalls = new long[width + 1];
        solidWalls[0] = 1;
        for (int i = 1; i <= width; i++) {
            solidWalls[i] = rowCombinations[i];
            for (int j = 1; j < i; j++) {
                solidWalls[i] = (solidWalls[i] - (solidWalls[j] * rowCombinations[i - j]) % MOD + MOD) % MOD;
            }
        }

        return (int) solidWalls[width];
    }

    public static long modularExponentiation(long base, int exponent, int modulus) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exponent /= 2;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(legoBlocks(5,5));
        System.out.println(legoBlocks(2,2));
//        System.out.println(legoBlocks(4,4));
    }
}
