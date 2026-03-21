import java.util.*;

public class IsPrime {
    static boolean Prime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (Prime(n) == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
