
class first {
    void show() {
        System.out.println("In outer show");
    }

    class second {
        void aolo() {
            System.out.println("In inner show");
        }
    }
}

public class inner {
    public static void main(String a[]) {
        first obj = new first();
        obj.show();

        first.second obj1 = obj.new second();
        obj1.aolo();

        System.out.println("Abhay");
    }
}
