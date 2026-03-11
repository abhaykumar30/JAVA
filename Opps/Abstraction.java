abstract class Ab {

    abstract void show();
}

class Bc extends Ab {
    void show() {
        System.out.println("In show");
    }
}

public class Abstraction {
    public static void main(String a[]) {
        Bc obj = new Bc();
        obj.show();
    }
}
