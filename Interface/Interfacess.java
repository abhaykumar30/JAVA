
interface demo {
    void show();

    void congo();
}

class use implements demo {

    public void show() {
        System.out.println("In show");
    }

    public void congo() {
        System.out.println("In congo");
    }

}

public class Interfacess {
    public static void main(String[] args) {
        demo obj = new use();

        obj.show();
        obj.congo();
    }
}
