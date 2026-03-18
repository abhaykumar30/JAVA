public class Linear {
    public static void main(String a[]) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 30) {
                System.out.println("Element found at index: " + i);
            }
        }
    }
}