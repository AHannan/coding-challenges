package prep.nisum;

public class Solution {

    //    Write a short program using recursion that prints a table of any given number and the given iterations.
    public static void main(String[] args) {
        printTable(2, 10);
    }

    private static void printTable(int table, int times) {
        printTable(table, times, times);
    }

    private static void printTable(int table, int times, int max) {
        if (times == 0) {
            return;
        }
        int i = max - times + 1;
        System.out.println(table + " x " + i + " = " + (table * i));
        printTable(table, --times, max);
    }

}
