package prep.diagonaldiff;

import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int left = 0;
        int leftPosition = 0;
        int right = 0;
        int rightPosition = arr.get(0).size() - 1;

        for (List<Integer> integers : arr) {
            left += integers.get(leftPosition);
            leftPosition++;
            right += integers.get(rightPosition);
            rightPosition--;
        }

        int result = left - right;
        return result < 0 ? result * -1 : result;

    }

    public static void main(String[] args) {
        System.out.println(diagonalDifference(List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12))));
    }
}
