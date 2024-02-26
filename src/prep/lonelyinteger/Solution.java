package prep.lonelyinteger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> arr) {
        // Write your code here

        int[] arr2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arr2[i] = arr.get(i);
        }
        Arrays.sort(arr2);

        for (int i = 0; i < arr.size() - 1; i += 2) {
            if (arr2[i] != arr2[i + 1]) {
                return arr2[i];
            }
        }

        return arr2[arr2.length - 1];
    }

    public static void main(String[] args) throws IOException {
        System.out.println(lonelyinteger(List.of(1,2,3,4,3,2,1)));
    }
}
