public class Selection {
    static void ArrPrint(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void Sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void main(String[] ag) {
        int[] a = { 2, 8, 3, 5, 7, 6 };

        System.out.print("Array before sorting: ");
        ArrPrint(a);

        Sort(a);

        System.out.print("\nArray after sorting: ");
        ArrPrint(a);
    }
}
