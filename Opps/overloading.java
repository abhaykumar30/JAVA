
class cal {
    public int add(int n, int m) {
        return n + m;
    }

    // method overloding where method name is same but parameter are differnt
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class overloading {
    public static void main(String[] args) {
        cal obj = new cal();
        int a = obj.add(5, 6);
        int ab = obj.add(5, 6, 5);

        System.out.println("Add1 :- " + a + " Add2 :- " + ab);
    }
}
