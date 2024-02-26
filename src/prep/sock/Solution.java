package prep.sock;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

class Sock {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        int sockPairs = 0;
        var socks = new HashMap<Integer, Integer>();
        for (Integer sock : ar) {

            int count = 1;
            if (socks.containsKey(sock)) {
                count = socks.get(sock) + 1;
            }
            socks.put(sock, count);
            if (count % 2 == 0) {
                sockPairs++;
            }

        }

        return sockPairs;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> integers = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        Sock.sockMerchant(integers.size(), integers);
    }
}
