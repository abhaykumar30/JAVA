public class Binary {
    public static int search(int arr[], int s, int e, int key) {

        // Noraml binary Search
        // while (s <= e) {
        // int mid = (s + e) / 2;
        // if (arr[mid] == key) {
        // return mid;
        // } else if (arr[mid] < key) {
        // s = mid + 1;
        // } else {
        // e = mid - 1;
        // }
        // }
        // return -1;

        // Recursion
        int result = -1;
        if (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                result = mid;
            } else if (arr[mid] < key) {
                result = search(arr, mid + 1, e, key);
            } else {
                result = search(arr, s, mid - 1, key);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        int ans = search(arr, 0, arr.length - 1, 50);

        if (ans != -1) {
            System.out.println("Key found on : " + ans + " index;");
        } else {
            System.out.println("Key is not found");
        }

    }
}
