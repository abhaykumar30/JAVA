@FunctionalInterface
interface Lexpression {
    void show();
}

interface LRexpression {
    int show(int i, int j);
}

public class Lamda {
    public static void main(String[] args) {
        Lexpression obj = () -> System.out.println("In show method using Annonomation Class and also Lamda expression");

        obj.show();

        LRexpression obj1 = (i, j) -> i + j;

        int r = obj1.show(5, 4);
        System.out.println("The return value is : " + r);
    }
}
