import java.util.*;

public class Sets {
    public static void main(String a[]) {
        System.out.println("HashSet is : ");

        Set<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(5);
        nums.add(65);
        nums.add(3);
        nums.add(58);

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("after removing");
        nums.remove(65);

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
