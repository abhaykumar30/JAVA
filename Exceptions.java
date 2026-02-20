class AbhayException extends Exception {
    public AbhayException(String string) {
        super(string);
    }
}

public class Exceptions {
    public static void main(String a[]) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j <= 0) {
                throw new AbhayException("I think you use wrong calculation!");
            }
        } catch (AbhayException e) {
            System.out.println("Kuch to garbar hai." + e);
        } catch (Exception e) {
            System.out.println("Somthing went wrong..." + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
