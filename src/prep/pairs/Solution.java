package prep.pairs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Result {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
        int result = 0;
        Set<Integer> set = new HashSet<>(arr);
        for (int num : arr) {
            if (set.contains(num + k)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pairs(2, List.of(1,2,3,4,5)));
    }
}
