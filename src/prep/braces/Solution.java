package prep.braces;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here
        System.out.print(s+"-");
        
        Stack<Character> stack = new Stack<>();
        char [] array = s.toCharArray();

        Map<Character, Character> post = new HashMap<>();
        post.put('}', '{');
        post.put(')', '(');
        post.put(']', '[');

        for (int i =0;i < s.length(); i++) {
            char c = array[i];
            if (post.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != post.get(c)) {
                    return "NO";
                }
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(isBalanced("}{()()"));
        System.out.println(isBalanced("[()()]"));
        System.out.println(isBalanced("{}()()"));
        System.out.println(isBalanced("[{()}()]"));
        System.out.println(isBalanced("[{()}(]"));
        System.out.println(isBalanced("["));
    }
}
