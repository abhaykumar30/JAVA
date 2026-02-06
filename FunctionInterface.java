@FunctionalInterface
interface InnerFunctionInterface {
    void show();
}

public class FunctionInterface {
    public static void main(String[] args) {
        InnerFunctionInterface obj = new InnerFunctionInterface() {
            public void show() {
                System.out.println("In show Method");
            }
        };
        obj.show();
    }
}