import java.util.*;

public class Lists {
    public static void main(String[] args) {
        System.out.println("Enter Array Values : ");

        // Collection<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i <= 5; i++) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            nums.add(n);
        }

        System.out.println(nums);
        System.out.println(nums.indexOf(7));
    }
}