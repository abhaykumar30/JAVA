public class Avarage {

    static double Ave(int arr[]) {
        int count = 0;
        double sum = 0.0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        double s = sum / count;

        return s;
    }

    public static void main(String a[]) {
        int arr[] = { 0, 1, -2, 9, -9, -59, 82 };

        System.out.println("Average of Positive numbers : " + Ave(arr));

    }
}
