public class Bubble {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 2, 4, 5, 9 };

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("Array after Sorting: ");
        Sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // bubble sort is the simplest sorting algorithm that works by repeatedly
    // swapping the adjacent elements if they are in wrong order.
    public static void Sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
