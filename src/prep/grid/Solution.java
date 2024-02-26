package prep.grid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // order each String
        List<char[]> orderedGrid = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            System.out.print(grid.get(i) + "-");
            orderedGrid.add(reorder(grid.get(i)));
            System.out.println(orderedGrid.get(i));
        }

        for (int column = 0; column < orderedGrid.get(0).length; column++) {
            for (int row = 1; row < orderedGrid.size(); row++) {
                char preChar = orderedGrid.get(row - 1)[column];
                char nextChar = orderedGrid.get(row)[column];
                if (preChar > nextChar) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    private static char[] reorder(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return charArray;
    }

    public static void main(String[] args) {
        System.out.println(gridChallenge(List.of("cba", "dae", "fge")));
    }
}
