package prep.plusMinus;

import java.io.IOException;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double zero = 0;
        double plus = 0;
        double minus = 0;

        for (var integer : arr) {
            if (integer == 0) {
                zero++;
            } else if (integer > 0) {
                plus++;
            } else if (integer < 0) {
                minus++;
            }
        }

        System.out.println(plus / arr.size());
        System.out.println(minus / arr.size());
        System.out.println(zero / arr.size());
    }

    public static void main(String[] args) throws IOException {
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }
}
