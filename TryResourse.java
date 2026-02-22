import java.io.*;

public class TryResourse {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int j = 5;
        // 2 step -> BufferedReader bf = null;

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            // 3 step -> InputStreamReader in = new InputStreamReader(System.in);
            // 4th step -> bf = new BufferedReader(new InputStreamReader(System.in));
            j = Integer.parseInt(bf.readLine());
            // 1 step -> bf.close();
        } finally {
            System.out.println("all good");
            // 5 step -> bf.close();
        }
        System.out.println(j);
    }
}
