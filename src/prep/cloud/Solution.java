package prep.cloud;

import java.io.IOException;
import java.util.List;

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jump = 0;

        for (int i = 1; i < c.size(); i++) {
            if (isCumulus(c, i)) {
                jump++;

            } else {
                jump++;
            }

            System.out.println("index: " + i + " Jumps: " + jump);
        }
        
        return jump;
    }

    private static boolean isCumulus(List<Integer> c, int i) {
        return c.get(i) == 0;
    }

    private static boolean isNextThunder(List<Integer> c, int i) {
        return hasNext(c, i) && c.get(i + 1) == 1;
    }

    private static boolean hasNext(List<Integer> c, int i) {
        return i + 1 < c.size();
    }

    private static boolean wasPreviousCumlus(List<Integer> c, int i) {
        return c.get(i - 1) == 0;
    }

    private static boolean isNextCumlus(List<Integer> c, int i) {
        return hasNext(c, i) && c.get(i + 1) == 0;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(jumpingOnClouds(List.of(0,0,1,0,0,1,0)));
    }

}
