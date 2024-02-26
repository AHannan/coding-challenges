package prep.countingsort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            result.add( 0);
        }

        for (int i = 0; i < arr.size(); i++) {
            Integer value = arr.get(i);
            Integer count = result.get(value);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            result.set(value, count);
        }

        return result;

    }

    public static void main(String[] args) throws IOException {
        System.out.println(countingSort(List.of(1,1,2,3,3,5)));
    }
}
