class meth {
    int search(int arr[], int s, int e, int key) {
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

}

public class Binary {
    public static void main(String[] args) {
        meth obj = new meth();

        int[] arr = { 10, 20, 30, 40, 50 };

        int ans = obj.search(arr, 0, arr.length - 1, 50);

        if (ans != -1) {
            System.out.println("Key found on : " + ans + " index;");
        } else {
            System.out.println("Key is not found");
        }

    }
}
