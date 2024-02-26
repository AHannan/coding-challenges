package prep.minmax;

import java.io.IOException;
import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Integer min = 0;
        Integer max = 0;

        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (j != i) {
                    sum += arr.get(j);
                }

                if (j == arr.size() - 1) {
                    if (min == 0 || sum < min) {
                        min = sum;
                    }

                    if (max == 0 || sum > max) {
                        max = sum;
                    }
                }
            }

        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
//        miniMaxSum(List.of(1, 2, 3, 4, 5));
        miniMaxSum(List.of(1, 2, 3, 4, 5));
    }
}
