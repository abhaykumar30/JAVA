/*Two sum -Pairs with 0 Sum */

import java.util.*;

public class sum {

    static ArrayList<Integer> findPairs(int arr[]) {
        int i = 0, j = arr.length - 1, sum = 0;

        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();

        while (i <= j) {
            sum = arr[i] + arr[j];
            ArrayList<Integer> pair = new ArrayList<>();

            if (sum == 0) {
                pair.add(arr[i]);
                pair.add(arr[j]);
                result.addAll(pair);

                // while (i < j && arr[i] == arr[i + 1])
                // i++;
                // while (i < j && arr[j] == arr[j - 1])
                // j--;

                i++;
                j--;
            } else if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, 1, 0, 5, -1, 2, -3 };

        ArrayList<Integer> result = findPairs(arr);

        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
