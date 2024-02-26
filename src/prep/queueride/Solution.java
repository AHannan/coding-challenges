package prep.queueride;

import java.io.IOException;
import java.util.List;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int result = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            int actual = q.get(i);
            int expected = i + 1;
            int shift = actual - expected;
            if (shift > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, actual - 2); j < i; j++) {
                if (q.get(j) > actual) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }


    public static void main(String[] args) throws IOException {
//        minimumBribes(List.of(1,2,3,5,4));
//        minimumBribes(List.of(1,5,4,2,3));
        minimumBribes(List.of(1, 2, 5, 3, 7, 8, 6, 4));
    }
}
