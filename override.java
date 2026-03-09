import Threads.A;
import Threads.B;

class A{
    A(){
        super();
        System.out.println("Example of Super keyword");
    }
    public void show(){
        System.out.println("In A show");
    }

    public void con(){
        System.out.println("In A can");
    }
}

class B extends A{
    //this show override A's show method.
    B(){
        super();
        System.out.println("Example of Super keyword");
    }
    public void show(){
        System.out.println("In B show");
    }
}

public class override {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.con();
    }
}
