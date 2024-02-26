package prep.repeatedstring;

class RepeatedString {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        int length = s.length();
        long repeatedWords = n / length;
        int recurring = 0;
        long remaining = n - repeatedWords * length;
        int remainingAs = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == 'a') {
                recurring++;
                if (i < remaining) {
                    remainingAs = recurring;
                }
            }
        }

        return  recurring * repeatedWords + remainingAs;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("a", Long.parseLong("1000000000000")));
    }

}
