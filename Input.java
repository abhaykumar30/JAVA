import java.io.*;
import java.util.*;

public class Input {
    public static void main(String[] args) throws IOException {

        // Input using System.in.read() to take single character input.

        // System.out.println("Enter the value : ");
        // int num = System.in.read();
        // System.out.println(num - 48);

        // Take Input using BufferedReader class.

        // System.out.println("Enter the value : ");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();

        // Take Input using Scanner class.

        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
    }
}
