package ch.juventus.recursion;

public class Main {

    public static void main(String[] args) {

        int n = 45;

        long start = System.currentTimeMillis();
        long itrResult = itrFib(n);
        System.out.println("Result: " + itrResult);
        long end = System.currentTimeMillis();
        System.out.println("Iterative approach took " + (end - start) + "ms");

        start = System.currentTimeMillis();
        long recResult = recFib(n);
        System.out.println("Result: " + recResult);
        end = System.currentTimeMillis();
        System.out.println("Recursive approach took " + (end - start) + "ms");

    }

    private static long itrFib(int n) {
        long fib = 0;
        long prev = 1;
        for (int i = 0; i < n; i++) {
            long temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }

    private static long recFib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recFib(n-2) + recFib(n-1);
        }
    }

}