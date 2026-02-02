class Example {
    public void show() {
        System.out.println("In example show");
    }
}

class Examples extends Example {
    @Override
    public void show() {
        System.out.println("In examples show");
    }
}

public class Annotation {
    public static void main(String[] args) {
        Examples ex = new Examples();
        ex.show();
    }
}
