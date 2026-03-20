public class EvenString {
    public static void main(String[] args) {
        String str = "AbhayKumarRajpoot";

        String result = check(str);
        System.out.println(result);
    }

    public static String check(String str) {
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                s.append(str.charAt(i));
            }else {
                s1.append(str.charAt(i));
            }
        }
        return "Even: " + s.toString() + ", Odd: " + s1.toString();
    }
}