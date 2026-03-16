public class Insertion {
    static void ArrPrint(int a[]) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static void Sort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };

        System.out.println("Array before sorting:");
        ArrPrint(arr);

        Sort(arr);

        System.out.println("\nArray after sorting:");
        ArrPrint(arr);
    }
}