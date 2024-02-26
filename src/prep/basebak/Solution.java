package prep.basebak;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();

        boolean isAnagram = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                int valueA = 0;
                String keyA = String.valueOf(a.charAt(i)).toLowerCase();
                if (mapA.containsKey(keyA)) {
                    valueA = mapA.get(keyA);
                    mapA.remove(keyA);
                }
                mapA.put(keyA, ++valueA);

                int valueB = 0;
                String keyB = String.valueOf(b.charAt(i)).toLowerCase();
                if (mapB.containsKey(keyB)) {
                    valueB = mapB.get(keyB);
                    mapB.remove(keyB);
                }
                mapB.put(keyB, ++valueB);
            }
            for (int i = 0; i < a.length(); i++) {
                String keyA = String.valueOf(a.charAt(i)).toLowerCase();
                if (!mapA.get(keyA).equals(mapB.get(keyA))) {
                    isAnagram = false;
                    break;
                }
            }

        } else {
            isAnagram = false;
        }

        return isAnagram;


    }

    public static void main(String[] args) {
//        System.out.println((isAnagram("anagram", "margana")) ? "Anagrams" : "Not Anagrams");
//        System.out.println((isAnagram("anagraa", "marganb")) ? "Anagrams" : "Not Anagrams");
        System.out.println((isAnagram("anagraM", "marganA")) ? "Anagrams" : "Not Anagrams");
    }
}
