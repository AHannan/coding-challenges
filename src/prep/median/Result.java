package prep.median;

import java.util.Arrays;
import java.util.List;



class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here

        int[] arr2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arr2[i] = arr.get(i);
        }
        Arrays.sort(arr2);

        int center = arr2.length / 2;
        if (arr2.length % 2 == 0) {
            return (arr2[center] + arr2[center + 1]) / 2;
        }

        return (arr2[center]);
    }

    public static void main(String[] args) {
        System.out.println(findMedian(List.of(0, 1, 2, 4, 6, 5, 3)));
    }
}