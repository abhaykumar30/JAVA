public class Fibo {
    static int fibonaci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonaci(i) + " ");
        }
    }
}